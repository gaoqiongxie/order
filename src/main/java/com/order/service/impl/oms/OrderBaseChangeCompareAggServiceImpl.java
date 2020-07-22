package com.order.service.impl.oms;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oms.model.dto.OrderDetailDTO;
import com.order.entity.OrderDetail;
import com.order.service.AbstractOrderCompareService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderBaseChangeCompareAggServiceImpl extends AbstractOrderCompareService<OrderDetailDTO, OrderDetail> {

	@Override
	public List<Integer> queryAndCompare(List<Integer> erpIds) {
		log.info("1");
		compare(1);
		return null;
	}


}
