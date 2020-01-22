package com.order.dao;

import java.util.List;
import java.util.Map;

import com.order.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
    
    /**
     * list order
     */
    List<OrderDetail> listOrderDetail(Map<String, Object> o);
}