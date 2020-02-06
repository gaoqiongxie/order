package com.order.service.impl;

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
import com.oms.model.po.OrderDetailPO;
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
	
	private static final int del_status = 0;
	private static final int disuse_status= 100;
	private static final int sucess_status= 1;

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
			if(orderStatus==del_status||orderStatus==disuse_status) {
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
		return sucess_status;
	}
	
	/**
	 * 新增表数据
	 * @param orderRentDTO
	 */
	private void insertOrderData(OrderRentDTO orderRentDTO) {
		if(0==orderRentDTO.getId()) {
			//更新基础表，返回主键Id
			syncOrderOmsDao.insertOrderRentDTO(orderRentDTO.getOrderBasePO());
			logger.info("更新基础表，返回主键Id: "+ orderRentDTO.getOrderBasePO().getId());
			orderRentDTO.setId(orderRentDTO.getOrderBasePO().getId());
		}
		if(null != orderRentDTO.getOrderDetailPO()) {
			List<OrderDetailPO> orderDetialPOs = orderRentDTO.getOrderDetailPO();
			for (OrderDetailPO orderDetailPO : orderDetialPOs) {
				orderDetailPO.setOrderId(orderRentDTO.getId());
				BaseUtil.objNullSetDefault(orderDetailPO);
				syncOrderOmsDao.insertOrderDetailPO(orderDetailPO);
			}
		}
	}

	/**
	 * TODO 全量更新表数据
	 * @param orderRentDTO
	 */
	private void updateOrderData(OrderRentDTO orderRentDTO) {
		//更新表数据
		if(null != orderRentDTO.getOrderDetailPO()) {
			List<OrderDetailPO> orderDetialPOs = orderRentDTO.getOrderDetailPO();
			for (OrderDetailPO orderDetailPO : orderDetialPOs) {
				orderDetailPO.setOrderId(orderRentDTO.getId());
				syncOrderOmsDao.updateOrderDetailPODynamic(orderDetailPO);
			}
		}
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
