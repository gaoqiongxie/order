package com.order.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    private Integer id;

    private Integer erpBilldtlId;

    private Integer erpId;

    private Integer orderId;

    private Integer lineNumber;

    private String orderNo;

    private Integer itemType;

    private Integer itemId;

    private String itemNo;

    private String itemName;

    private String itemTypeCode;

    private String itemTypeName;

    private String itemModel;

    private String itemBrand;

    private String itemBrandName;

    private BigDecimal itemQuantity;

    private Integer itemUnit;

    private Date approachDate;

    private BigDecimal leaseTerm;

    private Integer leaseUnit;

    private Integer settleMethod;

    private BigDecimal depositUnitPrice;

    private Integer priceMode;

    private BigDecimal standardRent;

    private BigDecimal discountRate;

    private BigDecimal leaseTermPrice;

    private String stepPrice;

    private String stepPriceData;

    private String additionalClause;

    private String additionalClauseData;

    private String remark;

    private Integer dtlNo;

    private String materialConversionRate;

    private String materialConversionRateData;

    private Integer trackingId;

    private BigDecimal creditPrice;

    private String defineItem;

    private BigDecimal standardRentAmount;

    private BigDecimal discountRentAmount;

    private Integer standardAmountId;

    private Integer creditPriceId;

    private BigDecimal depositAmount;

    private String leaseTermPriceUnit;

    private String standardRentUnit;

    private String depositUnit;

    private String creditPriceUnit;

    private String initData;

    private Date initDataTime;

    private BigDecimal rantalPrice;

    private String rantalPriceUnit;

    private BigDecimal originalQuantity;

    private String waringMessage;

    private Boolean dtlChkchange;

    private BigDecimal innerSettleStandardAmount;

    private BigDecimal innerSettleDiscount;

    private Integer signItemId;

    private BigDecimal minLeaseCycle;

    private BigDecimal minRentAmount;

    private BigDecimal sourceDtlid;

    private String stepPriceDesc;

    private Boolean hasStepPrice;

    private BigDecimal supplementQuantity;

    private BigDecimal supplementLeaseTerm;

    private BigDecimal supplementLeasePrice;

    private Date deliveryDateEnd;

    private BigDecimal advancePrice;

    private String advancePriceUnit;

    private BigDecimal totalAdvance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getErpBilldtlId() {
        return erpBilldtlId;
    }

    public void setErpBilldtlId(Integer erpBilldtlId) {
        this.erpBilldtlId = erpBilldtlId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode == null ? null : itemTypeCode.trim();
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName == null ? null : itemTypeName.trim();
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel == null ? null : itemModel.trim();
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand == null ? null : itemBrand.trim();
    }

    public String getItemBrandName() {
        return itemBrandName;
    }

    public void setItemBrandName(String itemBrandName) {
        this.itemBrandName = itemBrandName == null ? null : itemBrandName.trim();
    }

    public BigDecimal getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Integer getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(Integer itemUnit) {
        this.itemUnit = itemUnit;
    }

    public Date getApproachDate() {
        return approachDate;
    }

    public void setApproachDate(Date approachDate) {
        this.approachDate = approachDate;
    }

    public BigDecimal getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(BigDecimal leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public Integer getLeaseUnit() {
        return leaseUnit;
    }

    public void setLeaseUnit(Integer leaseUnit) {
        this.leaseUnit = leaseUnit;
    }

    public Integer getSettleMethod() {
        return settleMethod;
    }

    public void setSettleMethod(Integer settleMethod) {
        this.settleMethod = settleMethod;
    }

    public BigDecimal getDepositUnitPrice() {
        return depositUnitPrice;
    }

    public void setDepositUnitPrice(BigDecimal depositUnitPrice) {
        this.depositUnitPrice = depositUnitPrice;
    }

    public Integer getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(Integer priceMode) {
        this.priceMode = priceMode;
    }

    public BigDecimal getStandardRent() {
        return standardRent;
    }

    public void setStandardRent(BigDecimal standardRent) {
        this.standardRent = standardRent;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getLeaseTermPrice() {
        return leaseTermPrice;
    }

    public void setLeaseTermPrice(BigDecimal leaseTermPrice) {
        this.leaseTermPrice = leaseTermPrice;
    }

    public String getStepPrice() {
        return stepPrice;
    }

    public void setStepPrice(String stepPrice) {
        this.stepPrice = stepPrice == null ? null : stepPrice.trim();
    }

    public String getStepPriceData() {
        return stepPriceData;
    }

    public void setStepPriceData(String stepPriceData) {
        this.stepPriceData = stepPriceData == null ? null : stepPriceData.trim();
    }

    public String getAdditionalClause() {
        return additionalClause;
    }

    public void setAdditionalClause(String additionalClause) {
        this.additionalClause = additionalClause == null ? null : additionalClause.trim();
    }

    public String getAdditionalClauseData() {
        return additionalClauseData;
    }

    public void setAdditionalClauseData(String additionalClauseData) {
        this.additionalClauseData = additionalClauseData == null ? null : additionalClauseData.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDtlNo() {
        return dtlNo;
    }

    public void setDtlNo(Integer dtlNo) {
        this.dtlNo = dtlNo;
    }

    public String getMaterialConversionRate() {
        return materialConversionRate;
    }

    public void setMaterialConversionRate(String materialConversionRate) {
        this.materialConversionRate = materialConversionRate == null ? null : materialConversionRate.trim();
    }

    public String getMaterialConversionRateData() {
        return materialConversionRateData;
    }

    public void setMaterialConversionRateData(String materialConversionRateData) {
        this.materialConversionRateData = materialConversionRateData == null ? null : materialConversionRateData.trim();
    }

    public Integer getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(Integer trackingId) {
        this.trackingId = trackingId;
    }

    public BigDecimal getCreditPrice() {
        return creditPrice;
    }

    public void setCreditPrice(BigDecimal creditPrice) {
        this.creditPrice = creditPrice;
    }

    public String getDefineItem() {
        return defineItem;
    }

    public void setDefineItem(String defineItem) {
        this.defineItem = defineItem == null ? null : defineItem.trim();
    }

    public BigDecimal getStandardRentAmount() {
        return standardRentAmount;
    }

    public void setStandardRentAmount(BigDecimal standardRentAmount) {
        this.standardRentAmount = standardRentAmount;
    }

    public BigDecimal getDiscountRentAmount() {
        return discountRentAmount;
    }

    public void setDiscountRentAmount(BigDecimal discountRentAmount) {
        this.discountRentAmount = discountRentAmount;
    }

    public Integer getStandardAmountId() {
        return standardAmountId;
    }

    public void setStandardAmountId(Integer standardAmountId) {
        this.standardAmountId = standardAmountId;
    }

    public Integer getCreditPriceId() {
        return creditPriceId;
    }

    public void setCreditPriceId(Integer creditPriceId) {
        this.creditPriceId = creditPriceId;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getLeaseTermPriceUnit() {
        return leaseTermPriceUnit;
    }

    public void setLeaseTermPriceUnit(String leaseTermPriceUnit) {
        this.leaseTermPriceUnit = leaseTermPriceUnit == null ? null : leaseTermPriceUnit.trim();
    }

    public String getStandardRentUnit() {
        return standardRentUnit;
    }

    public void setStandardRentUnit(String standardRentUnit) {
        this.standardRentUnit = standardRentUnit == null ? null : standardRentUnit.trim();
    }

    public String getDepositUnit() {
        return depositUnit;
    }

    public void setDepositUnit(String depositUnit) {
        this.depositUnit = depositUnit == null ? null : depositUnit.trim();
    }

    public String getCreditPriceUnit() {
        return creditPriceUnit;
    }

    public void setCreditPriceUnit(String creditPriceUnit) {
        this.creditPriceUnit = creditPriceUnit == null ? null : creditPriceUnit.trim();
    }

    public String getInitData() {
        return initData;
    }

    public void setInitData(String initData) {
        this.initData = initData == null ? null : initData.trim();
    }

    public Date getInitDataTime() {
        return initDataTime;
    }

    public void setInitDataTime(Date initDataTime) {
        this.initDataTime = initDataTime;
    }

    public BigDecimal getRantalPrice() {
        return rantalPrice;
    }

    public void setRantalPrice(BigDecimal rantalPrice) {
        this.rantalPrice = rantalPrice;
    }

    public String getRantalPriceUnit() {
        return rantalPriceUnit;
    }

    public void setRantalPriceUnit(String rantalPriceUnit) {
        this.rantalPriceUnit = rantalPriceUnit == null ? null : rantalPriceUnit.trim();
    }

    public BigDecimal getOriginalQuantity() {
        return originalQuantity;
    }

    public void setOriginalQuantity(BigDecimal originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    public String getWaringMessage() {
        return waringMessage;
    }

    public void setWaringMessage(String waringMessage) {
        this.waringMessage = waringMessage == null ? null : waringMessage.trim();
    }

    public Boolean getDtlChkchange() {
        return dtlChkchange;
    }

    public void setDtlChkchange(Boolean dtlChkchange) {
        this.dtlChkchange = dtlChkchange;
    }

    public BigDecimal getInnerSettleStandardAmount() {
        return innerSettleStandardAmount;
    }

    public void setInnerSettleStandardAmount(BigDecimal innerSettleStandardAmount) {
        this.innerSettleStandardAmount = innerSettleStandardAmount;
    }

    public BigDecimal getInnerSettleDiscount() {
        return innerSettleDiscount;
    }

    public void setInnerSettleDiscount(BigDecimal innerSettleDiscount) {
        this.innerSettleDiscount = innerSettleDiscount;
    }

    public Integer getSignItemId() {
        return signItemId;
    }

    public void setSignItemId(Integer signItemId) {
        this.signItemId = signItemId;
    }

    public BigDecimal getMinLeaseCycle() {
        return minLeaseCycle;
    }

    public void setMinLeaseCycle(BigDecimal minLeaseCycle) {
        this.minLeaseCycle = minLeaseCycle;
    }

    public BigDecimal getMinRentAmount() {
        return minRentAmount;
    }

    public void setMinRentAmount(BigDecimal minRentAmount) {
        this.minRentAmount = minRentAmount;
    }

    public BigDecimal getSourceDtlid() {
        return sourceDtlid;
    }

    public void setSourceDtlid(BigDecimal sourceDtlid) {
        this.sourceDtlid = sourceDtlid;
    }

    public String getStepPriceDesc() {
        return stepPriceDesc;
    }

    public void setStepPriceDesc(String stepPriceDesc) {
        this.stepPriceDesc = stepPriceDesc == null ? null : stepPriceDesc.trim();
    }

    public Boolean getHasStepPrice() {
        return hasStepPrice;
    }

    public void setHasStepPrice(Boolean hasStepPrice) {
        this.hasStepPrice = hasStepPrice;
    }

    public BigDecimal getSupplementQuantity() {
        return supplementQuantity;
    }

    public void setSupplementQuantity(BigDecimal supplementQuantity) {
        this.supplementQuantity = supplementQuantity;
    }

    public BigDecimal getSupplementLeaseTerm() {
        return supplementLeaseTerm;
    }

    public void setSupplementLeaseTerm(BigDecimal supplementLeaseTerm) {
        this.supplementLeaseTerm = supplementLeaseTerm;
    }

    public BigDecimal getSupplementLeasePrice() {
        return supplementLeasePrice;
    }

    public void setSupplementLeasePrice(BigDecimal supplementLeasePrice) {
        this.supplementLeasePrice = supplementLeasePrice;
    }

    public Date getDeliveryDateEnd() {
        return deliveryDateEnd;
    }

    public void setDeliveryDateEnd(Date deliveryDateEnd) {
        this.deliveryDateEnd = deliveryDateEnd;
    }

    public BigDecimal getAdvancePrice() {
        return advancePrice;
    }

    public void setAdvancePrice(BigDecimal advancePrice) {
        this.advancePrice = advancePrice;
    }

    public String getAdvancePriceUnit() {
        return advancePriceUnit;
    }

    public void setAdvancePriceUnit(String advancePriceUnit) {
        this.advancePriceUnit = advancePriceUnit == null ? null : advancePriceUnit.trim();
    }

    public BigDecimal getTotalAdvance() {
        return totalAdvance;
    }

    public void setTotalAdvance(BigDecimal totalAdvance) {
        this.totalAdvance = totalAdvance;
    }
}