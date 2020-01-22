package com.order.service;

import java.util.List;
import java.util.Map;

import com.order.entity.OrderDetail;

public interface OrderOracleService {

	List<OrderDetail> listOrderDetail(Map<String, Object> o);
}
