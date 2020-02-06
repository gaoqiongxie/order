package com.order.dao;

import java.util.List;
import java.util.Map;

import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderDetailDataPO;
import com.oms.model.po.OrderDetailPO;

public interface SyncOrderOmsDao {

	OrderBasePO findOrderBasePODynamic(Map<String, Object> map);

	int updateOrderBasePODynamic(OrderBasePO basePO);

	int insertOrderRentDTO(OrderBasePO orderBasePO);

//	int insertOrUpdateOrderBaseAddressPO(OrderBaseAddressPO orderBaseAddressPO);
//
//	int insertOrUpdateOrderBaseChangePO(OrderBaseChangePO orderBaseChangePO);
//
//	int insertOrUpdateOrderBaseExtendPO(OrderBaseExtendPO orderBaseExtendPO);
//
//	int insertOrUpdateOrderBasePO(OrderBasePO orderBasePO);
//
//	int insertOrUpdateOrderBaseRiskPO(OrderBaseRiskPO orderBaseRiskPO);
//
//	int insertOrUpdateOrderBaseSystemPO(OrderBaseSystemPO orderBaseSystemPO);

//	int insertOrUpdateOrderCashCouponPO(OrderCashCouponPO orderCashCouponPO);
//
//	int insertOrUpdateOrderChangeInfoPO(OrderChangeInfoPO	orderChangeInfoPO);
//
//	int insertOrUpdateOrderContactAntiFraudPO(OrderContactAntiFraudPO orderContactAntiFraudPO);
//
//	int insertOrUpdateOrderContactPO(OrderContactPO orderContactPO);
//
//	int insertOrUpdateOrderContractRecoverReviewStatusPO(
//			OrderContractRecoverReviewStatusPO orderContractRecoverReviewStatusPO);
//
//	int insertOrUpdateOrderCustomerCreditPO(OrderCustomerCreditPO orderCustomerCreditPO);
//
	/**
	 * 有则更新无则插入-租赁订单明细数据
	 * @param orderDetailDataPO
	 * @return
	 */
//	int insertOrUpdateOrderDetailDataPO(List<OrderDetailDataPO> orderDetailDataPOs);

	/**
	 * 有则更新无则插入-租赁订单明细
	 * @param orderDetailPO
	 * @return
	 */
	int insertOrUpdateOrderDetailPO(List<OrderDetailPO> orderDetailPOs);
//
//	int insertOrUpdateOrderOmsSyncPO(OrderOmsSyncPO orderOmsSyncPO);
//
//	int insertOrUpdateOrderOtherCostPO(OrderOtherCostPO orderOtherCostPO);
//
//	int insertOrUpdateOrderPaySchedulePO(OrderPaySchedulePO orderPaySchedulePO);
//
//	int insertOrUpdateOrderRiskManagementPO(OrderRiskManagementPO orderRiskManagementPO);
//
//	int insertOrUpdateOrderSparePartsDetailPO(OrderSparePartsDetailPO orderSparePartsDetailPO);

}
