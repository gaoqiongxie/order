package com.order.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public abstract class AbstractOrderCompareService<ERP, OMS> implements OrderCompareService<ERP, OMS> {
	@Override
    public void compare(int type) {
		switch (type) {
		case 1:log.info("compare 1");break;
		case 2:log.info("compare 2");break;
		case 3:log.info("compare 3");break;
		case 4:log.info("compare 4");break;
		case 5:log.info("compare 5");break;
		default:log.info("compare default");
			break;
		}
	}
	

}
