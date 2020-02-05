package com.oms.model.po;


import java.math.BigDecimal;

import com.base.QueryPageExt;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单代金券
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderCashCouponPO extends QueryPageExt {

	private static final long serialVersionUID = 8340295761446773760L;

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

	@ApiModelProperty("代金券编号")
	private String cashCouponNo;

	@ApiModelProperty("代金券名称")
	private String cashCouponName;

	@ApiModelProperty("代金券金额")
	private BigDecimal cashCouponAmount;

	@ApiModelProperty("dtlId")
	private Integer cashDtlld;

	@ApiModelProperty("代金券剩余金额")
	private BigDecimal cashCouponOverAmount;

	@Tolerate
	public OrderCashCouponPO(){
	}
}