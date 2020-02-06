package oms;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.oms.model.dto.OrderRentDTO;
import com.order.dao.SyncOrderErpDao;
import com.order.dao.SyncOrderOmsDao;
import com.order.service.ERPOrderRentService;
import com.order.service.OMSOrderRentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class OrderRentSyncTest {

	private static Logger logger = Logger.getLogger(OrderRentSyncTest.class);
	
	@Autowired
	OMSOrderRentService oMSOrderRentService;
	@Autowired
	ERPOrderRentService eRPOrderRentService;
	@Autowired
	SyncOrderOmsDao syncOrderOmsDao;
	@Autowired
	SyncOrderErpDao syncOrderErpDao;
	

	//OMS 调取 ERP 获取订单相关信息
	//@Param("id")
	@Test
	public void testSync() {
		int id = 178972191;
		/**
		 * 10:草稿; 20:已输入; 30:业务已提交; 40:审批中; 50:已审批; 
		 * 60:执行中; 70:已退场; 80:已完成; 90:已完结; 100:已作废 
		 */
		int orderStatus = 0;
		oMSOrderRentService.sync(id, orderStatus);
	}

	@Test
	public void testInsertOrUpdate() {
		int id = 178972191;
		Boolean existFlag = false;
		OrderRentDTO orderRentERP = eRPOrderRentService.getDTOByOrderId(id);
		logger.info("OrderRentDTO： "+JSON.toJSON(orderRentERP));
	}
}
