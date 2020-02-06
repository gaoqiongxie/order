package com.order.service;

import java.util.List;

import com.oms.model.dto.OrderRentDTO;
import com.oms.model.po.OrderDetailPO;

public interface ERPOrderRentService {

	OrderRentDTO getDTOByOrderId(int orderId);

	List<OrderDetailPO> listOrderDetailByOrderId(int i);

}
