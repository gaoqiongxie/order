package com.order.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.base.BaseUtil;
import com.oms.model.dto.OrderBaseDTO;
import com.oms.model.dto.OrderDetailDTO;
import com.oms.model.dto.OrderDetailDataDTO;
import com.oms.model.dto.OrderOmsSyncDTO;
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

	private static final int order_base_del_status = -1;
	private static final int order_base_disuse_status = 100;
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
		if (null == orderRentERP || null == orderRentERP.getOrderBaseDTO()) {
			log.info("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
			throw new Exception("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
		}
		log.info("OrderRentDTO： " + JSON.toJSON(orderRentERP));

		/*
		// 设置更新或者新增 flag
		Boolean existFlag = false;
		Integer omsId = null;
		OrderBaseDTO orderBaseOMS = getOrderBaseByErpId(erpId);
		if (null != orderBaseOMS) {
			existFlag = true;
			omsId = orderBaseOMS.getId();
		}

		// 根据 flag 进行OMS 数据库保存
		if (existFlag) {
			// 判断orderStatus，删除或者已废弃，直接更新Mysql中订单主表状态为已删除
			if (orderStatus == order_base_del_status || orderStatus == order_base_disuse_status) {
				// TODO 删除状态
				OrderBaseDTO queryPO = OrderBaseDTO.builder().status(orderStatus).id(omsId).build();
				updateOrderBasePODynamic(queryPO);
			} else {
				orderRentERP.setId(omsId);
				updateOrderData(orderRentERP);
			}
		} else {
			omsId = insertOrderData(orderRentERP);
		}

		insertSync(erpId, orderRentERP.getOrderBaseDTO().getNo());
*/
		return resp_sucess_status;
	}

	/**
	 * 同步信息记录
	 * 
	 * @param erpId
	 * @param no
	 */
	private void insertSync(int erpId, String no) {

		OrderOmsSyncDTO orderOmsSyncDTO = new OrderOmsSyncDTO();
		orderOmsSyncDTO.setErpId(erpId);
		orderOmsSyncDTO.setNo(no);
//		OrderOmsSyncDTO po = syncOrderOmsDao.findOne(orderOmsSyncDTO);
//		if (null == po) {
//			orderOmsSyncDTO.setStatus(sync_done_status);
//			orderOmsSyncDTO.setRemark("新增");
//			syncOrderOmsDao.insertDynamic(orderOmsSyncDTO); //
//			orderOmsSyncDao.insert(orderOmsSyncPO);
//		} else {
//			orderOmsSyncDTO.setRemark("更新");
//			orderOmsSyncDTO.setStatus(sync_done_status);
//			orderOmsSyncDTO.setId(po.getId());
//			syncOrderOmsDao.updateDynamic(orderOmsSyncDTO);
//		}

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
		// TODO 有无逾期
		orderBasePO.setOverdue(0);
		BaseUtil.objNullSetDefault(orderBasePO);

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
		// oms:mysql rder_base id
		Integer orderId = orderRentDTO.getId();
		/** ----------------- order base start ----------------- */
		if (null != orderRentDTO.getOrderBaseDTO()) {
			saveOrUpdateOrderBasePO(orderId, orderRentDTO.getOrderBaseDTO());
		}

		/** ----------------- order base end ----------------- */

		/** ----------------- order other start ----------------- */
		if (CollectionUtils.isNotEmpty(orderRentDTO.getOrderDetailList())) {
			saveOrUpdateOrderDetailPO(orderId, orderRentDTO.getOrderDetailList());
		}

		if (CollectionUtils.isNotEmpty(orderRentDTO.getOrderDetailDataList())) {
			saveOrUpdateOrderDetailDataPO(orderId, orderRentDTO.getOrderDetailDataList());
		}

		/** ----------------- order other end ----------------- */

	}

	/**
	 * 订单详情数据
	 * 
	 * @param orderId
	 * @param orderDetailDataList
	 */
	private void saveOrUpdateOrderDetailDataPO(Integer orderId, List<OrderDetailDataDTO> orderDetailDataList) {
		// 根据 orderId 查询存在的 oms 中 存在erpBilldtlId
		List<Integer> erpBilldtlIdOMS = syncOrderOmsDao.getErpBilldtlIds(orderId);
		// 对比 orderDetialPOs 中的 erpBilldtlId
		List<Integer> erpBilldtlIdERP = orderDetailDataList.stream().map(OrderDetailDataDTO::getErpBilldtlId)
				.collect(Collectors.toList());
		// 删除 oms 中 不存在的数据(erpBilldtlIdOMS - erpBilldtlIdERP)
		List<Integer> reduceIds = erpBilldtlIdOMS.stream().filter(item -> !erpBilldtlIdERP.contains(item))
				.collect(Collectors.toList());
		if (CollectionUtils.isNotEmpty(reduceIds)) {
			// 删除
		}

		// 有则更新无则新增

		// 更新订单详细数据表中 OMS 租赁订单明细ID
		syncOrderOmsDao.updateOrderDtlOmsId(erpBilldtlIdERP);
	}

	/**
	 * 订单详情
	 * 
	 * @param orderId
	 * @param orderDetailList
	 */
	private void saveOrUpdateOrderDetailPO(Integer orderId, List<OrderDetailDTO> orderDetailList) {
		// 根据 orderId 查询存在的 oms 中 存在erpBilldtlId
		List<Integer> erpBilldtlIdOMS = syncOrderOmsDao.getErpBilldtlIds(orderId);
		// 对比 orderDetialPOs 中的 erpBilldtlId
		List<Integer> erpBilldtlIdERP = orderDetailList.stream().map(OrderDetailDTO::getErpBilldtlId)
				.collect(Collectors.toList());
		// 删除 oms 中 不存在的数据(erpBilldtlIdOMS - erpBilldtlIdERP)
		List<Integer> reduceIds = erpBilldtlIdOMS.stream().filter(item -> !erpBilldtlIdERP.contains(item))
				.collect(Collectors.toList());
		if (CollectionUtils.isNotEmpty(reduceIds)) {
			syncOrderOmsDao.deleteByErpBilldtlIds(reduceIds);
		}
		OrderDetailDTO queryDTO = null;
		for (OrderDetailDTO orderDetailDTO : orderDetailList) {
			orderDetailDTO.setOrderId(orderId);
			BaseUtil.objNullSetDefault(orderDetailDTO);

			queryDTO = syncOrderOmsDao.findOneOrderDetailPO(
					OrderDetailDTO.builder().erpBilldtlId(orderDetailDTO.getErpBilldtlId()).build());
			if (null == queryDTO) {
				syncOrderOmsDao.insertOrderDetailPO(orderDetailDTO);
			} else {
				orderDetailDTO.setId(queryDTO.getId());
				syncOrderOmsDao.updateOrderDetailPODynamic(orderDetailDTO);
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

	private int updateOrderBasePODynamic(OrderBaseDTO basePO) {
		return syncOrderOmsDao.updateOrderBasePODynamic(basePO);
	}

}
