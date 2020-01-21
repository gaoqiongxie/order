package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.order.dao.OrderDetailMapper;
import com.order.entity.OrderDetail;
import com.order.service.OrderService;

@Component("orderService")
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDetailMapper orderDetailMapper;

	@Override
	public OrderDetail getOrderDetail(Integer id) {
		OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(id);
		return orderDetail;
	}
}
