package oms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.order.service.OrderCompareService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
@Slf4j
public class OrderCompareTest {
	@Resource
    private Map<String, OrderCompareService<?, ?>> erpAndOmsCompareServiceMap;

	@Test
	public void test() {
		List<Integer> erpIds = new ArrayList<>();
		erpAndOmsCompareServiceMap.forEach((k, v) -> execute(k, v, erpIds));
	}

	private List<Integer> execute(String serviceKey, OrderCompareService<?, ?> service, List<Integer> erpIds) {
		try {
            return service.queryAndCompare(erpIds);
        } catch (Exception e) {
            log.error("ErpAndOmsCompareService,queryAndCompare error,serviceKey:{},erpIds:{},e:{}", serviceKey, erpIds, e);
            return null;
        }
	}
}
