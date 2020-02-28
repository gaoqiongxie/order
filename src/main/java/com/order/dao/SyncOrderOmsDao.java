package com.order.dao;

import java.util.List;
import java.util.Map;

import com.oms.model.dto.OrderBaseDTO;
import com.oms.model.dto.OrderDetailDTO;
import com.oms.model.dto.OrderDetailDataDTO;

public interface SyncOrderOmsDao {

	/**----------------------OMS Service-----------------------*/
	OrderBaseDTO findOrderBasePODynamic(Map<String, Object> map);

	int insertOrderBaseDTO(OrderBaseDTO orderBaseDTO);
	int updateOrderBasePODynamic(OrderBaseDTO baseDTO);

	List<Integer> getErpBilldtlIds(Integer orderId);
	int deleteByErpBilldtlIds(List<Integer> reduceIds);
	int insertOrderDetailPO(OrderDetailDTO orderDetailDTO);
	OrderDetailDTO findOneOrderDetailPO(OrderDetailDTO orderDetailDTO);
	int updateOrderDetailPODynamic(OrderDetailDTO orderDetailDTO);

	int insertOrderDetailDataPO(OrderDetailDataDTO orderDetailDataDTO);
	OrderDetailDataDTO findOneOrderDetailDataPO(OrderDetailDataDTO orderDetailDataDTO);
	int updateOrderDetailDataPODynamic(OrderDetailDataDTO orderDetailDataDTO);

	/**----------------------OMS Service-----------------------*/
	
	/**----------------------new build-----------------------*/
	
	int updateOrderDtlOmsId(List<Integer> erpBilldtlIds);

	

	

	

	/**----------------------new build-----------------------*/
}
