package com.order.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    /**
     * 
     */
    private Integer id;

    /**
     * 原ERP BillDtlID
     */
    private Integer erpBilldtlId;

    /**
     * 原ERP BillID
     */
    private Integer erpId;

    /**
     * OMS 租赁订单ID
     */
    private Integer orderId;

    /**
     * 明细行号
     */
    private Integer lineNumber;

    /**
     * 租赁订单编号
     */
    private String orderNo;

    /**
     * 类别, 11 设备型号/20 材料
     */
    private Integer itemType;

    /**
     * 商品编号ID
     */
    private Integer itemId;

    /**
     * 商品编号
     */
    private String itemNo;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 商品类型编号
     */
    private String itemTypeCode;

    /**
     * 商品类型名称
     */
    private String itemTypeName;

    /**
     * 规格
     */
    private String itemModel;

    /**
     * 品牌编号
     */
    private String itemBrand;

    /**
     * 品牌名称
     */
    private String itemBrandName;

    /**
     * 数量
     */
    private BigDecimal itemQuantity;

    /**
     * 计量单位
     */
    private Integer itemUnit;

    /**
     * 进场日期
     */
    private Date approachDate;

    /**
     * 租期
     */
    private BigDecimal leaseTerm;

    /**
     * 租期单位, 立方/月/周/日/台班/季/年/平方/立方
     */
    private Integer leaseUnit;

    /**
     * 结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方
     */
    private Integer settleMethod;

    /**
     * 押金单价
     */
    private BigDecimal depositUnitPrice;

    /**
     * 计价方式, 日价格/周价格/月价格/季价格
     */
    private Integer priceMode;

    /**
     * 租金标准价
     */
    private BigDecimal standardRent;

    /**
     * 折扣率(%)
     */
    private BigDecimal discountRate;

    /**
     * 按租期单价
     */
    private BigDecimal leaseTermPrice;

    /**
     * 阶段价格
     */
    private String stepPrice;

    /**
     * 阶段价格数据
     */
    private String stepPriceData;

    /**
     * 附加条款
     */
    private String additionalClause;

    /**
     * 附加条款数据
     */
    private String additionalClauseData;

    /**
     * 备注
     */
    private String remark;

    /**
     * 序号
     */
    private Integer dtlNo;

    /**
     * 材料换算率
     */
    private String materialConversionRate;

    /**
     * 材料换算率数据
     */
    private String materialConversionRateData;

    /**
     * 跟踪号
     */
    private Integer trackingId;

    /**
     * 价值
     */
    private BigDecimal creditPrice;

    /**
     * 指定设备
     */
    private String defineItem;

    /**
     * 标准租金金额
     */
    private BigDecimal standardRentAmount;

    /**
     * 折后租金金额
     */
    private BigDecimal discountRentAmount;

    /**
     * 标准价来源
     */
    private Integer standardAmountId;

    /**
     * 授信价格来源
     */
    private Integer creditPriceId;

    /**
     * 押金金额
     */
    private BigDecimal depositAmount;

    /**
     * 按租期单价(单位), 与选择的设备、事业部、业务模式有关
     */
    private String leaseTermPriceUnit;

    /**
     * 租金标准价(单位), 与选择的设备、事业部、业务模式有关
     */
    private String standardRentUnit;

    /**
     * 押金单价(单位)，默认元
     */
    private String depositUnit;

    /**
     * 价值(单位)，默认元
     */
    private String creditPriceUnit;

    /**
     * 初始导入数据
     */
    private String initData;

    /**
     * 初始化导入数据时间
     */
    private Date initDataTime;

    /**
     * 租金单价
     */
    private BigDecimal rantalPrice;

    /**
     * 租金单价单位
     */
    private String rantalPriceUnit;

    /**
     * 变更前原订单数量
     */
    private BigDecimal originalQuantity;

    /**
     * 警告，根据实际联系营业店现有商品型号进行判断
     */
    private String waringMessage;

    /**
     * dtl_chkChange
     */
    private Boolean dtlChkchange;

    /**
     * 内部结算标准价
     */
    private BigDecimal innerSettleStandardAmount;

    /**
     * 内部结算折扣
     */
    private BigDecimal innerSettleDiscount;

    /**
     * 签约设备、材料
     */
    private Integer signItemId;

    /**
     * 最小起租周期
     */
    private BigDecimal minLeaseCycle;

    /**
     * 最小起租金额
     */
    private BigDecimal minRentAmount;

    /**
     * 来源DtlID
     */
    private BigDecimal sourceDtlid;

    /**
     * 阶段价格(文字)
     */
    private String stepPriceDesc;

    /**
     * 是否有阶段价格，取值为空，字段值取值。
     */
    private Boolean hasStepPrice;

    /**
     * 补充数量
     */
    private BigDecimal supplementQuantity;

    /**
     * 补充租期
     */
    private BigDecimal supplementLeaseTerm;

    /**
     * 补充租期单价
     */
    private BigDecimal supplementLeasePrice;

    /**
     * 提货期间止
     */
    private Date deliveryDateEnd;

    /**
     * 预付款单价，默认元
     */
    private BigDecimal advancePrice;

    /**
     * 预付款单价(单位)，默认元
     */
    private String advancePriceUnit;

    /**
     * 数量和预收款单价的乘积
     */
    private BigDecimal totalAdvance;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 原ERP BillDtlID
     * @return erp_billdtl_id 原ERP BillDtlID
     */
    public Integer getErpBilldtlId() {
        return erpBilldtlId;
    }

    /**
     * 原ERP BillDtlID
     * @param erpBilldtlId 原ERP BillDtlID
     */
    public void setErpBilldtlId(Integer erpBilldtlId) {
        this.erpBilldtlId = erpBilldtlId;
    }

    /**
     * 原ERP BillID
     * @return erp_id 原ERP BillID
     */
    public Integer getErpId() {
        return erpId;
    }

    /**
     * 原ERP BillID
     * @param erpId 原ERP BillID
     */
    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    /**
     * OMS 租赁订单ID
     * @return order_id OMS 租赁订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * OMS 租赁订单ID
     * @param orderId OMS 租赁订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 明细行号
     * @return line_number 明细行号
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * 明细行号
     * @param lineNumber 明细行号
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * 租赁订单编号
     * @return order_no 租赁订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 租赁订单编号
     * @param orderNo 租赁订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 类别, 11 设备型号/20 材料
     * @return item_type 类别, 11 设备型号/20 材料
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * 类别, 11 设备型号/20 材料
     * @param itemType 类别, 11 设备型号/20 材料
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * 商品编号ID
     * @return item_id 商品编号ID
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 商品编号ID
     * @param itemId 商品编号ID
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 商品编号
     * @return item_no 商品编号
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * 商品编号
     * @param itemNo 商品编号
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    /**
     * 商品名
     * @return item_name 商品名
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 商品名
     * @param itemName 商品名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 商品类型编号
     * @return item_type_code 商品类型编号
     */
    public String getItemTypeCode() {
        return itemTypeCode;
    }

    /**
     * 商品类型编号
     * @param itemTypeCode 商品类型编号
     */
    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode == null ? null : itemTypeCode.trim();
    }

    /**
     * 商品类型名称
     * @return item_type_name 商品类型名称
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * 商品类型名称
     * @param itemTypeName 商品类型名称
     */
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName == null ? null : itemTypeName.trim();
    }

    /**
     * 规格
     * @return item_model 规格
     */
    public String getItemModel() {
        return itemModel;
    }

    /**
     * 规格
     * @param itemModel 规格
     */
    public void setItemModel(String itemModel) {
        this.itemModel = itemModel == null ? null : itemModel.trim();
    }

    /**
     * 品牌编号
     * @return item_brand 品牌编号
     */
    public String getItemBrand() {
        return itemBrand;
    }

    /**
     * 品牌编号
     * @param itemBrand 品牌编号
     */
    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand == null ? null : itemBrand.trim();
    }

    /**
     * 品牌名称
     * @return item_brand_name 品牌名称
     */
    public String getItemBrandName() {
        return itemBrandName;
    }

    /**
     * 品牌名称
     * @param itemBrandName 品牌名称
     */
    public void setItemBrandName(String itemBrandName) {
        this.itemBrandName = itemBrandName == null ? null : itemBrandName.trim();
    }

    /**
     * 数量
     * @return item_quantity 数量
     */
    public BigDecimal getItemQuantity() {
        return itemQuantity;
    }

    /**
     * 数量
     * @param itemQuantity 数量
     */
    public void setItemQuantity(BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /**
     * 计量单位
     * @return item_unit 计量单位
     */
    public Integer getItemUnit() {
        return itemUnit;
    }

    /**
     * 计量单位
     * @param itemUnit 计量单位
     */
    public void setItemUnit(Integer itemUnit) {
        this.itemUnit = itemUnit;
    }

    /**
     * 进场日期
     * @return approach_date 进场日期
     */
    public Date getApproachDate() {
        return approachDate;
    }

    /**
     * 进场日期
     * @param approachDate 进场日期
     */
    public void setApproachDate(Date approachDate) {
        this.approachDate = approachDate;
    }

    /**
     * 租期
     * @return lease_term 租期
     */
    public BigDecimal getLeaseTerm() {
        return leaseTerm;
    }

    /**
     * 租期
     * @param leaseTerm 租期
     */
    public void setLeaseTerm(BigDecimal leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    /**
     * 租期单位, 立方/月/周/日/台班/季/年/平方/立方
     * @return lease_unit 租期单位, 立方/月/周/日/台班/季/年/平方/立方
     */
    public Integer getLeaseUnit() {
        return leaseUnit;
    }

    /**
     * 租期单位, 立方/月/周/日/台班/季/年/平方/立方
     * @param leaseUnit 租期单位, 立方/月/周/日/台班/季/年/平方/立方
     */
    public void setLeaseUnit(Integer leaseUnit) {
        this.leaseUnit = leaseUnit;
    }

    /**
     * 结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方
     * @return settle_method 结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方
     */
    public Integer getSettleMethod() {
        return settleMethod;
    }

    /**
     * 结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方
     * @param settleMethod 结算方式, 按天/按台班/按平方/按吨/按拌合吨数/按立方
     */
    public void setSettleMethod(Integer settleMethod) {
        this.settleMethod = settleMethod;
    }

    /**
     * 押金单价
     * @return deposit_unit_price 押金单价
     */
    public BigDecimal getDepositUnitPrice() {
        return depositUnitPrice;
    }

    /**
     * 押金单价
     * @param depositUnitPrice 押金单价
     */
    public void setDepositUnitPrice(BigDecimal depositUnitPrice) {
        this.depositUnitPrice = depositUnitPrice;
    }

    /**
     * 计价方式, 日价格/周价格/月价格/季价格
     * @return price_mode 计价方式, 日价格/周价格/月价格/季价格
     */
    public Integer getPriceMode() {
        return priceMode;
    }

    /**
     * 计价方式, 日价格/周价格/月价格/季价格
     * @param priceMode 计价方式, 日价格/周价格/月价格/季价格
     */
    public void setPriceMode(Integer priceMode) {
        this.priceMode = priceMode;
    }

    /**
     * 租金标准价
     * @return standard_rent 租金标准价
     */
    public BigDecimal getStandardRent() {
        return standardRent;
    }

    /**
     * 租金标准价
     * @param standardRent 租金标准价
     */
    public void setStandardRent(BigDecimal standardRent) {
        this.standardRent = standardRent;
    }

    /**
     * 折扣率(%)
     * @return discount_rate 折扣率(%)
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * 折扣率(%)
     * @param discountRate 折扣率(%)
     */
    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * 按租期单价
     * @return lease_term_price 按租期单价
     */
    public BigDecimal getLeaseTermPrice() {
        return leaseTermPrice;
    }

    /**
     * 按租期单价
     * @param leaseTermPrice 按租期单价
     */
    public void setLeaseTermPrice(BigDecimal leaseTermPrice) {
        this.leaseTermPrice = leaseTermPrice;
    }

    /**
     * 阶段价格
     * @return step_price 阶段价格
     */
    public String getStepPrice() {
        return stepPrice;
    }

    /**
     * 阶段价格
     * @param stepPrice 阶段价格
     */
    public void setStepPrice(String stepPrice) {
        this.stepPrice = stepPrice == null ? null : stepPrice.trim();
    }

    /**
     * 阶段价格数据
     * @return step_price_data 阶段价格数据
     */
    public String getStepPriceData() {
        return stepPriceData;
    }

    /**
     * 阶段价格数据
     * @param stepPriceData 阶段价格数据
     */
    public void setStepPriceData(String stepPriceData) {
        this.stepPriceData = stepPriceData == null ? null : stepPriceData.trim();
    }

    /**
     * 附加条款
     * @return additional_clause 附加条款
     */
    public String getAdditionalClause() {
        return additionalClause;
    }

    /**
     * 附加条款
     * @param additionalClause 附加条款
     */
    public void setAdditionalClause(String additionalClause) {
        this.additionalClause = additionalClause == null ? null : additionalClause.trim();
    }

    /**
     * 附加条款数据
     * @return additional_clause_data 附加条款数据
     */
    public String getAdditionalClauseData() {
        return additionalClauseData;
    }

    /**
     * 附加条款数据
     * @param additionalClauseData 附加条款数据
     */
    public void setAdditionalClauseData(String additionalClauseData) {
        this.additionalClauseData = additionalClauseData == null ? null : additionalClauseData.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 序号
     * @return dtl_no 序号
     */
    public Integer getDtlNo() {
        return dtlNo;
    }

    /**
     * 序号
     * @param dtlNo 序号
     */
    public void setDtlNo(Integer dtlNo) {
        this.dtlNo = dtlNo;
    }

    /**
     * 材料换算率
     * @return material_conversion_rate 材料换算率
     */
    public String getMaterialConversionRate() {
        return materialConversionRate;
    }

    /**
     * 材料换算率
     * @param materialConversionRate 材料换算率
     */
    public void setMaterialConversionRate(String materialConversionRate) {
        this.materialConversionRate = materialConversionRate == null ? null : materialConversionRate.trim();
    }

    /**
     * 材料换算率数据
     * @return material_conversion_rate_data 材料换算率数据
     */
    public String getMaterialConversionRateData() {
        return materialConversionRateData;
    }

    /**
     * 材料换算率数据
     * @param materialConversionRateData 材料换算率数据
     */
    public void setMaterialConversionRateData(String materialConversionRateData) {
        this.materialConversionRateData = materialConversionRateData == null ? null : materialConversionRateData.trim();
    }

    /**
     * 跟踪号
     * @return tracking_id 跟踪号
     */
    public Integer getTrackingId() {
        return trackingId;
    }

    /**
     * 跟踪号
     * @param trackingId 跟踪号
     */
    public void setTrackingId(Integer trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * 价值
     * @return credit_price 价值
     */
    public BigDecimal getCreditPrice() {
        return creditPrice;
    }

    /**
     * 价值
     * @param creditPrice 价值
     */
    public void setCreditPrice(BigDecimal creditPrice) {
        this.creditPrice = creditPrice;
    }

    /**
     * 指定设备
     * @return define_item 指定设备
     */
    public String getDefineItem() {
        return defineItem;
    }

    /**
     * 指定设备
     * @param defineItem 指定设备
     */
    public void setDefineItem(String defineItem) {
        this.defineItem = defineItem == null ? null : defineItem.trim();
    }

    /**
     * 标准租金金额
     * @return standard_rent_amount 标准租金金额
     */
    public BigDecimal getStandardRentAmount() {
        return standardRentAmount;
    }

    /**
     * 标准租金金额
     * @param standardRentAmount 标准租金金额
     */
    public void setStandardRentAmount(BigDecimal standardRentAmount) {
        this.standardRentAmount = standardRentAmount;
    }

    /**
     * 折后租金金额
     * @return discount_rent_amount 折后租金金额
     */
    public BigDecimal getDiscountRentAmount() {
        return discountRentAmount;
    }

    /**
     * 折后租金金额
     * @param discountRentAmount 折后租金金额
     */
    public void setDiscountRentAmount(BigDecimal discountRentAmount) {
        this.discountRentAmount = discountRentAmount;
    }

    /**
     * 标准价来源
     * @return standard_amount_id 标准价来源
     */
    public Integer getStandardAmountId() {
        return standardAmountId;
    }

    /**
     * 标准价来源
     * @param standardAmountId 标准价来源
     */
    public void setStandardAmountId(Integer standardAmountId) {
        this.standardAmountId = standardAmountId;
    }

    /**
     * 授信价格来源
     * @return credit_price_id 授信价格来源
     */
    public Integer getCreditPriceId() {
        return creditPriceId;
    }

    /**
     * 授信价格来源
     * @param creditPriceId 授信价格来源
     */
    public void setCreditPriceId(Integer creditPriceId) {
        this.creditPriceId = creditPriceId;
    }

    /**
     * 押金金额
     * @return deposit_amount 押金金额
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * 押金金额
     * @param depositAmount 押金金额
     */
    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * 按租期单价(单位), 与选择的设备、事业部、业务模式有关
     * @return lease_term_price_unit 按租期单价(单位), 与选择的设备、事业部、业务模式有关
     */
    public String getLeaseTermPriceUnit() {
        return leaseTermPriceUnit;
    }

    /**
     * 按租期单价(单位), 与选择的设备、事业部、业务模式有关
     * @param leaseTermPriceUnit 按租期单价(单位), 与选择的设备、事业部、业务模式有关
     */
    public void setLeaseTermPriceUnit(String leaseTermPriceUnit) {
        this.leaseTermPriceUnit = leaseTermPriceUnit == null ? null : leaseTermPriceUnit.trim();
    }

    /**
     * 租金标准价(单位), 与选择的设备、事业部、业务模式有关
     * @return standard_rent_unit 租金标准价(单位), 与选择的设备、事业部、业务模式有关
     */
    public String getStandardRentUnit() {
        return standardRentUnit;
    }

    /**
     * 租金标准价(单位), 与选择的设备、事业部、业务模式有关
     * @param standardRentUnit 租金标准价(单位), 与选择的设备、事业部、业务模式有关
     */
    public void setStandardRentUnit(String standardRentUnit) {
        this.standardRentUnit = standardRentUnit == null ? null : standardRentUnit.trim();
    }

    /**
     * 押金单价(单位)，默认元
     * @return deposit_unit 押金单价(单位)，默认元
     */
    public String getDepositUnit() {
        return depositUnit;
    }

    /**
     * 押金单价(单位)，默认元
     * @param depositUnit 押金单价(单位)，默认元
     */
    public void setDepositUnit(String depositUnit) {
        this.depositUnit = depositUnit == null ? null : depositUnit.trim();
    }

    /**
     * 价值(单位)，默认元
     * @return credit_price_unit 价值(单位)，默认元
     */
    public String getCreditPriceUnit() {
        return creditPriceUnit;
    }

    /**
     * 价值(单位)，默认元
     * @param creditPriceUnit 价值(单位)，默认元
     */
    public void setCreditPriceUnit(String creditPriceUnit) {
        this.creditPriceUnit = creditPriceUnit == null ? null : creditPriceUnit.trim();
    }

    /**
     * 初始导入数据
     * @return init_data 初始导入数据
     */
    public String getInitData() {
        return initData;
    }

    /**
     * 初始导入数据
     * @param initData 初始导入数据
     */
    public void setInitData(String initData) {
        this.initData = initData == null ? null : initData.trim();
    }

    /**
     * 初始化导入数据时间
     * @return init_data_time 初始化导入数据时间
     */
    public Date getInitDataTime() {
        return initDataTime;
    }

    /**
     * 初始化导入数据时间
     * @param initDataTime 初始化导入数据时间
     */
    public void setInitDataTime(Date initDataTime) {
        this.initDataTime = initDataTime;
    }

    /**
     * 租金单价
     * @return rantal_price 租金单价
     */
    public BigDecimal getRantalPrice() {
        return rantalPrice;
    }

    /**
     * 租金单价
     * @param rantalPrice 租金单价
     */
    public void setRantalPrice(BigDecimal rantalPrice) {
        this.rantalPrice = rantalPrice;
    }

    /**
     * 租金单价单位
     * @return rantal_price_unit 租金单价单位
     */
    public String getRantalPriceUnit() {
        return rantalPriceUnit;
    }

    /**
     * 租金单价单位
     * @param rantalPriceUnit 租金单价单位
     */
    public void setRantalPriceUnit(String rantalPriceUnit) {
        this.rantalPriceUnit = rantalPriceUnit == null ? null : rantalPriceUnit.trim();
    }

    /**
     * 变更前原订单数量
     * @return original_quantity 变更前原订单数量
     */
    public BigDecimal getOriginalQuantity() {
        return originalQuantity;
    }

    /**
     * 变更前原订单数量
     * @param originalQuantity 变更前原订单数量
     */
    public void setOriginalQuantity(BigDecimal originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    /**
     * 警告，根据实际联系营业店现有商品型号进行判断
     * @return waring_message 警告，根据实际联系营业店现有商品型号进行判断
     */
    public String getWaringMessage() {
        return waringMessage;
    }

    /**
     * 警告，根据实际联系营业店现有商品型号进行判断
     * @param waringMessage 警告，根据实际联系营业店现有商品型号进行判断
     */
    public void setWaringMessage(String waringMessage) {
        this.waringMessage = waringMessage == null ? null : waringMessage.trim();
    }

    /**
     * dtl_chkChange
     * @return dtl_chkChange dtl_chkChange
     */
    public Boolean getDtlChkchange() {
        return dtlChkchange;
    }

    /**
     * dtl_chkChange
     * @param dtlChkchange dtl_chkChange
     */
    public void setDtlChkchange(Boolean dtlChkchange) {
        this.dtlChkchange = dtlChkchange;
    }

    /**
     * 内部结算标准价
     * @return inner_settle_standard_amount 内部结算标准价
     */
    public BigDecimal getInnerSettleStandardAmount() {
        return innerSettleStandardAmount;
    }

    /**
     * 内部结算标准价
     * @param innerSettleStandardAmount 内部结算标准价
     */
    public void setInnerSettleStandardAmount(BigDecimal innerSettleStandardAmount) {
        this.innerSettleStandardAmount = innerSettleStandardAmount;
    }

    /**
     * 内部结算折扣
     * @return inner_settle_discount 内部结算折扣
     */
    public BigDecimal getInnerSettleDiscount() {
        return innerSettleDiscount;
    }

    /**
     * 内部结算折扣
     * @param innerSettleDiscount 内部结算折扣
     */
    public void setInnerSettleDiscount(BigDecimal innerSettleDiscount) {
        this.innerSettleDiscount = innerSettleDiscount;
    }

    /**
     * 签约设备、材料
     * @return sign_item_id 签约设备、材料
     */
    public Integer getSignItemId() {
        return signItemId;
    }

    /**
     * 签约设备、材料
     * @param signItemId 签约设备、材料
     */
    public void setSignItemId(Integer signItemId) {
        this.signItemId = signItemId;
    }

    /**
     * 最小起租周期
     * @return min_lease_cycle 最小起租周期
     */
    public BigDecimal getMinLeaseCycle() {
        return minLeaseCycle;
    }

    /**
     * 最小起租周期
     * @param minLeaseCycle 最小起租周期
     */
    public void setMinLeaseCycle(BigDecimal minLeaseCycle) {
        this.minLeaseCycle = minLeaseCycle;
    }

    /**
     * 最小起租金额
     * @return min_rent_amount 最小起租金额
     */
    public BigDecimal getMinRentAmount() {
        return minRentAmount;
    }

    /**
     * 最小起租金额
     * @param minRentAmount 最小起租金额
     */
    public void setMinRentAmount(BigDecimal minRentAmount) {
        this.minRentAmount = minRentAmount;
    }

    /**
     * 来源DtlID
     * @return source_dtlId 来源DtlID
     */
    public BigDecimal getSourceDtlid() {
        return sourceDtlid;
    }

    /**
     * 来源DtlID
     * @param sourceDtlid 来源DtlID
     */
    public void setSourceDtlid(BigDecimal sourceDtlid) {
        this.sourceDtlid = sourceDtlid;
    }

    /**
     * 阶段价格(文字)
     * @return step_price_desc 阶段价格(文字)
     */
    public String getStepPriceDesc() {
        return stepPriceDesc;
    }

    /**
     * 阶段价格(文字)
     * @param stepPriceDesc 阶段价格(文字)
     */
    public void setStepPriceDesc(String stepPriceDesc) {
        this.stepPriceDesc = stepPriceDesc == null ? null : stepPriceDesc.trim();
    }

    /**
     * 是否有阶段价格，取值为空，字段值取值。
     * @return has_step_price 是否有阶段价格，取值为空，字段值取值。
     */
    public Boolean getHasStepPrice() {
        return hasStepPrice;
    }

    /**
     * 是否有阶段价格，取值为空，字段值取值。
     * @param hasStepPrice 是否有阶段价格，取值为空，字段值取值。
     */
    public void setHasStepPrice(Boolean hasStepPrice) {
        this.hasStepPrice = hasStepPrice;
    }

    /**
     * 补充数量
     * @return supplement_quantity 补充数量
     */
    public BigDecimal getSupplementQuantity() {
        return supplementQuantity;
    }

    /**
     * 补充数量
     * @param supplementQuantity 补充数量
     */
    public void setSupplementQuantity(BigDecimal supplementQuantity) {
        this.supplementQuantity = supplementQuantity;
    }

    /**
     * 补充租期
     * @return supplement_lease_term 补充租期
     */
    public BigDecimal getSupplementLeaseTerm() {
        return supplementLeaseTerm;
    }

    /**
     * 补充租期
     * @param supplementLeaseTerm 补充租期
     */
    public void setSupplementLeaseTerm(BigDecimal supplementLeaseTerm) {
        this.supplementLeaseTerm = supplementLeaseTerm;
    }

    /**
     * 补充租期单价
     * @return supplement_lease_price 补充租期单价
     */
    public BigDecimal getSupplementLeasePrice() {
        return supplementLeasePrice;
    }

    /**
     * 补充租期单价
     * @param supplementLeasePrice 补充租期单价
     */
    public void setSupplementLeasePrice(BigDecimal supplementLeasePrice) {
        this.supplementLeasePrice = supplementLeasePrice;
    }

    /**
     * 提货期间止
     * @return delivery_date_end 提货期间止
     */
    public Date getDeliveryDateEnd() {
        return deliveryDateEnd;
    }

    /**
     * 提货期间止
     * @param deliveryDateEnd 提货期间止
     */
    public void setDeliveryDateEnd(Date deliveryDateEnd) {
        this.deliveryDateEnd = deliveryDateEnd;
    }

    /**
     * 预付款单价，默认元
     * @return advance_price 预付款单价，默认元
     */
    public BigDecimal getAdvancePrice() {
        return advancePrice;
    }

    /**
     * 预付款单价，默认元
     * @param advancePrice 预付款单价，默认元
     */
    public void setAdvancePrice(BigDecimal advancePrice) {
        this.advancePrice = advancePrice;
    }

    /**
     * 预付款单价(单位)，默认元
     * @return advance_price_unit 预付款单价(单位)，默认元
     */
    public String getAdvancePriceUnit() {
        return advancePriceUnit;
    }

    /**
     * 预付款单价(单位)，默认元
     * @param advancePriceUnit 预付款单价(单位)，默认元
     */
    public void setAdvancePriceUnit(String advancePriceUnit) {
        this.advancePriceUnit = advancePriceUnit == null ? null : advancePriceUnit.trim();
    }

    /**
     * 数量和预收款单价的乘积
     * @return total_advance 数量和预收款单价的乘积
     */
    public BigDecimal getTotalAdvance() {
        return totalAdvance;
    }

    /**
     * 数量和预收款单价的乘积
     * @param totalAdvance 数量和预收款单价的乘积
     */
    public void setTotalAdvance(BigDecimal totalAdvance) {
        this.totalAdvance = totalAdvance;
    }
}