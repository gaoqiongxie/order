package com.oms.model.dto;


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单扩展
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBaseExtendDTO extends BaseDTO{

	private static final long serialVersionUID = 5812592661889586176L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("关闭租金计算")
	private Integer calRentClose;

	@ApiModelProperty("关闭租金计算时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date calRentCloseDate;

	@ApiModelProperty("关闭结算提醒 (0:否; 1:是)")
	private Integer closeSettleAlarm;

	@ApiModelProperty("签约方是否是个人客户 (1:是; 2:否)")
	private Integer conCusPerson;

	@ApiModelProperty("合同地址")
	private String contractFileUrl;

	@ApiModelProperty("合同回收日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date contractRecoveryDate;

	@ApiModelProperty("合同回收状态 (0:空; 20:我司已盖章; 30:双方已盖章，原件回收; 40:已结清仅签字; :50:停止推进; 60:零租业务:款项已结清; 80:原件已回收有瑕疵; :90:签字版合同已回收; 100:电子合同签约已完成; 110:客户线上签署中; 120:电子合同签约已完成（无授权）)")
	private Integer contractRecoveryStatusCopy;

	@ApiModelProperty("合同回收状态（显） (0:空; 20:我司已盖章; 30:双方已盖章，原件回收; 40:已结清仅签字; :50:停止推进)")
	private Integer contractStatus;

	@ApiModelProperty("客户预付款超期天数")
	private String cusPrepayOverdueDays;

	@ApiModelProperty("客户签章日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cusSignatureDate;

	@ApiModelProperty("设备不足")
	private Integer equipmentNotEnough;

	@ApiModelProperty("手机号")
	private String intentionAgentMobile;

	@ApiModelProperty("姓名")
	private String intentionAgentName;

	@ApiModelProperty("金额")
	private BigDecimal intentionAmount;

	@ApiModelProperty("意向单ID")
	private Integer intentionId;

	@ApiModelProperty("意向单号")
	private String intentionNo;

	@ApiModelProperty("来源 (10:线上; 20:线下)")
	private Integer intentionSourceWay;

	@ApiModelProperty("发票类型 (1241:普票; 259专票)")
	private Integer invoiceType;

	@ApiModelProperty("月计算周期 (10:30天; 20:自然月)")
	private Integer monthCalculationMode;

	@ApiModelProperty("我司签章日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date ourSignatureDate;

	@ApiModelProperty("纸质授权书是否已签回 (1:是; 2:否)")
	private Integer paperSignBack;

	@ApiModelProperty("起租金额")
	private BigDecimal projectBaseRentAmount;

	@ApiModelProperty("项目订单老计算方法 (0:否; 1:是)")
	private Integer projectOldRent;

	@ApiModelProperty("授权书是否是项目部（代办列表） (0:否; 1:是)")
	private Integer projectSignempower;

	@ApiModelProperty("租金计算截至日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date rentCalculationCutoffDate;

	@ApiModelProperty("最后一次计算时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date rentCalLastTime;

	@ApiModelProperty("签约顺序 (1:客户先签约; 2:我司先签约)")
	private Integer signSort;

	@ApiModelProperty("签约方式 (1:线下纸质签约; 2:线上电子签约)")
	private Integer signType;

	@ApiModelProperty("起租日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startingRentDate;

	@ApiModelProperty("判断已完结状态日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date statusClosedDate;

	@ApiModelProperty("跟踪贡献系数")
	private Integer trackContributeRate;

	@ApiModelProperty("物流价格系数")
	private BigDecimal tranPriceRate;

	@ApiModelProperty("施工地形 (1:平原; 2:高原; :3:山区)")
	private Integer constructionTerrain;

	@ApiModelProperty("人员配置安排 (1:单班; 2:大班; 3:双班)")
	private Integer personConfig;

	@ApiModelProperty("食宿提供方 (1:承租方; 2:出租方)")
	private Integer roomboard;

	@ApiModelProperty("是否包租业务 (1:是; 2:否)")
	private Integer charterBusiness;

	@ApiModelProperty("主责任人姓名")
	private String mainResponsibleName;

	@ApiModelProperty("主责任人编号")
	private String mainResponsibleNumber;

	@ApiModelProperty("责任人占比 (10:签约系数为0.2; 20:回款系数为0.4; 30:结算系数为0.2; 40:处理项目事项系数为0.2)")
	private String mainResponsibleRatio;

	@ApiModelProperty("项目经理姓名")
	private String projectManagerName;

	@ApiModelProperty("项目经理编号")
	private String projectManagerNumber;

	@ApiModelProperty("次责任人姓名")
	private String secondResponsibleName;

	@ApiModelProperty("次责任人编号")
	private String secondResponsibleNumber;

	@ApiModelProperty("次责任人占比 (10:签约系数为0.2; 20:回款系数为0.4; 30:结算系数为0.2; 40:处理项目事项系数为0.2)")
	private String secondResponsibleRatio;

	@Tolerate
	public OrderBaseExtendDTO(){
	}
}