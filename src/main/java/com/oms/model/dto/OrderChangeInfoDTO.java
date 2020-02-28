package com.oms.model.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单信息变更
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderChangeInfoDTO extends BaseDTO {

	private static final long serialVersionUID = 4508795307876301824L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("明细标识（历史）")
	private Integer erpBilldtlId;

	@ApiModelProperty("租赁订单ID")
	private Integer erpId;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("明细行号")
	private Integer lineNumber;

	@ApiModelProperty("租赁订单编号")
	private String orderNo;

	@ApiModelProperty("变更类型，10 签约业务员变更/20 实际联系业务员变更/30 合同回收状态变更")
	private Integer changeType;

	@ApiModelProperty("变更前内容")
	private String changeBefore;

	@ApiModelProperty("变更日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date changeDate;

	@ApiModelProperty("备注")
	private String remark;

	@ApiModelProperty("修改人编号")
	private String updateUserCode;

	@ApiModelProperty("修改人姓名")
	private String updateUserName;

	@ApiModelProperty("修改时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@ApiModelProperty("变更后内容")
	private String changeAfter;

	@ApiModelProperty("变更复核状态：1-通过，2-退回;初始化赋值逻辑：来自SCM_HX03_RO_RC，辅助为‘1’；来自SCM_HX03_RO_RC2赋值为‘2’；来自SCM_HX03_RO_CP根据对应字段取值;")
	private Integer changeReviewStatus;

	@Tolerate
	public OrderChangeInfoDTO(){
	}
}