package com.order.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.base.BaseUtil;
import com.oms.model.dto.OrderRentDTO;
import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderDetailDataPO;
import com.oms.model.po.OrderDetailPO;
import com.oms.model.po.OrderOmsSyncPO;
import com.order.dao.SyncOrderOmsDao;
import com.order.service.ERPOrderRentService;
import com.order.service.OMSOrderRentService;

@Service
@Component("oMSOrderRentService")
public class OMSOrderRentServiceImpl implements OMSOrderRentService {
	private static Logger logger = Logger.getLogger(OMSOrderRentServiceImpl.class);
	
	@Autowired
	SyncOrderOmsDao syncOrderOmsDao;
	@Autowired
	ERPOrderRentService eRPOrderRentService;
	
	private static final int order_base_del_status = -1;
	private static final int order_base_disuse_status= 100;
	private static final int resp_sucess_status= 1;
	/** ERP订单变更同步状态 0-待抽取*/
	private static final int sync_wait_status = 0;
	/** ERP订单变更同步状态 1-已抽取*/
	private static final int sync_done_status = 1;

	

	@Override
	public int sync(int id, int orderStatus) {
		//设置更新或者新增 flag
		Boolean existFlag = false;
		//查询 OMS 中是否有该订单; flag设值
		OrderBasePO orderBaseOMS = getOrderBaseByErpId(id);
		if(null!=orderBaseOMS) {
			existFlag = true;
		}
		
		//调用 ERP 获取 orderRent 数据
		OrderRentDTO orderRentERP = eRPOrderRentService.getDTOByOrderId(id);
		logger.info("OrderRentDTO： "+JSON.toJSON(orderRentERP));
		
		//判断数据是否 null
		if(null==orderRentERP) {
			logger.info("ERP 库中不存在该租赁订单，故无法同步，billId = "+ id);
			//TODO 抛出异常
			return 0;
		}
		//根据 flag 进行OMS 数据库保存
		if(existFlag) {
			//更新
			//判断orderStatus，删除或者已废弃，直接更新Mysql中订单主表状态为已删除
			if(orderStatus==order_base_del_status||orderStatus==order_base_disuse_status) {
				OrderBasePO basePO = new OrderBasePO();
				basePO.setStatus(orderStatus);
				basePO.setId(orderBaseOMS.getId());
				updateOrderBasePODynamic(basePO);
			}else {
				orderRentERP.setId(orderBaseOMS.getId());
				updateOrderData(orderRentERP);
			}
		}else {
			insertOrderData(orderRentERP);
		}
//		order_oms_sync
		insertSync(id, orderRentERP.getOrderBasePO().getNo());
		
		
		return resp_sucess_status;
	}
	
	/**
	 * 同步信息记录
	 * @param id
	 * @param no
	 */
	private void insertSync(int id, String no) {
		OrderOmsSyncPO orderOmsSyncPO = new OrderOmsSyncPO();
		orderOmsSyncPO.setErpId(id);
		orderOmsSyncPO.setNo(no);
/*		if(null==syncOrderOmsDao.findOrderOmsSyncPO(orderOmsSyncPO)) {
			orderOmsSyncPO.setStatus(sync_done_status);
			orderOmsSyncPO.setRemark("");
			syncOrderOmsDao.insertOrderOmsSyncPO(orderDetailPO);
		}else {
			orderOmsSyncPO.setStatus(sync_done_status);
			syncOrderOmsDao.updateOrderOmsSyncPODynamic(orderDetailPO);
		}*/
	}

	/**
	 * 新增表数据
	 * @param orderRentDTO
	 */
	private void insertOrderData(OrderRentDTO orderRentDTO) {
		logger.info("新增表数据");
		if(0==orderRentDTO.getId()) {
			//更新基础表，返回主键Id
//			syncOrderOmsDao.insertOrderRentDTO(orderRentDTO.getOrderBasePO());
//			logger.info("更新基础表，返回主键Id: "+ orderRentDTO.getOrderBasePO().getId());
//			orderId = orderRentDTO.getOrderBasePO().getId();
//			orderRentDTO.setId(orderId);
			orderRentDTO.setId(-1);
			
		}
		updateOrderData(orderRentDTO);
	}

	/**
	 * TODO 全量更新表数据
	 * 有则更新无则新增
	 * @param orderRentDTO
	 */
	private void updateOrderData(OrderRentDTO orderRentDTO) {
		//更新表数据
		logger.info("全量更新表数据");
		//order_base id
		Integer orderId = orderRentDTO.getId();
		if(null != orderRentDTO.getOrderDetailPO()) {
			List<OrderDetailPO> orderDetialPOs = orderRentDTO.getOrderDetailPO();
			OrderDetailPO detailPO = null;
			for (OrderDetailPO orderDetailPO : orderDetialPOs) {
				orderDetailPO.setOrderId(orderRentDTO.getId());
				
				BaseUtil.objNullSetDefault(orderDetailPO);
				
				detailPO = new OrderDetailPO();
				detailPO.setErpBilldtlId(orderDetailPO.getErpBilldtlId());
				
				if(null==syncOrderOmsDao.findOneOrderDetailPO(detailPO)) {
					orderDetailPO.setOrderId(orderId);
					syncOrderOmsDao.insertOrderDetailPO(orderDetailPO);
				}else {
					syncOrderOmsDao.updateOrderDetailPODynamic(orderDetailPO);
				}
				
			}
		}
		
		List<Integer> erpBilldtlIds = null;
		if(null != orderRentDTO.getOrderDetailDataPO()) {
			erpBilldtlIds = new ArrayList<Integer>();
			List<OrderDetailDataPO> orderDetailDataPOs = orderRentDTO.getOrderDetailDataPO();
			OrderDetailDataPO detailDataPO = null;
			for (OrderDetailDataPO orderDetailDataPO : orderDetailDataPOs) {
				erpBilldtlIds.add(orderDetailDataPO.getErpBilldtlId());
				orderDetailDataPO.setOrderId(orderId);
				
				detailDataPO = new OrderDetailDataPO();
				detailDataPO.setErpBilldtlId(orderDetailDataPO.getErpBilldtlId());
				
				if(null==syncOrderOmsDao.findOneOrderDetailDataPO(detailDataPO)) {
					BaseUtil.objNullSetDefault(orderDetailDataPO);
					syncOrderOmsDao.insertOrderDetailDataPO(orderDetailDataPO);
				}else {
					syncOrderOmsDao.updateOrderDetailDataPODynamic(orderDetailDataPO);
				}
			}
		}
		//更新订单详细数据表中 OMS 租赁订单明细ID
		syncOrderOmsDao.updateOrderDtlOmsId(erpBilldtlIds);
		
	}
	

	private OrderBasePO getOrderBaseByErpId(int erpId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("erpId", erpId);
		map.put("dataLimit", 1);
		OrderBasePO orderBasePO = syncOrderOmsDao.findOrderBasePODynamic(map);
		if(null==orderBasePO||null==orderBasePO.getId()) {
			return null;
		}
		return orderBasePO;
	}

	private int updateOrderBasePODynamic(OrderBasePO basePO) {
		return syncOrderOmsDao.updateOrderBasePODynamic(basePO);
	}

	

}
