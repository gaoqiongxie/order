package com.oms.model.dto;


import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单其他费用
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderOtherCostDTO extends BaseDTO {

	private static final long serialVersionUID = 8944072986659602432L;

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

	@ApiModelProperty("费用类型编码")
	private String otherCostTypeCode;

	@ApiModelProperty("费用类型名称")
	private String otherCostTypeName;

	@ApiModelProperty("备注")
	private String remark;

	@ApiModelProperty("租赁订单商品明细ID")
	private Integer otherCostDtlId;

	@ApiModelProperty("设备/材料明细行信息")
	private String emDetailsLineInformation;

	@ApiModelProperty("收费标准数据")
	private String chargeRule;

	@ApiModelProperty("序号")
	private Integer otherCostNo;

	@ApiModelProperty("收费标准")
	private String chargeRuleDesc;

	@ApiModelProperty("实际收费")
	private BigDecimal realAmount;

	@ApiModelProperty("标准收费")
	private BigDecimal standardAmount;

	@ApiModelProperty("说明")
	private String otherCostExplain;

	@ApiModelProperty("费用跟踪号")
	private Integer otherCostTrackDtlId;

	@ApiModelProperty("类型，10 一次性/30 按照进场运输/31按照退场运输/40 按照进场交接/41按照退场交接/42 按人工登记(人/天)/ 43按油量登记(升)")
	private Integer ruleType;

	@ApiModelProperty("oth_itemId")
	private Integer othItemId;

	@ApiModelProperty("是否有运费，2 否/1 是")
	private Integer includeFreight;

	@Tolerate
	public OrderOtherCostDTO(){
	}
}