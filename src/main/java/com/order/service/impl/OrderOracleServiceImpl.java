package com.order.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.order.annotation.DataSourceType;
import com.order.constants.DataSourceConstants;
import com.order.dao.OrderDetailMapper;
import com.order.entity.OrderDetail;
import com.order.service.OrderOracleService;

@Service
@Component("orderOracleService")
@DataSourceType(value = DataSourceConstants.DATASOURCE_ORACLE)
public class OrderOracleServiceImpl implements OrderOracleService {
	
	@Autowired
	OrderDetailMapper orderDetailMapper;

	@Override
	public List<OrderDetail> listOrderDetail(Map<String, Object> o) {
		return orderDetailMapper.listOrderDetail(o);
	}

}
