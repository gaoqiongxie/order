package com.order.dao;

import java.util.List;
import java.util.Map;

import com.oms.model.po.OrderBasePO;
import com.oms.model.po.OrderDetailDataPO;
import com.oms.model.po.OrderDetailPO;

public interface SyncOrderOmsDao {

	/**----------------------OMS Service-----------------------*/
	OrderBasePO findOrderBasePODynamic(Map<String, Object> map);

	int insertOrderRentDTO(OrderBasePO orderBasePO);
	int updateOrderBasePODynamic(OrderBasePO basePO);

	int insertOrderDetailPO(OrderDetailPO orderDetailPO);
	OrderDetailPO findOneOrderDetailPO(OrderDetailPO orderDetailPO);
	int updateOrderDetailPODynamic(OrderDetailPO orderDetailPO);

	int insertOrderDetailDataPO(OrderDetailDataPO orderDetailDataPO);
	OrderDetailDataPO findOneOrderDetailDataPO(OrderDetailDataPO orderDetailDataPO);
	int updateOrderDetailDataPODynamic(OrderDetailDataPO orderDetailDataPO);

	/**----------------------OMS Service-----------------------*/
	
	/**----------------------new build-----------------------*/
	
	int updateOrderDtlOmsId(List<Integer> erpBilldtlIds);

	

	

	/**----------------------new build-----------------------*/
}
