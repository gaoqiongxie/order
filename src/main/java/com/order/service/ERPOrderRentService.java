package com.order.service;

import com.oms.model.dto.OrderRentDTO;

public interface ERPOrderRentService {

	OrderRentDTO getDTOByOrderId(int orderId);

}
