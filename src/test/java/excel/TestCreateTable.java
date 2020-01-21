package excel;

import org.junit.Test;

public class TestCreateTable {
	
	@Test
	public void testHello() {
		System.out.println("hello");
	}

	@Test
	public void testCreateTable() {
		try {
			ExcelUtil.createTable("D://work/需求/20200107/数据库_order.xlsx", 
					"D://work/需求/20200107/order_DDL.sql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
