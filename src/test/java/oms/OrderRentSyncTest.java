package oms;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.base.BaseUtil;
import com.oms.model.po.OrderDetailPO;
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
	public void testInsertBatch() {
		List<OrderDetailPO> orderDetialPOs = eRPOrderRentService.listOrderDetailByOrderId(178972191);
		try {
			for (OrderDetailPO orderDetailPO : orderDetialPOs) {
				orderDetailPO.setOrderId(1);
//				for (Field f : orderDetailPO.getClass().getDeclaredFields()) {
//					f.setAccessible(true);
//					String type = f.getGenericType().toString();
//					if (f.get(orderDetailPO) == null && type.equals("class java.lang.String")){ //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
//						f.set(orderDetailPO, "");
//						System.out.println(f.getName());
//					}
//				}
				BaseUtil.objNullSetDefault(orderDetailPO);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		BaseUtil.objNullSetDefault(orderDetialPOs);
		logger.info("testInsertBatch orderDetialPOs:"+JSON.toJSON(orderDetialPOs));

//		syncOrderOmsDao.insertOrUpdateOrderDetailPO(orderDetialPOs);
	}
}
