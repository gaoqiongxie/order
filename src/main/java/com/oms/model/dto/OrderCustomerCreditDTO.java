package com.oms.model.dto;


import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单客户资信
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderCustomerCreditDTO extends BaseDTO{

	private static final long serialVersionUID = 3953371769387899904L;

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

	@ApiModelProperty("事业部编号")
	private String bizUnitCode;

	@ApiModelProperty("事业部名称")
	private String bizUnitName;

	@ApiModelProperty("累计结算金额")
	private BigDecimal totalSettleAmount;

	@ApiModelProperty("回款账期天数")
	private Long totalAccountAmount;

	@ApiModelProperty("客户分数")
	private BigDecimal customerScore;

	@ApiModelProperty("客户所属名单，10 白名单/20 黑名单/30 灰名单")
	private Integer customerAfterLevel;

	@ApiModelProperty("调整后客户级别，10 白名单A类/12 白名单B类/13 白名单C类/14 白名单D类")
	private Integer customerBeforeLevel;

	@ApiModelProperty("初始客户级别，10 白名单A类/12 白名单B类/13 白名单C类/14 白名单D类")
	private Integer customerInitLevel;

	@Tolerate
	public OrderCustomerCreditDTO(){
	}
}