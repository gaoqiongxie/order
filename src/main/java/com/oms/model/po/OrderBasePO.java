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
* 租赁订单基础
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBasePO extends QueryPageExt {

	private static final long serialVersionUID = 6201445179460690944L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("审批所用营业店名称")
	private String approvalShopName;

	@ApiModelProperty("审批所用营业店编号")
	private String approvalShopNumber;

	@ApiModelProperty("进场物流安排 (10::出租方; 20:承租方)")
	private Integer arrivalLogisticsArrangement;

	@ApiModelProperty("是否为挂靠业务 (1:是; 2:否)")
	private Integer attachBusiness;

	@ApiModelProperty("底线条款变更 (0:否; 1是)")
	private Integer bottomLineChanges;

	@ApiModelProperty("业务模式 (10:租赁; 20:项目; 30:工程)")
	private Integer businessModel;

	@ApiModelProperty("最新复核回收状态 (1:通过; 2:退回)")
	private Integer checkContractRecoveryStatus;

	@ApiModelProperty("所属公司名称")
	private String companyName;

	@ApiModelProperty("所属公司编号")
	private String companyNumber;

	@ApiModelProperty("实际联系业务员名称")
	private String connectSalesmanName;

	@ApiModelProperty("实际联系业务员编号")
	private String connectSalesmanNumber;

	@ApiModelProperty("实际联系营业店名称")
	private String connectShopName;

	@ApiModelProperty("实际联系营业店编号")
	private String connectShopNumber;

	@ApiModelProperty("施工结束日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date constructionEndDate;

	@ApiModelProperty("工期")
	private BigDecimal constructionPeriod;

	@ApiModelProperty("合同金额")
	private BigDecimal contractAmount;

	@ApiModelProperty("签约客户名称")
	private String contractCusName;

	@ApiModelProperty("签约客户编号")
	private String contractCusNumber;

	@ApiModelProperty("合同价格系数")
	private BigDecimal contractPriceCoefficient;

	@ApiModelProperty("合同回收状态 (0:空; 20:我司已盖章; 30:双方已盖章，原件回收; 40:已结清仅签字; :50:停止推进; 60:零租业务:款项已结清; 80:原件已回收有瑕疵; :90:签字版合同已回收; 100:电子合同签约已完成; 110:客户线上签署中; 120:电子合同签约已完成（无授权）)")
	private Integer contractRecoveryStatus;

	@ApiModelProperty("合同版本 (10:标准; 20:非标)")
	private Integer contractVersion;

	@ApiModelProperty("贡献系数 (:10:0.0; 11:0.1; …; 19:0.9; 20:1.0)")
	private Integer contributeRate;

	@ApiModelProperty("授信客户名称")
	private String creditCusName;

	@ApiModelProperty("授信客户编号")
	private String creditCusNumber;

	@ApiModelProperty("应付押金")
	private BigDecimal depositPayable;

	@ApiModelProperty("事业部名称")
	private String divisionName;

	@ApiModelProperty("事业部编号")
	private String divisionNumber;

	@ApiModelProperty("首期付款比例(%)")
	private BigDecimal downPaymentRatio;

	@ApiModelProperty("订单类别（工程） (:0:正常; 1:工程机械租赁; 2:工程材料租赁。租赁订单订单类别，仅工程使用？)")
	private Integer engineeringMode;

	@ApiModelProperty("预计完工日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date estimateFinishedDate;

	@ApiModelProperty("退场物流安排 (10::出租方; 20:承租方)")
	private Integer exitLogisticsArrangements;

	@ApiModelProperty("燃油承担方 (10:出租方; 20:承租方)")
	private Integer fuelBearer;

	@ApiModelProperty("燃油提供方 (10:出租方; 20:承租方)")
	private Integer fuelProvider;

	@ApiModelProperty("交接前提 (1:款到交接; 2:款到发车:; 3:无; 4:合同签署后发车; 5:合同签署后交接)")
	private String handoverPremise;

	@ApiModelProperty("对内审批备注")
	private String internalApprovalNotes;

	@ApiModelProperty("是否劳务服务")
	private Integer laborService;

	@ApiModelProperty("租赁方式 (10:整租; 20:零租)")
	private Integer leasingMethod;

	@ApiModelProperty("租赁用途")
	private String leasingPurpose;

	@ApiModelProperty("承租客户名称")
	private String lesseeCusName;

	@ApiModelProperty("承租客户编号")
	private String lesseeCusNumber;

	@ApiModelProperty("订单编号 唯一")
	private String no;

	@ApiModelProperty("单据日期")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date orderDate;

	@ApiModelProperty("erp单据标识")
	private Integer erpId;

	@ApiModelProperty("付款描述")
	private String paymentDesc;

	@ApiModelProperty("结算与支付方式 (0:空; 1:周期结算; 2:仅第一期预付，后续按周期结算并支付; 3:预付结算)")
	private Integer paymentMethod;

	@ApiModelProperty("付款期限(天)")
	private Integer paymentTermDay;

	@ApiModelProperty("履约保证金")
	private BigDecimal performanceBond;

	@ApiModelProperty("应付预付款")
	private BigDecimal prepaymentPayable;

	@ApiModelProperty("产品分类名称")
	private String productClassName;

	@ApiModelProperty("产品分类编号")
	private String productClassNumber;

	@ApiModelProperty("项目分类名称")
	private String projectClassName;

	@ApiModelProperty("项目分类编号")
	private String projectClassNumber;

	@ApiModelProperty("项目名称")
	private String projectName;

	@ApiModelProperty("是否关联主合同编号 (10:否; 20:是)")
	private Integer relatedMainContract;

	@ApiModelProperty("关联主合同号")
	private String relatedMainContractNo;

	@ApiModelProperty("签约业务员姓名")
	private String salesmanName;

	@ApiModelProperty("签约业务员编号")
	private String salesmanNumber;

	@ApiModelProperty("结算日 (-1:进场后一个月; 1:每月1日; …; 30每月30日; 99:月底)")
	private String settlementDate;

	@ApiModelProperty("业务营业店名称")
	private String shopName;

	@ApiModelProperty("业务营业店编号")
	private String shopNumber;

	@ApiModelProperty("对客户显示备注")
	private String showCusNotes;

	@ApiModelProperty("状态 (10:草稿; 20:已输入; 30:业务已提交; 40:审批中; 50:已审批; 60:执行中; 70:已退场; 80:已完成; 90:已完结; 100:已作废)")
	private Integer status;

	@ApiModelProperty("是否跨区域业务 (1:是; 2:否)")
	private Integer transRegional;

	@ApiModelProperty("事业部基本业务模式 (10:设备; 20:材料)")
	private Integer unitBasicBusinessModel;

	@ApiModelProperty("有无逾期(0:无; 1:有)")
	private Integer overdue;

	@Tolerate
	public OrderBasePO(){
	}
}