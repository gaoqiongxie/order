package com.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderDetailExample {
    /**
     * order_detail
     */
    protected String orderByClause;

    /**
     * order_detail
     */
    protected boolean distinct;

    /**
     * order_detail
     */
    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * order_detail 2020-01-20
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdIsNull() {
            addCriterion("erp_billdtl_id is null");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdIsNotNull() {
            addCriterion("erp_billdtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdEqualTo(Integer value) {
            addCriterion("erp_billdtl_id =", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdNotEqualTo(Integer value) {
            addCriterion("erp_billdtl_id <>", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdGreaterThan(Integer value) {
            addCriterion("erp_billdtl_id >", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("erp_billdtl_id >=", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdLessThan(Integer value) {
            addCriterion("erp_billdtl_id <", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("erp_billdtl_id <=", value, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdIn(List<Integer> values) {
            addCriterion("erp_billdtl_id in", values, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdNotIn(List<Integer> values) {
            addCriterion("erp_billdtl_id not in", values, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdBetween(Integer value1, Integer value2) {
            addCriterion("erp_billdtl_id between", value1, value2, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpBilldtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("erp_billdtl_id not between", value1, value2, "erpBilldtlId");
            return (Criteria) this;
        }

        public Criteria andErpIdIsNull() {
            addCriterion("erp_id is null");
            return (Criteria) this;
        }

        public Criteria andErpIdIsNotNull() {
            addCriterion("erp_id is not null");
            return (Criteria) this;
        }

        public Criteria andErpIdEqualTo(Integer value) {
            addCriterion("erp_id =", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotEqualTo(Integer value) {
            addCriterion("erp_id <>", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdGreaterThan(Integer value) {
            addCriterion("erp_id >", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("erp_id >=", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdLessThan(Integer value) {
            addCriterion("erp_id <", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdLessThanOrEqualTo(Integer value) {
            addCriterion("erp_id <=", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdIn(List<Integer> values) {
            addCriterion("erp_id in", values, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotIn(List<Integer> values) {
            addCriterion("erp_id not in", values, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdBetween(Integer value1, Integer value2) {
            addCriterion("erp_id between", value1, value2, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("erp_id not between", value1, value2, "erpId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNull() {
            addCriterion("line_number is null");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNotNull() {
            addCriterion("line_number is not null");
            return (Criteria) this;
        }

        public Criteria andLineNumberEqualTo(Integer value) {
            addCriterion("line_number =", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotEqualTo(Integer value) {
            addCriterion("line_number <>", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThan(Integer value) {
            addCriterion("line_number >", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_number >=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThan(Integer value) {
            addCriterion("line_number <", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThanOrEqualTo(Integer value) {
            addCriterion("line_number <=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberIn(List<Integer> values) {
            addCriterion("line_number in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotIn(List<Integer> values) {
            addCriterion("line_number not in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberBetween(Integer value1, Integer value2) {
            addCriterion("line_number between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("line_number not between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("item_no is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("item_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("item_no =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("item_no <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("item_no >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_no >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("item_no <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("item_no <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("item_no like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("item_no not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("item_no in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("item_no not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("item_no between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("item_no not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeIsNull() {
            addCriterion("item_type_code is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeIsNotNull() {
            addCriterion("item_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeEqualTo(String value) {
            addCriterion("item_type_code =", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeNotEqualTo(String value) {
            addCriterion("item_type_code <>", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeGreaterThan(String value) {
            addCriterion("item_type_code >", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("item_type_code >=", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeLessThan(String value) {
            addCriterion("item_type_code <", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("item_type_code <=", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeLike(String value) {
            addCriterion("item_type_code like", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeNotLike(String value) {
            addCriterion("item_type_code not like", value, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeIn(List<String> values) {
            addCriterion("item_type_code in", values, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeNotIn(List<String> values) {
            addCriterion("item_type_code not in", values, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeBetween(String value1, String value2) {
            addCriterion("item_type_code between", value1, value2, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeCodeNotBetween(String value1, String value2) {
            addCriterion("item_type_code not between", value1, value2, "itemTypeCode");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameIsNull() {
            addCriterion("item_type_name is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameIsNotNull() {
            addCriterion("item_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameEqualTo(String value) {
            addCriterion("item_type_name =", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameNotEqualTo(String value) {
            addCriterion("item_type_name <>", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameGreaterThan(String value) {
            addCriterion("item_type_name >", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_type_name >=", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameLessThan(String value) {
            addCriterion("item_type_name <", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameLessThanOrEqualTo(String value) {
            addCriterion("item_type_name <=", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameLike(String value) {
            addCriterion("item_type_name like", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameNotLike(String value) {
            addCriterion("item_type_name not like", value, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameIn(List<String> values) {
            addCriterion("item_type_name in", values, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameNotIn(List<String> values) {
            addCriterion("item_type_name not in", values, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameBetween(String value1, String value2) {
            addCriterion("item_type_name between", value1, value2, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemTypeNameNotBetween(String value1, String value2) {
            addCriterion("item_type_name not between", value1, value2, "itemTypeName");
            return (Criteria) this;
        }

        public Criteria andItemModelIsNull() {
            addCriterion("item_model is null");
            return (Criteria) this;
        }

        public Criteria andItemModelIsNotNull() {
            addCriterion("item_model is not null");
            return (Criteria) this;
        }

        public Criteria andItemModelEqualTo(String value) {
            addCriterion("item_model =", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotEqualTo(String value) {
            addCriterion("item_model <>", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelGreaterThan(String value) {
            addCriterion("item_model >", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelGreaterThanOrEqualTo(String value) {
            addCriterion("item_model >=", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLessThan(String value) {
            addCriterion("item_model <", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLessThanOrEqualTo(String value) {
            addCriterion("item_model <=", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLike(String value) {
            addCriterion("item_model like", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotLike(String value) {
            addCriterion("item_model not like", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelIn(List<String> values) {
            addCriterion("item_model in", values, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotIn(List<String> values) {
            addCriterion("item_model not in", values, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelBetween(String value1, String value2) {
            addCriterion("item_model between", value1, value2, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotBetween(String value1, String value2) {
            addCriterion("item_model not between", value1, value2, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemBrandIsNull() {
            addCriterion("item_brand is null");
            return (Criteria) this;
        }

        public Criteria andItemBrandIsNotNull() {
            addCriterion("item_brand is not null");
            return (Criteria) this;
        }

        public Criteria andItemBrandEqualTo(String value) {
            addCriterion("item_brand =", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandNotEqualTo(String value) {
            addCriterion("item_brand <>", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandGreaterThan(String value) {
            addCriterion("item_brand >", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandGreaterThanOrEqualTo(String value) {
            addCriterion("item_brand >=", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandLessThan(String value) {
            addCriterion("item_brand <", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandLessThanOrEqualTo(String value) {
            addCriterion("item_brand <=", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandLike(String value) {
            addCriterion("item_brand like", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandNotLike(String value) {
            addCriterion("item_brand not like", value, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandIn(List<String> values) {
            addCriterion("item_brand in", values, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandNotIn(List<String> values) {
            addCriterion("item_brand not in", values, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandBetween(String value1, String value2) {
            addCriterion("item_brand between", value1, value2, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandNotBetween(String value1, String value2) {
            addCriterion("item_brand not between", value1, value2, "itemBrand");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameIsNull() {
            addCriterion("item_brand_name is null");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameIsNotNull() {
            addCriterion("item_brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameEqualTo(String value) {
            addCriterion("item_brand_name =", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameNotEqualTo(String value) {
            addCriterion("item_brand_name <>", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameGreaterThan(String value) {
            addCriterion("item_brand_name >", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_brand_name >=", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameLessThan(String value) {
            addCriterion("item_brand_name <", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameLessThanOrEqualTo(String value) {
            addCriterion("item_brand_name <=", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameLike(String value) {
            addCriterion("item_brand_name like", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameNotLike(String value) {
            addCriterion("item_brand_name not like", value, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameIn(List<String> values) {
            addCriterion("item_brand_name in", values, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameNotIn(List<String> values) {
            addCriterion("item_brand_name not in", values, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameBetween(String value1, String value2) {
            addCriterion("item_brand_name between", value1, value2, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemBrandNameNotBetween(String value1, String value2) {
            addCriterion("item_brand_name not between", value1, value2, "itemBrandName");
            return (Criteria) this;
        }

        public Criteria andItemQuantityIsNull() {
            addCriterion("item_quantity is null");
            return (Criteria) this;
        }

        public Criteria andItemQuantityIsNotNull() {
            addCriterion("item_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andItemQuantityEqualTo(BigDecimal value) {
            addCriterion("item_quantity =", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityNotEqualTo(BigDecimal value) {
            addCriterion("item_quantity <>", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityGreaterThan(BigDecimal value) {
            addCriterion("item_quantity >", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_quantity >=", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityLessThan(BigDecimal value) {
            addCriterion("item_quantity <", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_quantity <=", value, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityIn(List<BigDecimal> values) {
            addCriterion("item_quantity in", values, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityNotIn(List<BigDecimal> values) {
            addCriterion("item_quantity not in", values, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_quantity between", value1, value2, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_quantity not between", value1, value2, "itemQuantity");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNull() {
            addCriterion("item_unit is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNotNull() {
            addCriterion("item_unit is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitEqualTo(Integer value) {
            addCriterion("item_unit =", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotEqualTo(Integer value) {
            addCriterion("item_unit <>", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThan(Integer value) {
            addCriterion("item_unit >", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_unit >=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThan(Integer value) {
            addCriterion("item_unit <", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThanOrEqualTo(Integer value) {
            addCriterion("item_unit <=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitIn(List<Integer> values) {
            addCriterion("item_unit in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotIn(List<Integer> values) {
            addCriterion("item_unit not in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitBetween(Integer value1, Integer value2) {
            addCriterion("item_unit between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("item_unit not between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andApproachDateIsNull() {
            addCriterion("approach_date is null");
            return (Criteria) this;
        }

        public Criteria andApproachDateIsNotNull() {
            addCriterion("approach_date is not null");
            return (Criteria) this;
        }

        public Criteria andApproachDateEqualTo(Date value) {
            addCriterion("approach_date =", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateNotEqualTo(Date value) {
            addCriterion("approach_date <>", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateGreaterThan(Date value) {
            addCriterion("approach_date >", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateGreaterThanOrEqualTo(Date value) {
            addCriterion("approach_date >=", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateLessThan(Date value) {
            addCriterion("approach_date <", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateLessThanOrEqualTo(Date value) {
            addCriterion("approach_date <=", value, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateIn(List<Date> values) {
            addCriterion("approach_date in", values, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateNotIn(List<Date> values) {
            addCriterion("approach_date not in", values, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateBetween(Date value1, Date value2) {
            addCriterion("approach_date between", value1, value2, "approachDate");
            return (Criteria) this;
        }

        public Criteria andApproachDateNotBetween(Date value1, Date value2) {
            addCriterion("approach_date not between", value1, value2, "approachDate");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIsNull() {
            addCriterion("lease_term is null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIsNotNull() {
            addCriterion("lease_term is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermEqualTo(BigDecimal value) {
            addCriterion("lease_term =", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotEqualTo(BigDecimal value) {
            addCriterion("lease_term <>", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermGreaterThan(BigDecimal value) {
            addCriterion("lease_term >", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_term >=", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermLessThan(BigDecimal value) {
            addCriterion("lease_term <", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_term <=", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIn(List<BigDecimal> values) {
            addCriterion("lease_term in", values, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotIn(List<BigDecimal> values) {
            addCriterion("lease_term not in", values, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_term between", value1, value2, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_term not between", value1, value2, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitIsNull() {
            addCriterion("lease_unit is null");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitIsNotNull() {
            addCriterion("lease_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitEqualTo(Integer value) {
            addCriterion("lease_unit =", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitNotEqualTo(Integer value) {
            addCriterion("lease_unit <>", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitGreaterThan(Integer value) {
            addCriterion("lease_unit >", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("lease_unit >=", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitLessThan(Integer value) {
            addCriterion("lease_unit <", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitLessThanOrEqualTo(Integer value) {
            addCriterion("lease_unit <=", value, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitIn(List<Integer> values) {
            addCriterion("lease_unit in", values, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitNotIn(List<Integer> values) {
            addCriterion("lease_unit not in", values, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitBetween(Integer value1, Integer value2) {
            addCriterion("lease_unit between", value1, value2, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("lease_unit not between", value1, value2, "leaseUnit");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIsNull() {
            addCriterion("settle_method is null");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIsNotNull() {
            addCriterion("settle_method is not null");
            return (Criteria) this;
        }

        public Criteria andSettleMethodEqualTo(Integer value) {
            addCriterion("settle_method =", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotEqualTo(Integer value) {
            addCriterion("settle_method <>", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodGreaterThan(Integer value) {
            addCriterion("settle_method >", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_method >=", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodLessThan(Integer value) {
            addCriterion("settle_method <", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodLessThanOrEqualTo(Integer value) {
            addCriterion("settle_method <=", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIn(List<Integer> values) {
            addCriterion("settle_method in", values, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotIn(List<Integer> values) {
            addCriterion("settle_method not in", values, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodBetween(Integer value1, Integer value2) {
            addCriterion("settle_method between", value1, value2, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_method not between", value1, value2, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceIsNull() {
            addCriterion("deposit_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceIsNotNull() {
            addCriterion("deposit_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceEqualTo(BigDecimal value) {
            addCriterion("deposit_unit_price =", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("deposit_unit_price <>", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("deposit_unit_price >", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_unit_price >=", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceLessThan(BigDecimal value) {
            addCriterion("deposit_unit_price <", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_unit_price <=", value, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceIn(List<BigDecimal> values) {
            addCriterion("deposit_unit_price in", values, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("deposit_unit_price not in", values, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_unit_price between", value1, value2, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_unit_price not between", value1, value2, "depositUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNull() {
            addCriterion("price_mode is null");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNotNull() {
            addCriterion("price_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPriceModeEqualTo(Integer value) {
            addCriterion("price_mode =", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotEqualTo(Integer value) {
            addCriterion("price_mode <>", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThan(Integer value) {
            addCriterion("price_mode >", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_mode >=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThan(Integer value) {
            addCriterion("price_mode <", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThanOrEqualTo(Integer value) {
            addCriterion("price_mode <=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeIn(List<Integer> values) {
            addCriterion("price_mode in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotIn(List<Integer> values) {
            addCriterion("price_mode not in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeBetween(Integer value1, Integer value2) {
            addCriterion("price_mode between", value1, value2, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotBetween(Integer value1, Integer value2) {
            addCriterion("price_mode not between", value1, value2, "priceMode");
            return (Criteria) this;
        }

        public Criteria andStandardRentIsNull() {
            addCriterion("standard_rent is null");
            return (Criteria) this;
        }

        public Criteria andStandardRentIsNotNull() {
            addCriterion("standard_rent is not null");
            return (Criteria) this;
        }

        public Criteria andStandardRentEqualTo(BigDecimal value) {
            addCriterion("standard_rent =", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentNotEqualTo(BigDecimal value) {
            addCriterion("standard_rent <>", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentGreaterThan(BigDecimal value) {
            addCriterion("standard_rent >", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_rent >=", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentLessThan(BigDecimal value) {
            addCriterion("standard_rent <", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_rent <=", value, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentIn(List<BigDecimal> values) {
            addCriterion("standard_rent in", values, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentNotIn(List<BigDecimal> values) {
            addCriterion("standard_rent not in", values, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_rent between", value1, value2, "standardRent");
            return (Criteria) this;
        }

        public Criteria andStandardRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_rent not between", value1, value2, "standardRent");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(BigDecimal value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(BigDecimal value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<BigDecimal> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceIsNull() {
            addCriterion("lease_term_price is null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceIsNotNull() {
            addCriterion("lease_term_price is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceEqualTo(BigDecimal value) {
            addCriterion("lease_term_price =", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceNotEqualTo(BigDecimal value) {
            addCriterion("lease_term_price <>", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceGreaterThan(BigDecimal value) {
            addCriterion("lease_term_price >", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_term_price >=", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceLessThan(BigDecimal value) {
            addCriterion("lease_term_price <", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_term_price <=", value, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceIn(List<BigDecimal> values) {
            addCriterion("lease_term_price in", values, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceNotIn(List<BigDecimal> values) {
            addCriterion("lease_term_price not in", values, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_term_price between", value1, value2, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_term_price not between", value1, value2, "leaseTermPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceIsNull() {
            addCriterion("step_price is null");
            return (Criteria) this;
        }

        public Criteria andStepPriceIsNotNull() {
            addCriterion("step_price is not null");
            return (Criteria) this;
        }

        public Criteria andStepPriceEqualTo(String value) {
            addCriterion("step_price =", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceNotEqualTo(String value) {
            addCriterion("step_price <>", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceGreaterThan(String value) {
            addCriterion("step_price >", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceGreaterThanOrEqualTo(String value) {
            addCriterion("step_price >=", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceLessThan(String value) {
            addCriterion("step_price <", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceLessThanOrEqualTo(String value) {
            addCriterion("step_price <=", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceLike(String value) {
            addCriterion("step_price like", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceNotLike(String value) {
            addCriterion("step_price not like", value, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceIn(List<String> values) {
            addCriterion("step_price in", values, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceNotIn(List<String> values) {
            addCriterion("step_price not in", values, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceBetween(String value1, String value2) {
            addCriterion("step_price between", value1, value2, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceNotBetween(String value1, String value2) {
            addCriterion("step_price not between", value1, value2, "stepPrice");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataIsNull() {
            addCriterion("step_price_data is null");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataIsNotNull() {
            addCriterion("step_price_data is not null");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataEqualTo(String value) {
            addCriterion("step_price_data =", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataNotEqualTo(String value) {
            addCriterion("step_price_data <>", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataGreaterThan(String value) {
            addCriterion("step_price_data >", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataGreaterThanOrEqualTo(String value) {
            addCriterion("step_price_data >=", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataLessThan(String value) {
            addCriterion("step_price_data <", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataLessThanOrEqualTo(String value) {
            addCriterion("step_price_data <=", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataLike(String value) {
            addCriterion("step_price_data like", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataNotLike(String value) {
            addCriterion("step_price_data not like", value, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataIn(List<String> values) {
            addCriterion("step_price_data in", values, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataNotIn(List<String> values) {
            addCriterion("step_price_data not in", values, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataBetween(String value1, String value2) {
            addCriterion("step_price_data between", value1, value2, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andStepPriceDataNotBetween(String value1, String value2) {
            addCriterion("step_price_data not between", value1, value2, "stepPriceData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseIsNull() {
            addCriterion("additional_clause is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseIsNotNull() {
            addCriterion("additional_clause is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseEqualTo(String value) {
            addCriterion("additional_clause =", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseNotEqualTo(String value) {
            addCriterion("additional_clause <>", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseGreaterThan(String value) {
            addCriterion("additional_clause >", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseGreaterThanOrEqualTo(String value) {
            addCriterion("additional_clause >=", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseLessThan(String value) {
            addCriterion("additional_clause <", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseLessThanOrEqualTo(String value) {
            addCriterion("additional_clause <=", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseLike(String value) {
            addCriterion("additional_clause like", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseNotLike(String value) {
            addCriterion("additional_clause not like", value, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseIn(List<String> values) {
            addCriterion("additional_clause in", values, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseNotIn(List<String> values) {
            addCriterion("additional_clause not in", values, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseBetween(String value1, String value2) {
            addCriterion("additional_clause between", value1, value2, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseNotBetween(String value1, String value2) {
            addCriterion("additional_clause not between", value1, value2, "additionalClause");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataIsNull() {
            addCriterion("additional_clause_data is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataIsNotNull() {
            addCriterion("additional_clause_data is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataEqualTo(String value) {
            addCriterion("additional_clause_data =", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataNotEqualTo(String value) {
            addCriterion("additional_clause_data <>", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataGreaterThan(String value) {
            addCriterion("additional_clause_data >", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataGreaterThanOrEqualTo(String value) {
            addCriterion("additional_clause_data >=", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataLessThan(String value) {
            addCriterion("additional_clause_data <", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataLessThanOrEqualTo(String value) {
            addCriterion("additional_clause_data <=", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataLike(String value) {
            addCriterion("additional_clause_data like", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataNotLike(String value) {
            addCriterion("additional_clause_data not like", value, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataIn(List<String> values) {
            addCriterion("additional_clause_data in", values, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataNotIn(List<String> values) {
            addCriterion("additional_clause_data not in", values, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataBetween(String value1, String value2) {
            addCriterion("additional_clause_data between", value1, value2, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andAdditionalClauseDataNotBetween(String value1, String value2) {
            addCriterion("additional_clause_data not between", value1, value2, "additionalClauseData");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDtlNoIsNull() {
            addCriterion("dtl_no is null");
            return (Criteria) this;
        }

        public Criteria andDtlNoIsNotNull() {
            addCriterion("dtl_no is not null");
            return (Criteria) this;
        }

        public Criteria andDtlNoEqualTo(Integer value) {
            addCriterion("dtl_no =", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoNotEqualTo(Integer value) {
            addCriterion("dtl_no <>", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoGreaterThan(Integer value) {
            addCriterion("dtl_no >", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dtl_no >=", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoLessThan(Integer value) {
            addCriterion("dtl_no <", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoLessThanOrEqualTo(Integer value) {
            addCriterion("dtl_no <=", value, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoIn(List<Integer> values) {
            addCriterion("dtl_no in", values, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoNotIn(List<Integer> values) {
            addCriterion("dtl_no not in", values, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoBetween(Integer value1, Integer value2) {
            addCriterion("dtl_no between", value1, value2, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andDtlNoNotBetween(Integer value1, Integer value2) {
            addCriterion("dtl_no not between", value1, value2, "dtlNo");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateIsNull() {
            addCriterion("material_conversion_rate is null");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateIsNotNull() {
            addCriterion("material_conversion_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateEqualTo(String value) {
            addCriterion("material_conversion_rate =", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateNotEqualTo(String value) {
            addCriterion("material_conversion_rate <>", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateGreaterThan(String value) {
            addCriterion("material_conversion_rate >", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateGreaterThanOrEqualTo(String value) {
            addCriterion("material_conversion_rate >=", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateLessThan(String value) {
            addCriterion("material_conversion_rate <", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateLessThanOrEqualTo(String value) {
            addCriterion("material_conversion_rate <=", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateLike(String value) {
            addCriterion("material_conversion_rate like", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateNotLike(String value) {
            addCriterion("material_conversion_rate not like", value, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateIn(List<String> values) {
            addCriterion("material_conversion_rate in", values, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateNotIn(List<String> values) {
            addCriterion("material_conversion_rate not in", values, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateBetween(String value1, String value2) {
            addCriterion("material_conversion_rate between", value1, value2, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateNotBetween(String value1, String value2) {
            addCriterion("material_conversion_rate not between", value1, value2, "materialConversionRate");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataIsNull() {
            addCriterion("material_conversion_rate_data is null");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataIsNotNull() {
            addCriterion("material_conversion_rate_data is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataEqualTo(String value) {
            addCriterion("material_conversion_rate_data =", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataNotEqualTo(String value) {
            addCriterion("material_conversion_rate_data <>", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataGreaterThan(String value) {
            addCriterion("material_conversion_rate_data >", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataGreaterThanOrEqualTo(String value) {
            addCriterion("material_conversion_rate_data >=", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataLessThan(String value) {
            addCriterion("material_conversion_rate_data <", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataLessThanOrEqualTo(String value) {
            addCriterion("material_conversion_rate_data <=", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataLike(String value) {
            addCriterion("material_conversion_rate_data like", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataNotLike(String value) {
            addCriterion("material_conversion_rate_data not like", value, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataIn(List<String> values) {
            addCriterion("material_conversion_rate_data in", values, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataNotIn(List<String> values) {
            addCriterion("material_conversion_rate_data not in", values, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataBetween(String value1, String value2) {
            addCriterion("material_conversion_rate_data between", value1, value2, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andMaterialConversionRateDataNotBetween(String value1, String value2) {
            addCriterion("material_conversion_rate_data not between", value1, value2, "materialConversionRateData");
            return (Criteria) this;
        }

        public Criteria andTrackingIdIsNull() {
            addCriterion("tracking_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackingIdIsNotNull() {
            addCriterion("tracking_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingIdEqualTo(Integer value) {
            addCriterion("tracking_id =", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotEqualTo(Integer value) {
            addCriterion("tracking_id <>", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThan(Integer value) {
            addCriterion("tracking_id >", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tracking_id >=", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThan(Integer value) {
            addCriterion("tracking_id <", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdLessThanOrEqualTo(Integer value) {
            addCriterion("tracking_id <=", value, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdIn(List<Integer> values) {
            addCriterion("tracking_id in", values, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotIn(List<Integer> values) {
            addCriterion("tracking_id not in", values, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdBetween(Integer value1, Integer value2) {
            addCriterion("tracking_id between", value1, value2, "trackingId");
            return (Criteria) this;
        }

        public Criteria andTrackingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tracking_id not between", value1, value2, "trackingId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIsNull() {
            addCriterion("credit_price is null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIsNotNull() {
            addCriterion("credit_price is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceEqualTo(BigDecimal value) {
            addCriterion("credit_price =", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceNotEqualTo(BigDecimal value) {
            addCriterion("credit_price <>", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceGreaterThan(BigDecimal value) {
            addCriterion("credit_price >", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_price >=", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceLessThan(BigDecimal value) {
            addCriterion("credit_price <", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_price <=", value, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIn(List<BigDecimal> values) {
            addCriterion("credit_price in", values, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceNotIn(List<BigDecimal> values) {
            addCriterion("credit_price not in", values, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_price between", value1, value2, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andCreditPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_price not between", value1, value2, "creditPrice");
            return (Criteria) this;
        }

        public Criteria andDefineItemIsNull() {
            addCriterion("define_item is null");
            return (Criteria) this;
        }

        public Criteria andDefineItemIsNotNull() {
            addCriterion("define_item is not null");
            return (Criteria) this;
        }

        public Criteria andDefineItemEqualTo(String value) {
            addCriterion("define_item =", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemNotEqualTo(String value) {
            addCriterion("define_item <>", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemGreaterThan(String value) {
            addCriterion("define_item >", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemGreaterThanOrEqualTo(String value) {
            addCriterion("define_item >=", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemLessThan(String value) {
            addCriterion("define_item <", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemLessThanOrEqualTo(String value) {
            addCriterion("define_item <=", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemLike(String value) {
            addCriterion("define_item like", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemNotLike(String value) {
            addCriterion("define_item not like", value, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemIn(List<String> values) {
            addCriterion("define_item in", values, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemNotIn(List<String> values) {
            addCriterion("define_item not in", values, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemBetween(String value1, String value2) {
            addCriterion("define_item between", value1, value2, "defineItem");
            return (Criteria) this;
        }

        public Criteria andDefineItemNotBetween(String value1, String value2) {
            addCriterion("define_item not between", value1, value2, "defineItem");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountIsNull() {
            addCriterion("standard_rent_amount is null");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountIsNotNull() {
            addCriterion("standard_rent_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountEqualTo(BigDecimal value) {
            addCriterion("standard_rent_amount =", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountNotEqualTo(BigDecimal value) {
            addCriterion("standard_rent_amount <>", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountGreaterThan(BigDecimal value) {
            addCriterion("standard_rent_amount >", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_rent_amount >=", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountLessThan(BigDecimal value) {
            addCriterion("standard_rent_amount <", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_rent_amount <=", value, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountIn(List<BigDecimal> values) {
            addCriterion("standard_rent_amount in", values, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountNotIn(List<BigDecimal> values) {
            addCriterion("standard_rent_amount not in", values, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_rent_amount between", value1, value2, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardRentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_rent_amount not between", value1, value2, "standardRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountIsNull() {
            addCriterion("discount_rent_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountIsNotNull() {
            addCriterion("discount_rent_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountEqualTo(BigDecimal value) {
            addCriterion("discount_rent_amount =", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_rent_amount <>", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_rent_amount >", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rent_amount >=", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountLessThan(BigDecimal value) {
            addCriterion("discount_rent_amount <", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rent_amount <=", value, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountIn(List<BigDecimal> values) {
            addCriterion("discount_rent_amount in", values, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_rent_amount not in", values, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rent_amount between", value1, value2, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountRentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rent_amount not between", value1, value2, "discountRentAmount");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdIsNull() {
            addCriterion("standard_amount_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdIsNotNull() {
            addCriterion("standard_amount_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdEqualTo(Integer value) {
            addCriterion("standard_amount_id =", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdNotEqualTo(Integer value) {
            addCriterion("standard_amount_id <>", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdGreaterThan(Integer value) {
            addCriterion("standard_amount_id >", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("standard_amount_id >=", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdLessThan(Integer value) {
            addCriterion("standard_amount_id <", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdLessThanOrEqualTo(Integer value) {
            addCriterion("standard_amount_id <=", value, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdIn(List<Integer> values) {
            addCriterion("standard_amount_id in", values, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdNotIn(List<Integer> values) {
            addCriterion("standard_amount_id not in", values, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdBetween(Integer value1, Integer value2) {
            addCriterion("standard_amount_id between", value1, value2, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andStandardAmountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("standard_amount_id not between", value1, value2, "standardAmountId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdIsNull() {
            addCriterion("credit_price_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdIsNotNull() {
            addCriterion("credit_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdEqualTo(Integer value) {
            addCriterion("credit_price_id =", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdNotEqualTo(Integer value) {
            addCriterion("credit_price_id <>", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdGreaterThan(Integer value) {
            addCriterion("credit_price_id >", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_price_id >=", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdLessThan(Integer value) {
            addCriterion("credit_price_id <", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdLessThanOrEqualTo(Integer value) {
            addCriterion("credit_price_id <=", value, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdIn(List<Integer> values) {
            addCriterion("credit_price_id in", values, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdNotIn(List<Integer> values) {
            addCriterion("credit_price_id not in", values, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdBetween(Integer value1, Integer value2) {
            addCriterion("credit_price_id between", value1, value2, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andCreditPriceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_price_id not between", value1, value2, "creditPriceId");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(BigDecimal value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(BigDecimal value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<BigDecimal> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitIsNull() {
            addCriterion("lease_term_price_unit is null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitIsNotNull() {
            addCriterion("lease_term_price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitEqualTo(String value) {
            addCriterion("lease_term_price_unit =", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitNotEqualTo(String value) {
            addCriterion("lease_term_price_unit <>", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitGreaterThan(String value) {
            addCriterion("lease_term_price_unit >", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("lease_term_price_unit >=", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitLessThan(String value) {
            addCriterion("lease_term_price_unit <", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("lease_term_price_unit <=", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitLike(String value) {
            addCriterion("lease_term_price_unit like", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitNotLike(String value) {
            addCriterion("lease_term_price_unit not like", value, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitIn(List<String> values) {
            addCriterion("lease_term_price_unit in", values, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitNotIn(List<String> values) {
            addCriterion("lease_term_price_unit not in", values, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitBetween(String value1, String value2) {
            addCriterion("lease_term_price_unit between", value1, value2, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andLeaseTermPriceUnitNotBetween(String value1, String value2) {
            addCriterion("lease_term_price_unit not between", value1, value2, "leaseTermPriceUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitIsNull() {
            addCriterion("standard_rent_unit is null");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitIsNotNull() {
            addCriterion("standard_rent_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitEqualTo(String value) {
            addCriterion("standard_rent_unit =", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitNotEqualTo(String value) {
            addCriterion("standard_rent_unit <>", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitGreaterThan(String value) {
            addCriterion("standard_rent_unit >", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitGreaterThanOrEqualTo(String value) {
            addCriterion("standard_rent_unit >=", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitLessThan(String value) {
            addCriterion("standard_rent_unit <", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitLessThanOrEqualTo(String value) {
            addCriterion("standard_rent_unit <=", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitLike(String value) {
            addCriterion("standard_rent_unit like", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitNotLike(String value) {
            addCriterion("standard_rent_unit not like", value, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitIn(List<String> values) {
            addCriterion("standard_rent_unit in", values, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitNotIn(List<String> values) {
            addCriterion("standard_rent_unit not in", values, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitBetween(String value1, String value2) {
            addCriterion("standard_rent_unit between", value1, value2, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andStandardRentUnitNotBetween(String value1, String value2) {
            addCriterion("standard_rent_unit not between", value1, value2, "standardRentUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitIsNull() {
            addCriterion("deposit_unit is null");
            return (Criteria) this;
        }

        public Criteria andDepositUnitIsNotNull() {
            addCriterion("deposit_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositUnitEqualTo(String value) {
            addCriterion("deposit_unit =", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitNotEqualTo(String value) {
            addCriterion("deposit_unit <>", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitGreaterThan(String value) {
            addCriterion("deposit_unit >", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_unit >=", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitLessThan(String value) {
            addCriterion("deposit_unit <", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitLessThanOrEqualTo(String value) {
            addCriterion("deposit_unit <=", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitLike(String value) {
            addCriterion("deposit_unit like", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitNotLike(String value) {
            addCriterion("deposit_unit not like", value, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitIn(List<String> values) {
            addCriterion("deposit_unit in", values, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitNotIn(List<String> values) {
            addCriterion("deposit_unit not in", values, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitBetween(String value1, String value2) {
            addCriterion("deposit_unit between", value1, value2, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andDepositUnitNotBetween(String value1, String value2) {
            addCriterion("deposit_unit not between", value1, value2, "depositUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitIsNull() {
            addCriterion("credit_price_unit is null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitIsNotNull() {
            addCriterion("credit_price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitEqualTo(String value) {
            addCriterion("credit_price_unit =", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitNotEqualTo(String value) {
            addCriterion("credit_price_unit <>", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitGreaterThan(String value) {
            addCriterion("credit_price_unit >", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("credit_price_unit >=", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitLessThan(String value) {
            addCriterion("credit_price_unit <", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("credit_price_unit <=", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitLike(String value) {
            addCriterion("credit_price_unit like", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitNotLike(String value) {
            addCriterion("credit_price_unit not like", value, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitIn(List<String> values) {
            addCriterion("credit_price_unit in", values, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitNotIn(List<String> values) {
            addCriterion("credit_price_unit not in", values, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitBetween(String value1, String value2) {
            addCriterion("credit_price_unit between", value1, value2, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andCreditPriceUnitNotBetween(String value1, String value2) {
            addCriterion("credit_price_unit not between", value1, value2, "creditPriceUnit");
            return (Criteria) this;
        }

        public Criteria andInitDataIsNull() {
            addCriterion("init_data is null");
            return (Criteria) this;
        }

        public Criteria andInitDataIsNotNull() {
            addCriterion("init_data is not null");
            return (Criteria) this;
        }

        public Criteria andInitDataEqualTo(String value) {
            addCriterion("init_data =", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataNotEqualTo(String value) {
            addCriterion("init_data <>", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataGreaterThan(String value) {
            addCriterion("init_data >", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataGreaterThanOrEqualTo(String value) {
            addCriterion("init_data >=", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataLessThan(String value) {
            addCriterion("init_data <", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataLessThanOrEqualTo(String value) {
            addCriterion("init_data <=", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataLike(String value) {
            addCriterion("init_data like", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataNotLike(String value) {
            addCriterion("init_data not like", value, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataIn(List<String> values) {
            addCriterion("init_data in", values, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataNotIn(List<String> values) {
            addCriterion("init_data not in", values, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataBetween(String value1, String value2) {
            addCriterion("init_data between", value1, value2, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataNotBetween(String value1, String value2) {
            addCriterion("init_data not between", value1, value2, "initData");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeIsNull() {
            addCriterion("init_data_time is null");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeIsNotNull() {
            addCriterion("init_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeEqualTo(Date value) {
            addCriterionForJDBCDate("init_data_time =", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("init_data_time <>", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("init_data_time >", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("init_data_time >=", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeLessThan(Date value) {
            addCriterionForJDBCDate("init_data_time <", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("init_data_time <=", value, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeIn(List<Date> values) {
            addCriterionForJDBCDate("init_data_time in", values, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("init_data_time not in", values, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("init_data_time between", value1, value2, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andInitDataTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("init_data_time not between", value1, value2, "initDataTime");
            return (Criteria) this;
        }

        public Criteria andRantalPriceIsNull() {
            addCriterion("rantal_price is null");
            return (Criteria) this;
        }

        public Criteria andRantalPriceIsNotNull() {
            addCriterion("rantal_price is not null");
            return (Criteria) this;
        }

        public Criteria andRantalPriceEqualTo(BigDecimal value) {
            addCriterion("rantal_price =", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceNotEqualTo(BigDecimal value) {
            addCriterion("rantal_price <>", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceGreaterThan(BigDecimal value) {
            addCriterion("rantal_price >", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rantal_price >=", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceLessThan(BigDecimal value) {
            addCriterion("rantal_price <", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rantal_price <=", value, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceIn(List<BigDecimal> values) {
            addCriterion("rantal_price in", values, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceNotIn(List<BigDecimal> values) {
            addCriterion("rantal_price not in", values, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rantal_price between", value1, value2, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rantal_price not between", value1, value2, "rantalPrice");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitIsNull() {
            addCriterion("rantal_price_unit is null");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitIsNotNull() {
            addCriterion("rantal_price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitEqualTo(String value) {
            addCriterion("rantal_price_unit =", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitNotEqualTo(String value) {
            addCriterion("rantal_price_unit <>", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitGreaterThan(String value) {
            addCriterion("rantal_price_unit >", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("rantal_price_unit >=", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitLessThan(String value) {
            addCriterion("rantal_price_unit <", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("rantal_price_unit <=", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitLike(String value) {
            addCriterion("rantal_price_unit like", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitNotLike(String value) {
            addCriterion("rantal_price_unit not like", value, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitIn(List<String> values) {
            addCriterion("rantal_price_unit in", values, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitNotIn(List<String> values) {
            addCriterion("rantal_price_unit not in", values, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitBetween(String value1, String value2) {
            addCriterion("rantal_price_unit between", value1, value2, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andRantalPriceUnitNotBetween(String value1, String value2) {
            addCriterion("rantal_price_unit not between", value1, value2, "rantalPriceUnit");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityIsNull() {
            addCriterion("original_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityIsNotNull() {
            addCriterion("original_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityEqualTo(BigDecimal value) {
            addCriterion("original_quantity =", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityNotEqualTo(BigDecimal value) {
            addCriterion("original_quantity <>", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityGreaterThan(BigDecimal value) {
            addCriterion("original_quantity >", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_quantity >=", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityLessThan(BigDecimal value) {
            addCriterion("original_quantity <", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_quantity <=", value, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityIn(List<BigDecimal> values) {
            addCriterion("original_quantity in", values, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityNotIn(List<BigDecimal> values) {
            addCriterion("original_quantity not in", values, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_quantity between", value1, value2, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andOriginalQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_quantity not between", value1, value2, "originalQuantity");
            return (Criteria) this;
        }

        public Criteria andWaringMessageIsNull() {
            addCriterion("waring_message is null");
            return (Criteria) this;
        }

        public Criteria andWaringMessageIsNotNull() {
            addCriterion("waring_message is not null");
            return (Criteria) this;
        }

        public Criteria andWaringMessageEqualTo(String value) {
            addCriterion("waring_message =", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageNotEqualTo(String value) {
            addCriterion("waring_message <>", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageGreaterThan(String value) {
            addCriterion("waring_message >", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageGreaterThanOrEqualTo(String value) {
            addCriterion("waring_message >=", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageLessThan(String value) {
            addCriterion("waring_message <", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageLessThanOrEqualTo(String value) {
            addCriterion("waring_message <=", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageLike(String value) {
            addCriterion("waring_message like", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageNotLike(String value) {
            addCriterion("waring_message not like", value, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageIn(List<String> values) {
            addCriterion("waring_message in", values, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageNotIn(List<String> values) {
            addCriterion("waring_message not in", values, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageBetween(String value1, String value2) {
            addCriterion("waring_message between", value1, value2, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andWaringMessageNotBetween(String value1, String value2) {
            addCriterion("waring_message not between", value1, value2, "waringMessage");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeIsNull() {
            addCriterion("dtl_chkChange is null");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeIsNotNull() {
            addCriterion("dtl_chkChange is not null");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeEqualTo(Boolean value) {
            addCriterion("dtl_chkChange =", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeNotEqualTo(Boolean value) {
            addCriterion("dtl_chkChange <>", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeGreaterThan(Boolean value) {
            addCriterion("dtl_chkChange >", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dtl_chkChange >=", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeLessThan(Boolean value) {
            addCriterion("dtl_chkChange <", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeLessThanOrEqualTo(Boolean value) {
            addCriterion("dtl_chkChange <=", value, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeIn(List<Boolean> values) {
            addCriterion("dtl_chkChange in", values, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeNotIn(List<Boolean> values) {
            addCriterion("dtl_chkChange not in", values, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeBetween(Boolean value1, Boolean value2) {
            addCriterion("dtl_chkChange between", value1, value2, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andDtlChkchangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dtl_chkChange not between", value1, value2, "dtlChkchange");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountIsNull() {
            addCriterion("inner_settle_standard_amount is null");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountIsNotNull() {
            addCriterion("inner_settle_standard_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountEqualTo(BigDecimal value) {
            addCriterion("inner_settle_standard_amount =", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountNotEqualTo(BigDecimal value) {
            addCriterion("inner_settle_standard_amount <>", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountGreaterThan(BigDecimal value) {
            addCriterion("inner_settle_standard_amount >", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inner_settle_standard_amount >=", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountLessThan(BigDecimal value) {
            addCriterion("inner_settle_standard_amount <", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inner_settle_standard_amount <=", value, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountIn(List<BigDecimal> values) {
            addCriterion("inner_settle_standard_amount in", values, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountNotIn(List<BigDecimal> values) {
            addCriterion("inner_settle_standard_amount not in", values, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inner_settle_standard_amount between", value1, value2, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleStandardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inner_settle_standard_amount not between", value1, value2, "innerSettleStandardAmount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountIsNull() {
            addCriterion("inner_settle_discount is null");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountIsNotNull() {
            addCriterion("inner_settle_discount is not null");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountEqualTo(BigDecimal value) {
            addCriterion("inner_settle_discount =", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountNotEqualTo(BigDecimal value) {
            addCriterion("inner_settle_discount <>", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountGreaterThan(BigDecimal value) {
            addCriterion("inner_settle_discount >", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inner_settle_discount >=", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountLessThan(BigDecimal value) {
            addCriterion("inner_settle_discount <", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inner_settle_discount <=", value, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountIn(List<BigDecimal> values) {
            addCriterion("inner_settle_discount in", values, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountNotIn(List<BigDecimal> values) {
            addCriterion("inner_settle_discount not in", values, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inner_settle_discount between", value1, value2, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andInnerSettleDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inner_settle_discount not between", value1, value2, "innerSettleDiscount");
            return (Criteria) this;
        }

        public Criteria andSignItemIdIsNull() {
            addCriterion("sign_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSignItemIdIsNotNull() {
            addCriterion("sign_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignItemIdEqualTo(Integer value) {
            addCriterion("sign_item_id =", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdNotEqualTo(Integer value) {
            addCriterion("sign_item_id <>", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdGreaterThan(Integer value) {
            addCriterion("sign_item_id >", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_item_id >=", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdLessThan(Integer value) {
            addCriterion("sign_item_id <", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_item_id <=", value, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdIn(List<Integer> values) {
            addCriterion("sign_item_id in", values, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdNotIn(List<Integer> values) {
            addCriterion("sign_item_id not in", values, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_item_id between", value1, value2, "signItemId");
            return (Criteria) this;
        }

        public Criteria andSignItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_item_id not between", value1, value2, "signItemId");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleIsNull() {
            addCriterion("min_lease_cycle is null");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleIsNotNull() {
            addCriterion("min_lease_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleEqualTo(BigDecimal value) {
            addCriterion("min_lease_cycle =", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleNotEqualTo(BigDecimal value) {
            addCriterion("min_lease_cycle <>", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleGreaterThan(BigDecimal value) {
            addCriterion("min_lease_cycle >", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_lease_cycle >=", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleLessThan(BigDecimal value) {
            addCriterion("min_lease_cycle <", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_lease_cycle <=", value, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleIn(List<BigDecimal> values) {
            addCriterion("min_lease_cycle in", values, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleNotIn(List<BigDecimal> values) {
            addCriterion("min_lease_cycle not in", values, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_lease_cycle between", value1, value2, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinLeaseCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_lease_cycle not between", value1, value2, "minLeaseCycle");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountIsNull() {
            addCriterion("min_rent_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountIsNotNull() {
            addCriterion("min_rent_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountEqualTo(BigDecimal value) {
            addCriterion("min_rent_amount =", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountNotEqualTo(BigDecimal value) {
            addCriterion("min_rent_amount <>", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountGreaterThan(BigDecimal value) {
            addCriterion("min_rent_amount >", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_rent_amount >=", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountLessThan(BigDecimal value) {
            addCriterion("min_rent_amount <", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_rent_amount <=", value, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountIn(List<BigDecimal> values) {
            addCriterion("min_rent_amount in", values, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountNotIn(List<BigDecimal> values) {
            addCriterion("min_rent_amount not in", values, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_rent_amount between", value1, value2, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andMinRentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_rent_amount not between", value1, value2, "minRentAmount");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidIsNull() {
            addCriterion("source_dtlId is null");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidIsNotNull() {
            addCriterion("source_dtlId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidEqualTo(BigDecimal value) {
            addCriterion("source_dtlId =", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidNotEqualTo(BigDecimal value) {
            addCriterion("source_dtlId <>", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidGreaterThan(BigDecimal value) {
            addCriterion("source_dtlId >", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("source_dtlId >=", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidLessThan(BigDecimal value) {
            addCriterion("source_dtlId <", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("source_dtlId <=", value, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidIn(List<BigDecimal> values) {
            addCriterion("source_dtlId in", values, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidNotIn(List<BigDecimal> values) {
            addCriterion("source_dtlId not in", values, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_dtlId between", value1, value2, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andSourceDtlidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_dtlId not between", value1, value2, "sourceDtlid");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescIsNull() {
            addCriterion("step_price_desc is null");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescIsNotNull() {
            addCriterion("step_price_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescEqualTo(String value) {
            addCriterion("step_price_desc =", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescNotEqualTo(String value) {
            addCriterion("step_price_desc <>", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescGreaterThan(String value) {
            addCriterion("step_price_desc >", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescGreaterThanOrEqualTo(String value) {
            addCriterion("step_price_desc >=", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescLessThan(String value) {
            addCriterion("step_price_desc <", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescLessThanOrEqualTo(String value) {
            addCriterion("step_price_desc <=", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescLike(String value) {
            addCriterion("step_price_desc like", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescNotLike(String value) {
            addCriterion("step_price_desc not like", value, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescIn(List<String> values) {
            addCriterion("step_price_desc in", values, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescNotIn(List<String> values) {
            addCriterion("step_price_desc not in", values, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescBetween(String value1, String value2) {
            addCriterion("step_price_desc between", value1, value2, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andStepPriceDescNotBetween(String value1, String value2) {
            addCriterion("step_price_desc not between", value1, value2, "stepPriceDesc");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceIsNull() {
            addCriterion("has_step_price is null");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceIsNotNull() {
            addCriterion("has_step_price is not null");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceEqualTo(Boolean value) {
            addCriterion("has_step_price =", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceNotEqualTo(Boolean value) {
            addCriterion("has_step_price <>", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceGreaterThan(Boolean value) {
            addCriterion("has_step_price >", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_step_price >=", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceLessThan(Boolean value) {
            addCriterion("has_step_price <", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("has_step_price <=", value, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceIn(List<Boolean> values) {
            addCriterion("has_step_price in", values, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceNotIn(List<Boolean> values) {
            addCriterion("has_step_price not in", values, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("has_step_price between", value1, value2, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andHasStepPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_step_price not between", value1, value2, "hasStepPrice");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityIsNull() {
            addCriterion("supplement_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityIsNotNull() {
            addCriterion("supplement_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityEqualTo(BigDecimal value) {
            addCriterion("supplement_quantity =", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityNotEqualTo(BigDecimal value) {
            addCriterion("supplement_quantity <>", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityGreaterThan(BigDecimal value) {
            addCriterion("supplement_quantity >", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_quantity >=", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityLessThan(BigDecimal value) {
            addCriterion("supplement_quantity <", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_quantity <=", value, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityIn(List<BigDecimal> values) {
            addCriterion("supplement_quantity in", values, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityNotIn(List<BigDecimal> values) {
            addCriterion("supplement_quantity not in", values, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_quantity between", value1, value2, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_quantity not between", value1, value2, "supplementQuantity");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermIsNull() {
            addCriterion("supplement_lease_term is null");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermIsNotNull() {
            addCriterion("supplement_lease_term is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_term =", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermNotEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_term <>", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermGreaterThan(BigDecimal value) {
            addCriterion("supplement_lease_term >", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_term >=", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermLessThan(BigDecimal value) {
            addCriterion("supplement_lease_term <", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_term <=", value, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermIn(List<BigDecimal> values) {
            addCriterion("supplement_lease_term in", values, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermNotIn(List<BigDecimal> values) {
            addCriterion("supplement_lease_term not in", values, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_lease_term between", value1, value2, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeaseTermNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_lease_term not between", value1, value2, "supplementLeaseTerm");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceIsNull() {
            addCriterion("supplement_lease_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceIsNotNull() {
            addCriterion("supplement_lease_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_price =", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceNotEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_price <>", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceGreaterThan(BigDecimal value) {
            addCriterion("supplement_lease_price >", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_price >=", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceLessThan(BigDecimal value) {
            addCriterion("supplement_lease_price <", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplement_lease_price <=", value, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceIn(List<BigDecimal> values) {
            addCriterion("supplement_lease_price in", values, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceNotIn(List<BigDecimal> values) {
            addCriterion("supplement_lease_price not in", values, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_lease_price between", value1, value2, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andSupplementLeasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplement_lease_price not between", value1, value2, "supplementLeasePrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndIsNull() {
            addCriterion("delivery_date_end is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndIsNotNull() {
            addCriterion("delivery_date_end is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date_end =", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date_end <>", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndGreaterThan(Date value) {
            addCriterionForJDBCDate("delivery_date_end >", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date_end >=", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndLessThan(Date value) {
            addCriterionForJDBCDate("delivery_date_end <", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date_end <=", value, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndIn(List<Date> values) {
            addCriterionForJDBCDate("delivery_date_end in", values, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("delivery_date_end not in", values, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delivery_date_end between", value1, value2, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delivery_date_end not between", value1, value2, "deliveryDateEnd");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceIsNull() {
            addCriterion("advance_price is null");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceIsNotNull() {
            addCriterion("advance_price is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceEqualTo(BigDecimal value) {
            addCriterion("advance_price =", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceNotEqualTo(BigDecimal value) {
            addCriterion("advance_price <>", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceGreaterThan(BigDecimal value) {
            addCriterion("advance_price >", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("advance_price >=", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceLessThan(BigDecimal value) {
            addCriterion("advance_price <", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("advance_price <=", value, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceIn(List<BigDecimal> values) {
            addCriterion("advance_price in", values, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceNotIn(List<BigDecimal> values) {
            addCriterion("advance_price not in", values, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("advance_price between", value1, value2, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("advance_price not between", value1, value2, "advancePrice");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitIsNull() {
            addCriterion("advance_price_unit is null");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitIsNotNull() {
            addCriterion("advance_price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitEqualTo(String value) {
            addCriterion("advance_price_unit =", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitNotEqualTo(String value) {
            addCriterion("advance_price_unit <>", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitGreaterThan(String value) {
            addCriterion("advance_price_unit >", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("advance_price_unit >=", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitLessThan(String value) {
            addCriterion("advance_price_unit <", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitLessThanOrEqualTo(String value) {
            addCriterion("advance_price_unit <=", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitLike(String value) {
            addCriterion("advance_price_unit like", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitNotLike(String value) {
            addCriterion("advance_price_unit not like", value, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitIn(List<String> values) {
            addCriterion("advance_price_unit in", values, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitNotIn(List<String> values) {
            addCriterion("advance_price_unit not in", values, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitBetween(String value1, String value2) {
            addCriterion("advance_price_unit between", value1, value2, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andAdvancePriceUnitNotBetween(String value1, String value2) {
            addCriterion("advance_price_unit not between", value1, value2, "advancePriceUnit");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceIsNull() {
            addCriterion("total_advance is null");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceIsNotNull() {
            addCriterion("total_advance is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceEqualTo(BigDecimal value) {
            addCriterion("total_advance =", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceNotEqualTo(BigDecimal value) {
            addCriterion("total_advance <>", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceGreaterThan(BigDecimal value) {
            addCriterion("total_advance >", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_advance >=", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceLessThan(BigDecimal value) {
            addCriterion("total_advance <", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_advance <=", value, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceIn(List<BigDecimal> values) {
            addCriterion("total_advance in", values, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceNotIn(List<BigDecimal> values) {
            addCriterion("total_advance not in", values, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_advance between", value1, value2, "totalAdvance");
            return (Criteria) this;
        }

        public Criteria andTotalAdvanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_advance not between", value1, value2, "totalAdvance");
            return (Criteria) this;
        }
    }

    /**
     * order_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * order_detail 2020-01-20
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}