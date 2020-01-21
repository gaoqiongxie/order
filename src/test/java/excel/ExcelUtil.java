package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private static Logger logger = Logger.getLogger(ExcelUtil.class);
	private static Workbook wb;

	public static void createTable(String fromPath, String toPath) throws Exception {

		checkAndCreateSheet(fromPath);
		deleteFile(toPath);
		for (int i = 3; i < wb.getNumberOfSheets(); i++) {
			// 开始解析
			Sheet sheet = wb.getSheetAt(i); // 读取sheet
			int lastRowIndex = sheet.getLastRowNum();

			StringBuilder sb = new StringBuilder();
			String tableName = sheet.getRow(0).getCell(0).toString();
			String tableNameDesc = sheet.getRow(0).getCell(1).toString();
			sb.append("\n");
			sb.append("DROP TABLE IF EXISTS ").append(tableName).append(";");
			sb.append("\n");
			sb.append("CREATE TABLE ").append(tableName).append(" ( ");
			sb.append("\n\t");
			sb.append("id int(11) NOT NULL AUTO_INCREMENT,");
			sb.append("\n\t");
			StringBuilder indexStr = new StringBuilder();
			for (int rIndex = 3; rIndex <= lastRowIndex; rIndex++) { // 遍历行 从第3行开始
				Row row = sheet.getRow(rIndex);
				logger.info("sheet: " + sheet.getSheetName() + " rIndex:" + rIndex);
				if (null == row)
					continue;
				try {
					String field = row.getCell(0).toString();
					String type = row.getCell(1).toString();
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
							String s = cell.toString().toLowerCase();
							sb.append(s);
							break;
						case 2:// NOT NULL
							if (("*").equals(cell.toString())) {
								sb.append(" NOT NULL");
							} else if (!cell.toString().isEmpty()) {
								sb.append(" NOT NULL DEFAULT '").append(cell.toString()).append("'");
							} else if ("timestamp".equals(type)/* ||"date".equals(type) */) {
								sb.append(" NULL DEFAULT NULL");
							} else {
								 if(type.contains("varchar")&&cell.toString().isEmpty()) {
									 sb.append(" NOT NULL DEFAULT ''");
								 }

							}
							break;
						case 3:// Index
							if (("I").equals(cell.toString())) {
								indexStr.append(" KEY `").append(field).append("` (`").append(field).append("`),")
										.append("\n\t");
							}
							break;

						}

					}

					if (!row.getCell(4).toString().isEmpty()) {
						sb.append(" COMMENT ").append("'").append(row.getCell(4).toString()).append("'").append(",");
					} else {
						logger.error("ERROR! COMMENT is null! field is:" + field);
					}
				} catch (Exception e) {
					logger.error("ERROR! sheet is:" + sheet.getSheetName() + " msg:" + e.getMessage());
				}

				sb.append("\n");
				sb.append("\t");
			}
			//加主键
			sb.append("PRIMARY KEY (`id`)")/* .append(" USING BTREE ") */;

			//加索引
			if (!indexStr.toString().isEmpty()) {
				sb.append(",");
				sb.append("\n\t");
				String indexs = indexStr.deleteCharAt(indexStr.lastIndexOf(",")).toString();
				sb.append(indexs);
				sb.append("\n");
			} else {
				sb.append("\n");
			}

			sb.append(") ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='").append(tableNameDesc).append("';");
			sb.append("\n");
			logger.info(sb);
			toSQL(sb, toPath);
		}
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