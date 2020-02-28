package com.oms.model.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;


@Getter
@Setter
@Builder
public class OrderRentDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6179439928367596343L;
	private int id;
	
	@ApiModelProperty("租赁订单地址")
	private	OrderBaseAddressDTO	orderBaseAddressDTO;
	@ApiModelProperty("租赁订单变更")
	private	OrderBaseChangeDTO	orderBaseChangeDTO;
	@ApiModelProperty("租赁订单扩展")
	private	OrderBaseExtendDTO	orderBaseExtendDTO;
	@ApiModelProperty("租赁订单基础")
	private	OrderBaseDTO	orderBaseDTO;
	@ApiModelProperty("租赁订单风险")
	private	OrderBaseRiskDTO	orderBaseRiskDTO;
	@ApiModelProperty("租赁订单系统")
	private	OrderBaseSystemDTO	orderBaseSystemDTO;
	
	/** 1:n */
	@ApiModelProperty("租赁订单代金券")
	private	List<OrderCashCouponDTO>	orderCashCouponList;
	@ApiModelProperty("租赁订单信息变更 ")
	private	List<OrderChangeInfoDTO>	orderChangeInfoList;
	@ApiModelProperty("租赁订单联系人反欺诈")
	private	List<OrderContactAntiFraudDTO>	orderContactAntiFraudList;
	@ApiModelProperty("租赁订单联系人")
	private	List<OrderContactDTO>	orderContactList;
	@ApiModelProperty("租赁合同回收状态复核信息")
	private	List<OrderContractRecoverReviewStatusDTO>	orderContractRecoverReviewStatusList;
	@ApiModelProperty("租赁订单客户资信")
	private	List<OrderCustomerCreditDTO>	orderCustomerCreditList;
	@ApiModelProperty("租赁订单明细数据")
	private	List<OrderDetailDataDTO>	orderDetailDataList;
	@ApiModelProperty("租赁订单明细 ")
	private	List<OrderDetailDTO>	orderDetailList;
	@ApiModelProperty("ERP订单变更同步")
	private	List<OrderOmsSyncDTO>	orderOmsSyncList;
	@ApiModelProperty("租赁订单其他费用")
	private	List<OrderOtherCostDTO>	orderOtherCostList;
	@ApiModelProperty("支付进度")
	private	List<OrderPayScheduleDTO>	orderPayScheduleList;
	@ApiModelProperty("租赁订单风险管理")
	private	List<OrderRiskManagementDTO>	orderRiskManagementList;
	@ApiModelProperty("租赁订单备件明细")
	private	List<OrderSparePartsDetailDTO>	orderSparePartsDetailList;

	
	
	@Tolerate
	public OrderRentDTO(){
	}
}
