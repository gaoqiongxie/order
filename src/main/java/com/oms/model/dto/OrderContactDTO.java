package com.oms.model.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单联系人
* Thu Jan 23 11:14:45 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderContactDTO extends BaseDTO{

	private static final long serialVersionUID = 6913660882388199424L;

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

	@ApiModelProperty("人员角色，1 签约授权人/2 现场联系人/3 结算/进退场授权人/4 保证人")
	private String contactRole;

	@ApiModelProperty("角色类型，10 自然人/20  企业法人")
	private String roleType;

	@ApiModelProperty("联系人名称")
	private String contactName;

	@ApiModelProperty("联系方式")
	private String contactMobile;

	@ApiModelProperty("证件类型，10，身份证；20，护照；30，其他；40，无证件；")
	private Integer idType;

	@ApiModelProperty("证件号码")
	private String idNumber;

	@ApiModelProperty("身份证头像页路径")
	private String idCardFrontUrl;

	@ApiModelProperty("身份证国徽页路径")
	private String idCardBackUrl;

	@ApiModelProperty("frontNo")
	private String frontNo;

	@ApiModelProperty("backNo")
	private String backNo;

	@ApiModelProperty("失效日期，填写值为证件号码的相关值。")
	private String expiryDate;

	@ApiModelProperty("手机姓名是否匹配，0 不匹配/1 匹配")
	private Integer mobileMatchName;

	@ApiModelProperty("backNo_copy")
	private String backNoCopy;

	@ApiModelProperty("在网状态，0 正常使用/1 停机/2 在网不可用/3 不在网/销号/未启用/异常、4 预销户")
	private Integer networkState;

	@ApiModelProperty("通讯地址")
	private String postalAddress;

	@ApiModelProperty("通讯区域编号")
	private Integer postalAddressId;

	@ApiModelProperty("通讯区域")
	private String postalAddressArea;

	@ApiModelProperty("是否法人，1 是/2 否")
	private Integer legalPerson;

	@ApiModelProperty("授权信息表ID")
	private Integer signEmpowerBillId;

	@ApiModelProperty("授权信息表BillDtlId")
	private Integer signEmpowerBillDtlId;

	@ApiModelProperty("授权书信息")
	private String signEmpowerJson;

	@ApiModelProperty("授权书类型，1 公司授权/2 项目授权")
	private Integer signEmpowerType;

	@ApiModelProperty("打开授权书")
	private String openSignEmpower;

	@Tolerate
	public OrderContactDTO(){
	}
}