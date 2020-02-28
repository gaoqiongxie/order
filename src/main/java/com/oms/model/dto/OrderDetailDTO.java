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
* 租赁订单明细
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1539615837069560832L;

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

	@ApiModelProperty("类别, 11 设备型号/20 材料")
	private Integer itemType;

	@ApiModelProperty("商品编号ID")
	private Integer itemId;

	@ApiModelProperty("商品编号")
	private String itemNo;

	@ApiModelProperty("商品名")
	private String itemName;

	@ApiModelProperty("商品类型编号")
	private String itemTypeCode;

	@ApiModelProperty("商品类型名称")
	private String itemTypeName;

	@ApiModelProperty("规格")
	private String itemModel;

	@ApiModelProperty("品牌编号")
	private String itemBrand;

	@ApiModelProperty("品牌名称")
	private String itemBrandName;

	@ApiModelProperty("数量")
	private BigDecimal itemQuantity;

	@ApiModelProperty("计量单位")
	private Integer itemUnit;

	@ApiModelProperty("进场日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date approachDate;

	@ApiModelProperty("租期")
	private BigDecimal leaseTerm;

	@ApiModelProperty("租期单位, 月,10;周,20;日,30;台班,40;季,50;年,60;平方,70;立方,80;吨,90;根,100;延米,110;米,120")
	private Integer leaseUnit;

	@ApiModelProperty("结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方")
	private Integer settleMethod;

	@ApiModelProperty("押金单价")
	private BigDecimal depositUnitPrice;

	@ApiModelProperty("计价方式, 月价格,10;周价格,20;日价格,30;季价格,50;年价格,60;按台班,120;按平方,130;按立方,160;按吨,170;根,180;延米,190;米,200")
	private Integer priceMode;

	@ApiModelProperty("租金标准价")
	private BigDecimal standardRent;

	@ApiModelProperty("折扣率(%)")
	private BigDecimal discountRate;

	@ApiModelProperty("按租期单价")
	private BigDecimal leaseTermPrice;

	@ApiModelProperty("备注")
	private String remark;

	@ApiModelProperty("序号")
	private Integer dtlNo;

	@ApiModelProperty("材料换算率")
	private String materialConversionRate;

	@ApiModelProperty("跟踪号")
	private Integer trackingId;

	@ApiModelProperty("价值")
	private BigDecimal creditPrice;

	@ApiModelProperty("指定设备")
	private String defineItem;

	@ApiModelProperty("标准租金金额")
	private BigDecimal standardRentAmount;

	@ApiModelProperty("折后租金金额")
	private BigDecimal discountRentAmount;

	@ApiModelProperty("标准价来源")
	private Integer standardAmountId;

	@ApiModelProperty("授信价格来源")
	private Integer creditPriceId;

	@ApiModelProperty("押金金额")
	private BigDecimal depositAmount;

	@ApiModelProperty("按租期单价(单位), 与选择的设备、事业部、业务模式有关")
	private String leaseTermPriceUnit;

	@ApiModelProperty("租金标准价(单位), 与选择的设备、事业部、业务模式有关")
	private String standardRentUnit;

	@ApiModelProperty("押金单价(单位)，默认元")
	private String depositUnit;

	@ApiModelProperty("价值(单位)，默认元")
	private String creditPriceUnit;

	@ApiModelProperty("初始导入数据")
	private String initData;

	@ApiModelProperty("初始化导入数据时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date initDataTime;

	@ApiModelProperty("租金单价")
	private BigDecimal rantalPrice;

	@ApiModelProperty("租金单价单位")
	private String rantalPriceUnit;

	@ApiModelProperty("变更前原订单数量")
	private BigDecimal originalQuantity;

	@ApiModelProperty("警告，根据实际联系营业店现有商品型号进行判断")
	private String waringMessage;

	@ApiModelProperty("dtl_chkChange")
	private Integer dtlChkChange;

	@ApiModelProperty("内部结算标准价")
	private BigDecimal innerSettleStandardAmount;

	@ApiModelProperty("内部结算折扣")
	private BigDecimal innerSettleDiscount;

	@ApiModelProperty("签约设备、材料")
	private Integer signItemId;

	@ApiModelProperty("最小起租周期")
	private BigDecimal minLeaseCycle;

	@ApiModelProperty("最小起租金额")
	private BigDecimal minRentAmount;

	@ApiModelProperty("来源DtlID")
	private BigDecimal sourceDtlId;

	@ApiModelProperty("是否有阶段价格，取值为空，字段值取值。")
	private Integer hasStepPrice;

	@ApiModelProperty("补充数量")
	private BigDecimal supplementQuantity;

	@ApiModelProperty("补充租期")
	private BigDecimal supplementLeaseTerm;

	@ApiModelProperty("补充租期单价")
	private BigDecimal supplementLeasePrice;

	@ApiModelProperty("提货期间止")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date deliveryDateEnd;

	@ApiModelProperty("预付款单价，默认元")
	private BigDecimal advancePrice;

	@ApiModelProperty("预付款单价(单位)，默认元")
	private String advancePriceUnit;

	@ApiModelProperty("数量和预收款单价的乘积")
	private BigDecimal totalAdvance;

	@Tolerate
	public OrderDetailDTO(){
	}
}