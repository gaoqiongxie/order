package oms;

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

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
@Slf4j
public class OrderRentSyncTest {

	@Autowired
	OMSOrderRentService omsOrderRentService;
	@Autowired
	ERPOrderRentService erpOrderRentService;
	@Autowired
	SyncOrderOmsDao syncOrderOmsDao;
	@Autowired
	SyncOrderErpDao syncOrderErpDao;

	@Test
	public void testSync() throws Exception {
		int erpId = 178972191;
		/**
		 * 10:草稿; 20:已输入; 30:业务已提交; 40:审批中; 50:已审批; 60:执行中; 70:已退场; 80:已完成; 90:已完结;
		 * 100:已作废 新增 -1 删除
		 */
		int orderStatus = 0;
		log.info("" + omsOrderRentService.sync(erpId, orderStatus));
	}

	@Test
	public void testGetDTOByOrderId() throws Exception {
		int erpId = 178972191;
		// 调用 ERP 获取 orderRent 数据
		OrderRentDTO orderRentERP = erpOrderRentService.getDTOByOrderId(erpId);
		if (null == orderRentERP || null == orderRentERP.getOrderBaseDTO()) {
			log.info("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
			throw new Exception("ERP 库中不存在该租赁订单，故无法同步，billId = " + erpId);
		}
		log.info("OrderRentDTO： " + JSON.toJSON(orderRentERP));
	}

	@Test
	public void oTo() {
		JSON.parseObject(JSON.toJSONString(""), OrderRentDTO.class);
	}
}
