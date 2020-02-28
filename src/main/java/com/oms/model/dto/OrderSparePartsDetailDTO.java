package com.oms.model.dto;


import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单备件明细
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderSparePartsDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 5801017764880400384L;

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

	@ApiModelProperty("备件编号")
	private String spCode;

	@ApiModelProperty("备件名称")
	private String spName;

	@ApiModelProperty("数量")
	private BigDecimal spQuantity;

	@ApiModelProperty("备注")
	private String remark;

	@ApiModelProperty("序号")
	private Integer spNo;

	@ApiModelProperty("价格/金额")
	private BigDecimal spAmount;

	@Tolerate
	public OrderSparePartsDetailDTO(){
	}
}