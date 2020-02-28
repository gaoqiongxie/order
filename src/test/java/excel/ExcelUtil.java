package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelUtil {
	private static Workbook wb;

	/**
	 * 整张表
	 * @param fromPath
	 * @param toPath
	 * @throws Exception
	 */
	public static void createTable(String fromPath, String toPath) throws Exception {
		checkAndCreateSheet(fromPath);
		deleteFile(toPath);
		for (int i = 3; i < wb.getNumberOfSheets(); i++) {//从第四张表开始
			createTable(fromPath, toPath, wb.getSheetAt(i));
		}
	}

	

	public static void createTable(String fromPath, String toPath, String sheetNameForm) throws Exception {
		checkAndCreateSheet(fromPath);
		String toPathUri = toPath + sheetNameForm + ".sql";
		deleteFile(toPathUri);
		for (int i = 3; i < wb.getNumberOfSheets(); i++) {
			// 开始解析
			Sheet sheet = wb.getSheetAt(i); // 读取sheet
			String sheetName = sheet.getSheetName();
			if (!sheetNameForm.equals(sheetName)) {
				continue;
			}
			createTable(fromPath, toPathUri, sheet);
		}
	}

	private static void createTable(String fromPath, String toPathUri, Sheet sheet) throws IOException {
		int lastRowIndex = sheet.getLastRowNum();

		StringBuilder sb = new StringBuilder();
		String tableName = sheet.getRow(0).getCell(0).toString();
		String tableNameDesc = sheet.getRow(0).getCell(1).toString();
		sb.append("\n");
		sb.append("DROP TABLE IF EXISTS ").append(tableName).append(";");
		sb.append("\n");
		sb.append("CREATE TABLE ").append(tableName).append(" ( ");
		sb.append("\n\t");
		sb.append("id int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',");
		sb.append("\n\t");
		StringBuilder indexStr = new StringBuilder();
		StringBuilder uniqueStr = new StringBuilder();
		for (int rIndex = 3; rIndex <= lastRowIndex; rIndex++) { // 遍历行 从第3行开始
			Row row = sheet.getRow(rIndex);
			log.info("sheet: " + sheet.getSheetName() + " rIndex:" + rIndex);
			if (null == row)
				continue;
			try {
				String field = row.getCell(0).toString();
				// 字段 类型 默认值 索引
				for (int cIndex = row.getFirstCellNum(); cIndex <= 5; cIndex++) { // 遍历列 ，到第6列 是否非空

					Cell cell = row.getCell(cIndex);
					if (cell == null)
						continue;
					switch (cIndex) {
					case 0:// field
						sb.append(cell.toString() + " ");
						break;
					case 1:// type
						sb.append(cell.toString().toLowerCase());
						break;
					case 2:// NOT NULL DEFAULT
						sb.append(getDefault(cell.toString(), row.getCell(1).toString(), cell.getCellType()));
						break;
					case 3:// Index
						if (("I").equals(cell.toString())) {
							if (!indexStr.toString().isEmpty()) {
								indexStr.append(",").append("\n\t");
							}
							indexStr.append("KEY `").append(field).append("` (`").append(field).append("`)");
						} else if (("U").equals(cell.toString())) {
							// UNIQUE KEY unq_orderid(`order_id`)
							uniqueStr.append("UNIQUE KEY `").append("unq_").append(field).append("` (`").append(field)
									.append("`)");
						}
						break;
					}

				}

				if (!row.getCell(4).toString().isEmpty()) {
					sb.append(" COMMENT ").append("'").append(row.getCell(4).toString()).append("'").append(",");
				} else {
					log.error("ERROR! COMMENT is null! field is:" + field);
				}
			} catch (Exception e) {
				log.error("ERROR! sheet is:" + sheet.getSheetName() + " msg:" + e.getMessage());
			}

			sb.append("\n");
			sb.append("\t");
		}
		// 加主键
		sb.append("PRIMARY KEY (`id`)")/* .append(" USING BTREE ") */;
		// 加唯一索引
		if (!uniqueStr.toString().isEmpty()) {
			sb.append(",");
			sb.append("\n\t");
			sb.append(uniqueStr);
		}
		// 加索引
		if (!indexStr.toString().isEmpty()) {
			sb.append(",");
			sb.append("\n\t");
			sb.append(indexStr);
		}
		sb.append("\n");
		sb.append(") ENGINE=InnoDB COMMENT='").append(tableNameDesc).append("';");
		sb.append("\n");
		log.info(""+ sb);
		toSQL(sb, toPathUri);
	}
	
	/**
	 * 
	 * @param defaultStr
	 * @param columtype
	 * @param cellType
	 * @return
	 */
	private static StringBuilder getDefault(String defaultStr, String columtype, int cellType) {
		StringBuilder sb = new StringBuilder();
		if (("*").equals(defaultStr)) {// 原定义非空
			sb.append(" NOT NULL");
			if (columtype.contains("varchar")) {
				// 字符串非空默认 ''
				sb.append(" DEFAULT ''");
			}
		}else if ("datetime".equals(columtype) && defaultStr.isEmpty()) {
			sb.append(" DEFAULT NULL");
		}else if ("datetime".equals(columtype) && !defaultStr.isEmpty()) {
			sb.append(" NOT NULL DEFAULT ").append(defaultStr).append("");
		}else if (columtype.contains("varchar") && defaultStr.isEmpty()) {
			sb.append(" NOT NULL DEFAULT ''");
		}else if (!defaultStr.isEmpty()) {// 有默认值
			// 解决数值类型有小数点问题
			String o = 0 == cellType ? defaultStr.replace(".0", "") : defaultStr;
			sb.append(" NOT NULL DEFAULT '").append(o).append("'");
		} 
		return sb;
	}



	private static void toSQL(StringBuilder orderSql, String toPath) throws IOException {
		File file = new File(toPath);

		if (!file.exists())
			file.createNewFile();

		FileOutputStream out = new FileOutputStream(file, true);
		out.write(orderSql.toString().getBytes("utf-8"));
		out.close();
	}

	private static void deleteFile(String toPath) {
		File file = new File(toPath);
		if (file.exists() || file.isFile())
			file.delete();
	}

	private static void checkAndCreateSheet(String path) throws Exception {
		if (path == null)
			return;
		String excelPath = path;
		File excel = new File(excelPath);
		String[] split = excel.getName().split("\\."); // .是特殊字符，需要转义！！！！！
		if ("xls".equals(split[1])) {
			FileInputStream fis = new FileInputStream(excel); // 文件流对象
			wb = new HSSFWorkbook(fis);
		} else if ("xlsx".equals(split[1])) {
			wb = new XSSFWorkbook(excel);
		} else {
			throw new Exception("文件类型错误!");
		}
	}
}