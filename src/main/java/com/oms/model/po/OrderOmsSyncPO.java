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
* ERP订单变更同步
* Thu Jan 23 11:14:44 CST 2020
*/

@Getter
@Setter
@Builder
public class OrderOmsSyncPO extends QueryPageExt {

	private static final long serialVersionUID = 7974274169840706560L;

	@ApiModelProperty("主键")
	private Integer id;

	@ApiModelProperty("单据标识")
	private Integer erpId;

	@ApiModelProperty("订单编号 唯一")
	private String no;

	@ApiModelProperty("0:OMS待抽取; 1:OMS已抽取")
	private Integer status;

	@ApiModelProperty("备注(记录erp变更埋点):如合同信息变更")
	private String remark;

	@ApiModelProperty("创建时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	@ApiModelProperty("修改时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@Tolerate
	public OrderOmsSyncPO(){
	}
}