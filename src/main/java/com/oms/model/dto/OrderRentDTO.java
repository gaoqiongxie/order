package com.oms.model.dto;

import java.io.Serializable;
import java.util.List;

import com.oms.model.po.OrderBaseAddressPO;
import com.oms.model.po.OrderBaseChangePO;
import com.oms.model.po.OrderBaseExtendPO;
import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderBaseRiskPO;
import com.oms.model.po.OrderBaseSystemPO;
import com.oms.model.po.OrderCashCouponPO;
import com.oms.model.po.OrderChangeInfoPO;
import com.oms.model.po.OrderContactAntiFraudPO;
import com.oms.model.po.OrderContactPO;
import com.oms.model.po.OrderContractRecoverReviewStatusPO;
import com.oms.model.po.OrderCustomerCreditPO;
import com.oms.model.po.OrderDetailDataPO;
import com.oms.model.po.OrderDetailPO;
import com.oms.model.po.OrderOmsSyncPO;
import com.oms.model.po.OrderOtherCostPO;
import com.oms.model.po.OrderPaySchedulePO;
import com.oms.model.po.OrderRiskManagementPO;
import com.oms.model.po.OrderSparePartsDetailPO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Getter
@Setter
@Builder
public class OrderRentDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6179439928367596343L;
	private int id;
	
	@ApiModelProperty("租赁订单地址")
	private	OrderBaseAddressPO	orderBaseAddressPO;
	@ApiModelProperty("租赁订单变更")
	private	OrderBaseChangePO	orderBaseChangePO;
	@ApiModelProperty("租赁订单扩展")
	private	OrderBaseExtendPO	orderBaseExtendPO;
	@ApiModelProperty("租赁订单基础")
	private	OrderBasePO	orderBasePO;
	@ApiModelProperty("租赁订单风险")
	private	OrderBaseRiskPO	orderBaseRiskPO;
	@ApiModelProperty("租赁订单系统")
	private	OrderBaseSystemPO	orderBaseSystemPO;
	
	/** 1:n */
	@ApiModelProperty("租赁订单代金券")
	private	List<OrderCashCouponPO>	orderCashCouponPO;
	@ApiModelProperty("租赁订单信息变更 ")
	private	List<OrderChangeInfoPO>	orderChangeInfoPO;
	@ApiModelProperty("租赁订单联系人反欺诈")
	private	List<OrderContactAntiFraudPO>	orderContactAntiFraudPO;
	@ApiModelProperty("租赁订单联系人")
	private	List<OrderContactPO>	orderContactPO;
	@ApiModelProperty("租赁合同回收状态复核信息")
	private	List<OrderContractRecoverReviewStatusPO>	orderContractRecoverReviewStatusPO;
	@ApiModelProperty("租赁订单客户资信")
	private	List<OrderCustomerCreditPO>	orderCustomerCreditPO;
	@ApiModelProperty("租赁订单明细数据")
	private	List<OrderDetailDataPO>	orderDetailDataPO;
	@ApiModelProperty("租赁订单明细 ")
	private	List<OrderDetailPO>	orderDetailPO;
	@ApiModelProperty("ERP订单变更同步")
	private	List<OrderOmsSyncPO>	orderOmsSyncPO;
	@ApiModelProperty("租赁订单其他费用")
	private	List<OrderOtherCostPO>	orderOtherCostPO;
	@ApiModelProperty("支付进度")
	private	List<OrderPaySchedulePO>	orderPaySchedulePO;
	@ApiModelProperty("租赁订单风险管理")
	private	List<OrderRiskManagementPO>	orderRiskManagementPO;
	@ApiModelProperty("租赁订单备件明细")
	private	List<OrderSparePartsDetailPO>	orderSparePartsDetailPO;

	
	
	@Tolerate
	public OrderRentDTO(){
	}
}
