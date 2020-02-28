package com.oms.model.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁合同回收状态复核信息
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderContractRecoverReviewStatusDTO extends BaseDTO {

	private static final long serialVersionUID = 3334327625670393856L;

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

	@ApiModelProperty("复核合同回收状态:1-通过/2-退回")
	private Integer rrsStatus;

	@ApiModelProperty("是否合规: 1-通过/2-退回")
	private Integer rrsLose;

	@ApiModelProperty("退回原因")
	private String rrsBackNote;

	@ApiModelProperty("复核人编号")
	private String updateUserCode;

	@ApiModelProperty("复核人姓名")
	private String updateUserName;

	@ApiModelProperty("复核时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@Tolerate
	public OrderContractRecoverReviewStatusDTO(){
	}
}