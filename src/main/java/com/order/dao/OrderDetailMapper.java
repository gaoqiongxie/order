package com.order.dao;

import com.order.entity.OrderDetail;

//@DataSourceType(value = DataSourceConstants.DATASOURCE_ORACLE)
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}