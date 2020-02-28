package order;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.order.service.OrderOracleService;
import com.order.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
@Slf4j
public class OrderTest {
	
	@Autowired
	OrderService orderService;
	@Autowired
	OrderOracleService orderOracleService;

	@Test
	public void testSelectById() {
		log.info("testSelectById: " + JSON.toJSON(orderService.getOrderDetail(1)));
	}
	
	@Test
	public void testListOrderDetail() {
		Map<String, Object> map = new HashMap<String, Object>();
		log.info("testListOrderDetail" + JSON.toJSON(orderOracleService.listOrderDetail(map)));
	}
	
	@Test
	public void testSycn() {
		orderService.sycn();
	}
	
	
	@Test
	public void hello() {
		log.info("hello");
	}
}