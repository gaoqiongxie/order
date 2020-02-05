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
* 租赁订单风险
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBaseRiskPO extends QueryPageExt {

	private static final long serialVersionUID = 8590429288646959104L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("(删除)未收逾期金额(事业部授信)")
	private BigDecimal bizOverdueAmount;

	@ApiModelProperty("合同未回收份数(事业部)")
	private BigDecimal conBizContRecycle;

	@ApiModelProperty("合同未回收天数(事业部)")
	private Integer conBizContRecycleOverDays;

	@ApiModelProperty("(删除)未收逾期金额(事业部签约)")
	private BigDecimal conBizOverdueAmount;

	@ApiModelProperty("最长逾期天数(营业店租金)")
	private Integer conBizOverdueDays;

	@ApiModelProperty("结算单未确认金额(事业部)")
	private BigDecimal conBizUncusconfirmAmount;

	@ApiModelProperty("结算单未确认天数(事业部)")
	private Integer conBizUncusconfirmOverDays;

	@ApiModelProperty("签约客户级别(调整后) (10:白名单A类; 11白名单B类; 12白名单C类; 13白名单D类)")
	private Integer conCusLevel;

	@ApiModelProperty("签约客户级别(初始) (10:白名单A类; 11白名单B类; 12白名单C类; 13白名单D类)")
	private Integer conInitCuslevel;

	@ApiModelProperty("(删除)未收逾期金额(定损)")
	private BigDecimal conLossOverdueAmount;

	@ApiModelProperty("(删除)最长逾期天数(定损)")
	private Integer conLossOverdueDays;

	@ApiModelProperty("逾期金额标准以外")
	private BigDecimal conOverAmountSta;

	@ApiModelProperty("逾期标准天数")
	private BigDecimal conOverDaySsta;

	@ApiModelProperty("(删除)未收逾期金额(签约)")
	private BigDecimal conOverdueAmount;

	@ApiModelProperty("逾期金额(事业部租金)")
	private BigDecimal conRentOverdueAmount;

	@ApiModelProperty("最长逾期天数(事业部租金)")
	private Integer conRentOverdueDays;

	@ApiModelProperty("签约客户预计月租金")
	private BigDecimal conRentPlanAmount;

	@ApiModelProperty("合同未回收份数(营业店)")
	private BigDecimal conShopContractRecycle;

	@ApiModelProperty("合同未回收天数(营业店)")
	private Integer conShopContRecycleOverdays;

	@ApiModelProperty("逾期金额(营业店租金)")
	private BigDecimal conShopRentOverdueAmount;

	@ApiModelProperty("最长逾期天数(营业店租金)")
	private Integer conShopRentOverdueDays;

	@ApiModelProperty("结算单未确认金额(营业店)")
	private BigDecimal conShopUncusconfirmAmt;

	@ApiModelProperty("结算单未确认天数(营业店)")
	private Integer conShopUncusconOverdays;

	@ApiModelProperty("企业施工资质 (10:总承包特级; 11:总承包一级; 12:总承包二级; 13:总承包三级; 20:专业承包一级; 21:专业承包二级; 22:专业承包三级; 50:劳务分包资质; 51:其他; 无资质)")
	private Integer constructionQualification;

	@ApiModelProperty("签约方名称")
	private String contractCustomerName;

	@ApiModelProperty("签约方编号")
	private String contractCustomerNumber;

	@ApiModelProperty("签约方累计签约量")
	private BigDecimal contractCusTotalVolume;

	@ApiModelProperty("初始客户级别 (10:白名单A类; 11白名单B类; 12白名单C类; 13白名单D类)")
	private Integer creCusLevel;

	@ApiModelProperty("授信客户名称")
	private String creditCustomerName;

	@ApiModelProperty("授信客户编号")
	private String creditCustomerNumber;

	@ApiModelProperty("授信客户最长逾期天数")
	private Integer creOverdueDays;

	@ApiModelProperty("币种 （39415696:欧元; 139624:人民币; 5881317:美元）")
	private Integer currency;

	@ApiModelProperty("涉诉情况 (0:正常; 1:失信被执行; 2:执行信息严重; 3:业务合作记录差)")
	private Integer cusAppeal;

	@ApiModelProperty("客户类别 (10:政府机构; 事业单位（含学校、医院等）; 20:央企（控股）; 21:非央企的国企（控股）; 24:省级国企（持股50％以上）; 22:省级国企(持股不超过50%); 23:市级及以下国企; 30:世界500强外资（控股）; 31:非世界500强，美欧日外资（控股）; 32:非世界500强，非美欧日外资（控股）; 40:民营100强; 41:民营上市公司; 42:一般民营公司; 50:个人客户（含个体工商户）)")
	private Integer cusLevel;

	@ApiModelProperty("成立日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date establishDate;

	@ApiModelProperty("是否超风险管理 (0:否; 1:是)")
	private Integer exceedingRiskManagement;

	@ApiModelProperty("授信客户逾期金额")
	private BigDecimal overdueAmount;

	@ApiModelProperty("(删除)最长逾期天数(签约)")
	private Integer overdueDays;

	@ApiModelProperty("注册资本(万元)")
	private BigDecimal registeredCapital;

	@Tolerate
	public OrderBaseRiskPO(){
	}
}