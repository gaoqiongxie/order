package com.order.service.impl;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.oms.model.dto.OrderBaseDTO;
import com.oms.model.dto.OrderRentDTO;
import com.order.annotation.DataSourceType;
import com.order.constants.DataSourceConstants;
import com.order.dao.SyncOrderErpDao;
import com.order.service.ERPOrderRentService;

import lombok.extern.slf4j.Slf4j;


@Service
@Component("eRPOrderRentService")
@DataSourceType(value = DataSourceConstants.DATASOURCE_ORACLE)
@Slf4j
public class ERPOrderRentServiceImpl implements ERPOrderRentService {
	
	@Autowired
	SyncOrderErpDao orderRentDao;

	@Override
	public OrderRentDTO getDTOByOrderId(int erpId) throws InterruptedException {
		// 查询是否有该订单
		OrderBaseDTO orderBase = orderRentDao.getOrderBaseByOrderId(erpId);
		if (null == orderBase) {
			log.info("ERP QUERY 查询该订单为空，billId= " + erpId);
			return null;
		}
		//18张表
		final CountDownLatch count = new CountDownLatch(18);
		//线程池
		final ExecutorService executorService = Executors.newFixedThreadPool(5);
		OrderRentDTO orderRentDTO = new OrderRentDTO();
		// 1.订单基础表信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderBaseDTO(orderBase);
				} finally {
					count.countDown();
				}
			}
		});
		// 2.订单基础变更信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
				} finally {
					count.countDown();
				}
			}
		});
		// 3.订单基础地址信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
				} finally {
					count.countDown();
				}
			}
		});
		// 4.订单基础扩展信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
				} finally {
					count.countDown();
				}
			}
		});
		// 5.订单基础风险信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
				} finally {
					count.countDown();
				}
			}
		});
		// 6.订单基础系统信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
				} finally {
					count.countDown();
				}
			}
		});
		// 7.详细订单明细
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderDetailList(orderRentDao.listOrderDetailByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 8.租赁订单明细数据
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderDetailDataList(orderRentDao.listOrderDetailDataByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 9.租赁订单备件明细
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderSparePartsDetailList(orderRentDao.listOrderSparePartsDetailByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 10.租赁订单联系人
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderContactList(orderRentDao.listOrderContactByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 11.租赁订单客户资信
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderCustomerCreditList(orderRentDao.listOrderCustomerCreditByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 12.租赁订单风险管理
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderRiskManagementList(orderRentDao.listOrderRiskManagementByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 13.租赁订单联系人反欺诈
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderContactAntiFraudList(orderRentDao.listOrderContactAntiFraudByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 14.租赁订单其他费用
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderOtherCostList(orderRentDao.listOrderOtherCostByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		// 15.租赁订单支付进度
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderPayScheduleList(orderRentDao.listOrderPayScheduleDTOByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		
		// 16.租赁订单代金券
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderCashCouponList(orderRentDao.listOrderCashCouponDTOByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});	
		
		// 17.租赁订单信息变更
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderChangeInfoList(orderRentDao.listOrderChangeInfoDTOByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});	
		// 18. 租赁订单合同回收状态复核信息
		executorService.submit(new Runnable() {
			public void run() {
				try {
					orderRentDTO.setOrderContractRecoverReviewStatusList(orderRentDao.listOrderContractRecoverReviewStatusDTOByOrderId(erpId));
				} finally {
					count.countDown();
				}
			}
		});
		
		count.await(5, TimeUnit.SECONDS);
		
		executorService.shutdown();
		return orderRentDTO;
	}

}
