package com.order.dao;

import java.util.List;

import com.oms.model.dto.OrderBaseDTO;
import com.oms.model.dto.OrderCashCouponDTO;
import com.oms.model.dto.OrderChangeInfoDTO;
import com.oms.model.dto.OrderContactAntiFraudDTO;
import com.oms.model.dto.OrderContactDTO;
import com.oms.model.dto.OrderContractRecoverReviewStatusDTO;
import com.oms.model.dto.OrderCustomerCreditDTO;
import com.oms.model.dto.OrderDetailDTO;
import com.oms.model.dto.OrderDetailDataDTO;
import com.oms.model.dto.OrderOtherCostDTO;
import com.oms.model.dto.OrderPayScheduleDTO;
import com.oms.model.dto.OrderRiskManagementDTO;
import com.oms.model.dto.OrderSparePartsDetailDTO;


public interface SyncOrderErpDao {
	/**----------------------ERP Service-----------------------*/

	/**
	 * 租赁订单基础
	 * @param orderId
	 * @return
	 */
	OrderBaseDTO getOrderBaseByOrderId(int orderId);

	/**
	 * 租赁订单明细
	 * @param orderId
	 * @return
	 */
	List<OrderDetailDTO> listOrderDetailByOrderId(int orderId);

	/**
	 * 租赁订单明细数据
	 * @param orderId
	 * @return
	 */
	List<OrderDetailDataDTO> listOrderDetailDataByOrderId(int orderId);

	/**
	 * 租赁订单备件明细
	 * @param orderId
	 * @return
	 */
	List<OrderSparePartsDetailDTO> listOrderSparePartsDetailByOrderId(int orderId);

	/**
	 * 租赁订单联系人
	 * @param orderId
	 * @return
	 */
	List<OrderContactDTO> listOrderContactByOrderId(int orderId);

	/**
	 * 租赁订单客户资信
	 * @param orderId
	 * @return
	 */
	List<OrderCustomerCreditDTO> listOrderCustomerCreditByOrderId(int orderId);

	/**
	 * 租赁订单风险管理
	 * @param orderId
	 * @return
	 */
	List<OrderRiskManagementDTO> listOrderRiskManagementByOrderId(int orderId);

	/**
	 * 租赁订单联系人反欺诈
	 * @param orderId
	 * @return
	 */
	List<OrderContactAntiFraudDTO> listOrderContactAntiFraudByOrderId(int orderId);

	/**
	 * 租赁订单其他费用
	 * @param orderId
	 * @return
	 */
	List<OrderOtherCostDTO> listOrderOtherCostByOrderId(int orderId);

	/**
	 * 租赁订单支付进度
	 * @param orderId
	 * @return
	 */
	List<OrderPayScheduleDTO> listOrderPayScheduleDTOByOrderId(int orderId);

	/**
	 * 租赁订单代金券
	 * @param orderId
	 * @return
	 */
	List<OrderCashCouponDTO> listOrderCashCouponDTOByOrderId(int orderId);

	/**
	 * 租赁订单信息变更
	 * @param orderId
	 * @return
	 */
	List<OrderChangeInfoDTO> listOrderChangeInfoDTOByOrderId(int orderId);

	/**
	 * 租赁订单合同回收状态复核信息
	 * @param orderId
	 * @return
	 */
	List<OrderContractRecoverReviewStatusDTO> listOrderContractRecoverReviewStatusDTOByOrderId(int orderId);
	
	
	/**----------------------ERP Service-----------------------*/
}
