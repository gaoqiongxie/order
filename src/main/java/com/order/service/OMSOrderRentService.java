package com.order.service;

public interface OMSOrderRentService {
	
	int sync(int erpId, int orderStatus) throws Exception;

}
