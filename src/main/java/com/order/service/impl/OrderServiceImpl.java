package com.order.service.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.order.dao.OrderDetailMapper;
import com.order.entity.OrderDetail;
import com.order.service.OrderOracleService;
import com.order.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@Service
@Component("orderService")
@Slf4j
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDetailMapper orderDetailMapper;
	@Autowired
	OrderOracleService orderOracleService;

	@Override
	public OrderDetail getOrderDetail(int id) {
		return orderDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int sycn() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrderDetail> list = orderOracleService.listOrderDetail(map);
		if (list.isEmpty()) {
			log.info("data from oracle is null");
			return 0;
		}
		log.info("data from oracle count is " + list.size());
		int i = 0;
		for (OrderDetail record : list) {
			setFeidValueNotNull(record);
			i += orderDetailMapper.insert(record);
		}
		log.info("sycn count is " + i);
		return i;
	}

	/**
	 * java中对象属性 null 赋默认值
	 * 
	 * @param obj
	 * @throws Exception
	 */
	private void setFeidValueNotNull(Object obj){
		try {
			obj.getClass().getDeclaredFields();
			for (Field field : obj.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				if (field.get(obj) == null) {
					if (field.getGenericType().toString().equals("class java.lang.String")) {
						field.set(obj, "");
					} else if (field.getGenericType().toString().equals("class java.lang.Integer")) {
						field.set(obj, 0);
					} else if (field.getGenericType().toString().equals("class java.lang.Double")) {
						field.set(obj, 0.0);
					} else if (field.getGenericType().toString().equals("class java.lang.Long")) {
						field.set(obj, 0L);
					}
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
