package com.oms.model.po;


import com.base.QueryPageExt;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单风险管理
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderRiskManagementPO extends QueryPageExt {

	private static final long serialVersionUID = 3279115637748154368L;

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

	@ApiModelProperty("审批规则编号")
	private String approvalRuleCode;

	@ApiModelProperty("审批规则名称")
	private String approvalRuleName;

	@ApiModelProperty("管理要求")
	private String mangageRequirement;

	@ApiModelProperty("店长复核，1 按制度执行/2 突破制度执行")
	private Integer riShoponwer;

	@ApiModelProperty("租赁业务部总监，1 按制度执行/2 突破制度执行")
	private Integer riLeasingIG;

	@ApiModelProperty("事业部负责人，1 按制度执行/2 突破制度执行")
	private Integer riBizManager;

	@ApiModelProperty("信用岗，1 按制度执行/2 突破制度执行")
	private Integer riCreditPost;

	@ApiModelProperty("信用复核，1 按制度执行/2 突破制度执行")
	private Integer riCreditReview;

	@ApiModelProperty("系统自动计算，1 按制度执行/2 突破制度执行")
	private Integer riSystemAuto;

	@ApiModelProperty("是否影响审批流，0 否/1 是")
	private Integer riIsaffectApprovalFlow;

	@ApiModelProperty("管控维度")
	private String riControlDimension;

	@ApiModelProperty("管理要求无限制，0 有要求/1 没要求")
	private Integer riUnlimit;

	@ApiModelProperty("履职结果检查")
	private String riResultCheck;

	@ApiModelProperty("系统初审")
	private String riSystemFirstTrial;

	@Tolerate
	public OrderRiskManagementPO(){
	}
}