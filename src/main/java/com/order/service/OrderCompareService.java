package com.order.service;

import java.util.List;

public interface OrderCompareService<ERP, OMS> {

	List<Integer> queryAndCompare(List<Integer> erpIds);
	
	void compare(int type);
	
	
}
