package com.order.dao;

import java.util.List;

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

public interface SyncOrderErpDao {
	/**----------------------ERP Service-----------------------*/

	/**
	 * 租赁订单基础
	 * @param orderId
	 * @return
	 */
	OrderBasePO getOrderBaseByOrderId(int orderId);

	/**
	 * 租赁订单明细
	 * @param orderId
	 * @return
	 */
	List<OrderDetailPO> listOrderDetailByOrderId(int orderId);

	/**
	 * 租赁订单明细数据
	 * @param orderId
	 * @return
	 */
	List<OrderDetailDataPO> listOrderDetailDataByOrderId(int orderId);

	/**
	 * 租赁订单备件明细
	 * @param orderId
	 * @return
	 */
	List<OrderSparePartsDetailPO> listOrderSparePartsDetailByOrderId(int orderId);

	/**
	 * 租赁订单联系人
	 * @param orderId
	 * @return
	 */
	List<OrderContactPO> listOrderContactByOrderId(int orderId);

	/**
	 * 租赁订单客户资信
	 * @param orderId
	 * @return
	 */
	List<OrderCustomerCreditPO> listOrderCustomerCreditByOrderId(int orderId);

	/**
	 * 租赁订单风险管理
	 * @param orderId
	 * @return
	 */
	List<OrderRiskManagementPO> listOrderRiskManagementByOrderId(int orderId);

	/**
	 * 租赁订单联系人反欺诈
	 * @param orderId
	 * @return
	 */
	List<OrderContactAntiFraudPO> listOrderContactAntiFraudByOrderId(int orderId);

	/**
	 * 租赁订单其他费用
	 * @param orderId
	 * @return
	 */
	List<OrderOtherCostPO> listOrderOtherCostByOrderId(int orderId);

	/**
	 * 租赁订单支付进度
	 * @param orderId
	 * @return
	 */
	List<OrderPaySchedulePO> listOrderPaySchedulePOByOrderId(int orderId);

	/**
	 * 租赁订单代金券
	 * @param orderId
	 * @return
	 */
	List<OrderCashCouponPO> listOrderCashCouponPOByOrderId(int orderId);

	/**
	 * 租赁订单信息变更
	 * @param orderId
	 * @return
	 */
	List<OrderChangeInfoPO> listOrderChangeInfoPOByOrderId(int orderId);

	/**
	 * 租赁订单合同回收状态复核信息
	 * @param orderId
	 * @return
	 */
	List<OrderContractRecoverReviewStatusPO> listOrderContractRecoverReviewStatusPOByOrderId(int orderId);
	
	
	/**----------------------ERP Service-----------------------*/
}
