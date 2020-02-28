package com.oms.model.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单明细数据
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderDetailDataDTO extends BaseDTO {

	private static final long serialVersionUID = 8862215571571040256L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("原ERP BillDtlID")
	private Integer erpBilldtlId;

	@ApiModelProperty("原ERP BillID")
	private Integer erpId;

	@ApiModelProperty("OMS 租赁订单明细ID")
	private Integer orderDetailId;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("阶段价格")
	private String stepPrice;

	@ApiModelProperty("阶段价格数据")
	private String stepPriceData;

	@ApiModelProperty("附加条款")
	private String additionalClause;

	@ApiModelProperty("附加条款数据")
	private String additionalClauseData;

	@ApiModelProperty("材料换算率数据")
	private String materialConversionRateData;

	@ApiModelProperty("阶段价格(文字)")
	private String stepPriceDesc;

	@Tolerate
	public OrderDetailDataDTO(){
	}
}