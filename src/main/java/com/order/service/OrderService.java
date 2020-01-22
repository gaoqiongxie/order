package com.order.service;

import com.order.entity.OrderDetail;

public interface OrderService {

	OrderDetail getOrderDetail(int i);

	int sycn();
}
