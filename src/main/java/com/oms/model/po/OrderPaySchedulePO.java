package com.oms.model.po;


import java.math.BigDecimal;
import java.util.Date;

import com.base.QueryPageExt;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 支付进度
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderPaySchedulePO extends QueryPageExt {

	private static final long serialVersionUID = 5057123152574118912L;

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

	@ApiModelProperty("序号，10 全款/20 预付款/30 阶段付款(非月结)/40 阶段付款(月结)/90 尾款")
	private Integer payScheduleNo;

	@ApiModelProperty("付款类型")
	private Integer payType;

	@ApiModelProperty("付款比例")
	private BigDecimal payProportion;

	@ApiModelProperty("付款金额")
	private BigDecimal payAmount;

	@ApiModelProperty("付款节点, 5 已签约/10 已进场/20  已上线/30 进行中/40 已完成")
	private Integer payPoint;

	@ApiModelProperty("备注")
	private String remark;

	@ApiModelProperty("付款完成状态")
	private String payStatusDesc;

	@ApiModelProperty("付款完成状态ID")
	private Integer payStatus;

	@ApiModelProperty("付款完成时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date payTime;

	@ApiModelProperty("项目租金跟踪号")
	private Integer payDtlId;

	@Tolerate
	public OrderPaySchedulePO(){
	}
}