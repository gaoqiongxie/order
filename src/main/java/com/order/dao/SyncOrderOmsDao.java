package com.order.dao;

import java.util.Map;

import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderDetailPO;

public interface SyncOrderOmsDao {

	OrderBasePO findOrderBasePODynamic(Map<String, Object> map);

	int updateOrderBasePODynamic(OrderBasePO basePO);

	int insertOrderRentDTO(OrderBasePO orderBasePO);

	int insertOrderDetailPO(OrderDetailPO orderDetailPO);
	int updateOrderDetailPODynamic(OrderDetailPO orderDetailPO);

	
}
