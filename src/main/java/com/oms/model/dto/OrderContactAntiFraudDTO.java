package com.oms.model.dto;


import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单联系人反欺诈
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderContactAntiFraudDTO extends BaseDTO {

	private static final long serialVersionUID = 1628079249276297216L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("原ERP BillDtlID")
	private Integer erpBilldtlId;

	@ApiModelProperty("原ERP BillID")
	private Integer erpId;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("明细行号")
	private Integer lineNumber;

	@ApiModelProperty("租赁订单编号")
	private String orderNo;

	@ApiModelProperty("证件号码")
	private String afIDNumber;

	@ApiModelProperty("联系人姓名")
	private String afContactName;

	@ApiModelProperty("联系方式")
	private String afContactMobile;

	@ApiModelProperty("签约方编号")
	private String signTypeCode;

	@ApiModelProperty("签约方名称")
	private String signTypeName;

	@ApiModelProperty("联系人角色, 1 签约授权人/2 现场联系人/3 结算/进退场授权人/4 保证人")
	private String afContactType;

	@ApiModelProperty("未收金额")
	private BigDecimal afUncollectedAmount;

	@ApiModelProperty("最长逾期天数")
	private Integer afMaxOverdueDays;

	@ApiModelProperty("联系人名下出现多个签约方的原因")
	private String multipleSignReason;

	@ApiModelProperty("店长")
	private String afManager;

	@ApiModelProperty("总监, 1 确认/2 不确认")
	private Integer afIG;

	@ApiModelProperty("信用, 1 确认/2 不确认")
	private Integer afCredit;

	@ApiModelProperty("业务员编号")
	private String afStaffCode;

	@ApiModelProperty("业务员姓名")
	private String afStaffName;

	@Tolerate
	public OrderContactAntiFraudDTO(){
	}
}