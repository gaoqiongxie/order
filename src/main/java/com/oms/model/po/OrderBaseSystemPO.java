package com.oms.model.po;


import java.util.Date;

import com.base.QueryPageExt;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单系统
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBaseSystemPO extends QueryPageExt {

	private static final long serialVersionUID = 1452258191103687680L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("单据日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date addDate;

	@ApiModelProperty("是否App操作 (0:否; 1:是)")
	private Integer appMake;

	@ApiModelProperty("审批日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date approvalDate;

	@ApiModelProperty("审批人名称")
	private String approverName;

	@ApiModelProperty("审批人编号")
	private String approverNumber;

	@ApiModelProperty("区域名称")
	private String areaName;

	@ApiModelProperty("区域编号")
	private String areaNumber;

	@ApiModelProperty("是否运营专员发起审批流退回 (0:否; 1:是)")
	private Integer backToStaff;

	@ApiModelProperty("审批边界 (1:直接通过; 2:商务风险均突破; 3:风险类突破; 4:商务类突破)")
	private Integer breaktype;

	@ApiModelProperty("canSave")
	private Integer canSave;

	@ApiModelProperty("临时去除审批流")
	private Integer clearWorkflow;

	@ApiModelProperty("表单名称(用于审批)")
	private String descr;

	@ApiModelProperty("单据类型编号 外键")
	private Integer entityType;

	@ApiModelProperty("单据的key")
	private String erpBillKey;

	@ApiModelProperty("导入时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date importDate;

	@ApiModelProperty("制单人名称")
	private String makerName;

	@ApiModelProperty("制单人编号")
	private String makerNumber;

	@ApiModelProperty("修改日期 默认同制单日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modificationDate;

	@ApiModelProperty("修改人名称 默认同制单人名称")
	private String modifierName;

	@ApiModelProperty("修改人编号 默认同制单人编号")
	private String modifierNumber;

	@ApiModelProperty("是否提醒 (0:否; 1:是)")
	private Integer notice;

	@ApiModelProperty("订单记录模式 (10:正常模式; 20:补录模式)")
	private Integer recordType;

	@ApiModelProperty("已导入 SAP (0:否; 1:是)")
	private Integer sapImported;

	@ApiModelProperty("SAP项目号")
	private String sapProjectId;

	@ApiModelProperty("是否用印 (0:否; 1:是)")
	private Integer sealPass;

	@ApiModelProperty("来源文件")
	private String sourceFile;

	@ApiModelProperty("来源单据ID")
	private String sourceId;

	@ApiModelProperty("来源单据")
	private String sourceNo;

	@ApiModelProperty("业务员提交时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date staffConfirmTime;

	@ApiModelProperty("关闭补录操作员姓名")
	private String supplementOperatorName;

	@ApiModelProperty("关闭补录操作员编号")
	private String supplementOperatorNumber;

	@ApiModelProperty("标题(用于审批)")
	private String title;

	@ApiModelProperty("公司编号")
	private Integer componyId;

	@Tolerate
	public OrderBaseSystemPO(){
	}
}