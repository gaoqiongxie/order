package com.order.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.base.BaseUtil;
import com.oms.model.dto.OrderBaseDTO;
import com.oms.model.dto.OrderDetailDTO;
import com.oms.model.dto.OrderDetailDataDTO;
import com.oms.model.dto.OrderRentDTO;
import com.order.dao.SyncOrderOmsDao;
import com.order.service.ERPOrderRentService;
import com.order.service.OMSOrderRentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Component("oMSOrderRentService")
@Slf4j
public class OMSOrderRentServiceImpl implements OMSOrderRentService {

	@Autowired
	SyncOrderOmsDao syncOrderOmsDao;
	@Autowired
	ERPOrderRentService erpOrderRentService;

	private static final int resp_sucess_status = 1;
	/** ERP订单变更同步状态 0-待抽取 */
	@SuppressWarnings("unused")
	private static final int sync_wait_status = 0;
	/** ERP订单变更同步状态 1-已抽取 */
	@SuppressWarnings("unused")
	private static final int sync_done_status = 1;

	@Override
	public int sync(int erpId, int orderStatus) throws Exception {
		// 调用 ERP 获取 orderRent 数据
		OrderRentDTO orderRentERP = erpOrderRentService.getDTOByOrderId(erpId);
		if (isExceptionStatus(erpId, orderStatus, orderRentERP)) {
			log.info("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
			throw new Exception("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
		}

		OrderBaseDTO orderBase = getOrderBaseByErpId(erpId);
		if(null==orderBase||null==orderBase.getId()) {
			insertOrderData(orderRentERP);
		}else {
			orderRentERP.setId(orderBase.getId());
			updateOrderData(orderRentERP);
		}
		
		return resp_sucess_status;
	}

	/**
	 * 异常判断
	 * @param erpId
	 * @param orderStatus
	 * @param orderRentERP
	 * @return
	 */
	private boolean isExceptionStatus(int erpId, int orderStatus, OrderRentDTO orderRentERP) {
		return false;
	}

	/**
	 * 同步信息记录
	 * 待抽取-已抽取-异常
	 * 用于定时任务
	 * @param erpId
	 * @param no
	 */
	@SuppressWarnings("unused")
	private void insertSync(int erpId, String no) {
		//TODO 记录同步信息
	}

	/**
	 * 新增表数据
	 * 
	 * @param orderRentDTO
	 * @return
	 */
	private Integer insertOrderData(OrderRentDTO orderRentDTO) {
		log.info("新增表数据, order_base erp_id: " + orderRentDTO.getOrderBaseDTO().getErpId());
		// 更新基础表，返回主键Id
		OrderBaseDTO orderBasePO = orderRentDTO.getOrderBaseDTO();
		syncOrderOmsDao.insertOrderBaseDTO(orderBasePO);

		orderRentDTO.setId(orderBasePO.getId());
		log.info("更新基础表，返回主键Id: " + orderBasePO.getId());

		updateOrderData(orderRentDTO);

		return orderBasePO.getId();
	}

	/**
	 * TODO 全量更新表数据 有则更新无则新增
	 * 
	 * @param orderRentDTO
	 */
	private void updateOrderData(OrderRentDTO orderRentDTO) {
		// 更新表数据
		log.info("全量更新表数据, orderRentDTO:" + JSON.toJSON(orderRentDTO));
		Integer orderId = orderRentDTO.getId();
		/** ----------------- order base start ----------------- */
		if (null != orderRentDTO.getOrderBaseDTO()) {
			saveOrUpdateOrderBasePO(orderId, orderRentDTO.getOrderBaseDTO());
		}

		/** ----------------- order base end ----------------- */

		/** ----------------- order other start ----------------- */
		saveOrUpdateOrderDetailPO(orderId, orderRentDTO.getOrderDetailList());

		saveOrUpdateOrderDetailDataPO(orderId, orderRentDTO.getOrderDetailDataList());

		/** ----------------- order other end ----------------- */

	}

	/**
	 * 订单详情数据
	 * 
	 * @param orderId
	 * @param orderDetailDataList
	 */
	private void saveOrUpdateOrderDetailDataPO(Integer orderId, List<OrderDetailDataDTO> orderDetailDataList) {
	}

	/**
	 * 订单详情
	 * 
	 * @param orderId
	 * @param orderDetailList
	 */
	private void saveOrUpdateOrderDetailPO(Integer orderId, List<OrderDetailDTO> orderDetailList) {
		List<Integer> erpBilldtlIdOMS = ListUtils.defaultIfNull(syncOrderOmsDao.getErpBilldtlIds(orderId),new ArrayList<>());
		List<Integer> erpBilldtlIdERP = orderDetailList.stream().map(OrderDetailDTO::getErpBilldtlId).collect(Collectors.toList());
		log.info("订单明细, orderId:{}, erpBilldtlIdOMS:{}, erpBilldtlIdERP:{}", orderId, erpBilldtlIdOMS, erpBilldtlIdERP);
		//ERP-OMS：ERP对OMS的差集，erp中存在但oms不存在，需要删除
		List<Integer> erpDeletedIds = erpBilldtlIdOMS.stream().filter(item -> !erpBilldtlIdERP.contains(item)).collect(Collectors.toList());
		//ERP ∩ OMS：ERP和OMS的交集，需要修改
		List<Integer> omsExistingIds = erpBilldtlIdOMS.stream().filter(item -> erpBilldtlIdERP.contains(item)).collect(Collectors.toList());
		log.info("订单明细, 需删除id集合：{}, 需更新的id集合:{}", erpDeletedIds, omsExistingIds);
		
		if(CollectionUtils.isNotEmpty(erpDeletedIds)) {
			syncOrderOmsDao.deleteByErpBilldtlIds(erpDeletedIds);
		}
		for (OrderDetailDTO orderDetailPO : orderDetailList) {
			orderDetailPO.setOrderId(orderId);
//			OmsUtil.objNullSetDefault(orderDetailPO);
			
			if(omsExistingIds.contains(orderDetailPO.getErpBilldtlId())) {
				syncOrderOmsDao.updateOrderDetailPODynamic(orderDetailPO);
			}else {
				syncOrderOmsDao.insertOrderDetailPO(orderDetailPO);
			}
		}
	}

	private void saveOrUpdateOrderBasePO(Integer orderId, OrderBaseDTO orderBaseDTO) {
		BaseUtil.objNullSetDefault(orderBaseDTO);
		orderBaseDTO.setId(orderId);
		syncOrderOmsDao.updateOrderBasePODynamic(orderBaseDTO);
	}

	private OrderBaseDTO getOrderBaseByErpId(int erpId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("erpId", erpId);
		map.put("dataLimit", 1);
		OrderBaseDTO orderBasePO = syncOrderOmsDao.findOrderBasePODynamic(map);
		if (null == orderBasePO || null == orderBasePO.getId()) {
			return null;
		}
		return orderBasePO;
	}

	/**
	 * 特殊状态不需要获取数据
	 * 比如：删除
	 * @param basePO
	 * @return
	 */
	@SuppressWarnings("unused")
	private int updateOrderBasePODynamic(OrderBaseDTO basePO) {
		return syncOrderOmsDao.updateOrderBasePODynamic(basePO);
	}

}
