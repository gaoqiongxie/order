package com.order.service.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.base.BaseUtil;
import com.oms.model.dto.OrderRentDTO;
import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderCashCouponPO;
import com.oms.model.po.OrderChangeInfoPO;
import com.oms.model.po.OrderContactAntiFraudPO;
import com.oms.model.po.OrderContactPO;
import com.oms.model.po.OrderContractRecoverReviewStatusPO;
import com.oms.model.po.OrderCustomerCreditPO;
import com.oms.model.po.OrderDetailDataPO;
import com.oms.model.po.OrderDetailPO;
import com.oms.model.po.OrderOtherCostPO;
import com.oms.model.po.OrderPaySchedulePO;
import com.oms.model.po.OrderRiskManagementPO;
import com.oms.model.po.OrderSparePartsDetailPO;
import com.order.annotation.DataSourceType;
import com.order.constants.DataSourceConstants;
import com.order.dao.SyncOrderErpDao;
import com.order.dao.SyncOrderOmsDao;
import com.order.service.ERPOrderRentService;


@Service
@Component("eRPOrderRentService")
@DataSourceType(value = DataSourceConstants.DATASOURCE_ORACLE)
public class ERPOrderRentServiceImpl implements ERPOrderRentService {
	
	@Autowired
	SyncOrderOmsDao syncOrderOmsDao;
	@Autowired
	SyncOrderErpDao syncOrderErpDao;

	private static Logger logger = Logger.getLogger(ERPOrderRentServiceImpl.class);
	
	@Override
	public OrderRentDTO getDTOByOrderId(int orderId) {
		//查询是否有该订单
		OrderRentDTO orderRentDTO = new OrderRentDTO();
		OrderBasePO orderBase = syncOrderErpDao.getOrderBaseByOrderId(orderId);
		logger.info("ERP QUERY 租赁订单基础:"+(null==orderBase.getNo()?null:JSON.toJSON(orderBase)));
		orderRentDTO.setOrderBasePO(null==orderBase.getNo()?null:orderBase);
		
		//TODO 整体数据抓取基表之外的数据
		// 详细订单明细
		List<OrderDetailPO> orderDetialPOs = syncOrderErpDao.listOrderDetailByOrderId(orderId);
		logger.info("ERP QUERY 详细订单明细:"+(orderDetialPOs.isEmpty()?null:JSON.toJSON(orderDetialPOs)));
		orderRentDTO.setOrderDetailPO(orderDetialPOs.isEmpty()?null:orderDetialPOs);
		
		// 租赁订单明细数据 
		List<OrderDetailDataPO> orderDetailDataPOs = syncOrderErpDao.listOrderDetailDataByOrderId(orderId);
		orderRentDTO.setOrderDetailDataPO(orderDetailDataPOs.isEmpty()?null:orderDetailDataPOs);
		logger.info("ERP QUERY 租赁订单明细数据:"+(orderDetailDataPOs.isEmpty()?null:JSON.toJSON(orderDetailDataPOs)));
		
		//租赁订单备件明细
		List<OrderSparePartsDetailPO> orderSparePartsDetailPOs = syncOrderErpDao.listOrderSparePartsDetailByOrderId(orderId);
		orderRentDTO.setOrderSparePartsDetailPO(orderSparePartsDetailPOs.isEmpty()?null:orderSparePartsDetailPOs);
		logger.info("ERP QUERY 租赁订单备件明细:"+(orderSparePartsDetailPOs.isEmpty()?null:JSON.toJSON(orderSparePartsDetailPOs)));
		
		//租赁订单联系人
		List<OrderContactPO> orderContactPOs = syncOrderErpDao.listOrderContactByOrderId(orderId);
		orderRentDTO.setOrderContactPO(orderContactPOs.isEmpty()?null:orderContactPOs);
		logger.info("ERP QUERY 租赁订单联系人:"+(orderContactPOs.isEmpty()?null:JSON.toJSON(orderContactPOs)));
		
		//租赁订单客户资信
		List<OrderCustomerCreditPO> orderCustomerCreditPOs = syncOrderErpDao.listOrderCustomerCreditByOrderId(orderId);
		orderRentDTO.setOrderCustomerCreditPO(orderCustomerCreditPOs.isEmpty()?null:orderCustomerCreditPOs);
		logger.info("ERP QUERY 租赁订单客户资信:"+(orderCustomerCreditPOs.isEmpty()?null:JSON.toJSON(orderCustomerCreditPOs)));

		//租赁订单风险管理
		List<OrderRiskManagementPO> orderRiskManagementPOs = syncOrderErpDao.listOrderRiskManagementByOrderId(orderId);
		orderRentDTO.setOrderRiskManagementPO(orderRiskManagementPOs.isEmpty()?null:orderRiskManagementPOs);
		logger.info("ERP QUERY 租赁订单风险管理:"+(orderRiskManagementPOs.isEmpty()?null:JSON.toJSON(orderRiskManagementPOs)));
		
		//租赁订单联系人反欺诈
		List<OrderContactAntiFraudPO> orderContactAntiFraudPOs = syncOrderErpDao.listOrderContactAntiFraudByOrderId(orderId);
		orderRentDTO.setOrderContactAntiFraudPO(orderContactAntiFraudPOs.isEmpty()?null:orderContactAntiFraudPOs);
		logger.info("ERP QUERY 租赁订单联系人反欺诈:"+(orderContactAntiFraudPOs.isEmpty()?null:JSON.toJSON(orderContactAntiFraudPOs)));
		
		//租赁订单其他费用
		List<OrderOtherCostPO> orderOtherCostPOs = syncOrderErpDao.listOrderOtherCostByOrderId(orderId);
		orderRentDTO.setOrderOtherCostPO(orderOtherCostPOs.isEmpty()?null:orderOtherCostPOs);
		logger.info("ERP QUERY 租赁订单其他费用:"+(orderOtherCostPOs.isEmpty()?null:JSON.toJSON(orderOtherCostPOs)));

		//租赁订单支付进度
		List<OrderPaySchedulePO> orderPaySchedulePOs = syncOrderErpDao.listOrderPaySchedulePOByOrderId(orderId);
		orderRentDTO.setOrderPaySchedulePO(orderPaySchedulePOs.isEmpty()?null:orderPaySchedulePOs);
		logger.info("ERP QUERY 租赁订单支付进度:"+(orderPaySchedulePOs.isEmpty()?null:JSON.toJSON(orderPaySchedulePOs)));

		//租赁订单代金券
		List<OrderCashCouponPO> orderCashCouponPOs = syncOrderErpDao.listOrderCashCouponPOByOrderId(orderId);
		orderRentDTO.setOrderCashCouponPO(orderCashCouponPOs.isEmpty()?null:orderCashCouponPOs);
		logger.info("ERP QUERY 租赁订单代金券:"+(orderCashCouponPOs.isEmpty()?null:JSON.toJSON(orderCashCouponPOs)));

		//租赁订单信息变更
		List<OrderChangeInfoPO> orderChangeInfoPOs = syncOrderErpDao.listOrderChangeInfoPOByOrderId(orderId);
		orderRentDTO.setOrderChangeInfoPO(orderChangeInfoPOs.isEmpty()?null:orderChangeInfoPOs);
		logger.info("ERP QUERY 租赁订单信息变更:"+(orderChangeInfoPOs.isEmpty()?null:JSON.toJSON(orderChangeInfoPOs)));

		//租赁订单合同回收状态复核信息
		List<OrderContractRecoverReviewStatusPO> orderContractRecoverReviewStatusPOs = syncOrderErpDao.listOrderContractRecoverReviewStatusPOByOrderId(orderId);
		orderRentDTO.setOrderContractRecoverReviewStatusPO(orderContractRecoverReviewStatusPOs.isEmpty()?null:orderContractRecoverReviewStatusPOs);
		logger.info("ERP QUERY 租赁订单合同回收状态复核信息:"+(orderContractRecoverReviewStatusPOs.isEmpty()?null:JSON.toJSON(orderContractRecoverReviewStatusPOs)));

		
		if(BaseUtil.objCheckIsNull(orderRentDTO)) {
			logger.info("ERP QUERY 查询该订单为空，billId= "+ orderId);
			return null;
		}
		return orderRentDTO;
	}

	@Override
	public List<OrderDetailPO> listOrderDetailByOrderId(int orderId) {
		List<OrderDetailPO> orderDetialPOs = syncOrderErpDao.listOrderDetailByOrderId(orderId);
		logger.info("ERP QUERY 详细订单明细:"+(orderDetialPOs.isEmpty()?null:JSON.toJSON(orderDetialPOs)));
		return orderDetialPOs;
	}
	
	

}
