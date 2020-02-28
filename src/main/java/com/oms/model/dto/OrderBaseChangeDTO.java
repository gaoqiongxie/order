package com.oms.model.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单变更
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBaseChangeDTO extends BaseDTO {

	private static final long serialVersionUID = 828056403898330112L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("实际生效日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date actualEffectiveDate;

	@ApiModelProperty("实际失效日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date actualExpirationDate;

	@ApiModelProperty("是否变更 (0:否; 1:是)")
	private Integer changeStatus;

	@ApiModelProperty("变更内容")
	private String changeContent;

	@ApiModelProperty("变更生效日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date changeEffectiveDate;

	@ApiModelProperty("变更原因")
	private String changeReason;

	@ApiModelProperty("变更来源订单ID")
	private Integer changeSourceOrderId;

	@ApiModelProperty("变更来源订单")
	private String changeSourceOrderNo;

	@ApiModelProperty("变更类型 (10:租金变更; 20:异常抬头变更; 21:常规抬头变更; 30:录入瑕疵变更; 40:其他变更; 50:补充协议变更; 60:所属营业店变更; 70:设备材料|工程服务变更; 80:保证人变更)")
	private Integer changeType;

	@ApiModelProperty("变更版本")
	private Integer changeVersion;

	@ApiModelProperty("订单首次生成日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date firstDate;

	@ApiModelProperty("后续变更订单ID")
	private Integer followChangeOrderId;

	@ApiModelProperty("后续变更订单")
	private String followNo;

	@ApiModelProperty("主订单ID")
	private Integer masterId;

	@ApiModelProperty("主订单编号")
	private String masterNo;

	@Tolerate
	public OrderBaseChangeDTO(){
	}
}