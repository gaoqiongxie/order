package com.oms.model.po;


import com.base.QueryPageExt;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

/**
* 租赁订单地址
* Thu Jan 23 11:14:46 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderBaseAddressPO extends QueryPageExt {

	private static final long serialVersionUID = 833565899252617216L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("OMS 租赁订单ID")
	private Integer orderId;

	@ApiModelProperty("交付地址")
	private String deliveryAddress;

	@ApiModelProperty("交付地址关联ID")
	private Integer deliveryAddrId;

	@ApiModelProperty("交付地址行政区划编号")
	private Integer deliveryAddrNumber;

	@ApiModelProperty("交付地址_1")
	private String deliveryAddrText;

	@ApiModelProperty("交付地址类型 (1020:营业店; 1030:客户项目地; 1040 其他)")
	private Integer deliveryAddrType;

	@ApiModelProperty("项目所在城市 租赁订单项目所在城市，关联行政区表")
	private Integer projectCity;

	@ApiModelProperty("归还地址")
	private String returnAddress;

	@ApiModelProperty("归还地址关联ID")
	private Integer returnAddrId;

	@ApiModelProperty("归还地址行政区划编号")
	private Integer returnAddrNumber;

	@ApiModelProperty("归还地址_1")
	private String returnAddrText;

	@ApiModelProperty("归还地址类型 (1020:营业店; 1030:客户项目地; 1040 其他)")
	private Integer returnAddrType;

	@ApiModelProperty("使用地址")
	private String useAddr;

	@ApiModelProperty("使用地址关联ID")
	private Integer useAddrId;

	@ApiModelProperty("使用地址行政区划编号")
	private Integer useAddrNumber;

	@ApiModelProperty("使用地址_1")
	private String useAddrText;

	@ApiModelProperty("使用地址类型 (1020:营业店; 1030:客户项目地; 1040 其他)")
	private Integer useAddrType;

	@Tolerate
	public OrderBaseAddressPO(){
	}
}