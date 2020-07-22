package excel;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.excel.export.styler.AbstractExcelExportStyler;
import cn.afterturn.easypoi.excel.export.styler.IExcelExportStyler;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.cglib.beans.BeanMap;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;


/**
 * 数据导出工具
 * @author xiegaoqiong
 *
 * @param <T>
 */
@Slf4j
public class ExcelExporter<T> {
	 /**
     * 导出，按自定义列配置进行导出
     * @Param
     * @return
     */
    public void doExport(OutputStream outputStream,List<T> sourceList,List<ExcelExportEntity> exportEntityList){
        try {
            //设置导出模版
            ExportParams params=new ExportParams();
            params.setStyle(FehorizonExcelExportStylerImpl.class);

            //导出数据
            List<Map<String, Object>> dataList = objectsToMaps(sourceList);

            //处理宽度
            handleExportEntity(exportEntityList);

            //生成导出对象
            Workbook workbook = ExcelExportUtil.exportExcel(params,exportEntityList,dataList);

            //导出
            workbook.write(outputStream);
        }catch (Exception e){
            log.error("OmsExcelExporter.doExport error,e:",e);
        }
    }

    /** 宽度 **/
    private void handleExportEntity(List<ExcelExportEntity> exportEntityList) {
        if (CollectionUtils.isNotEmpty(exportEntityList)) {
            for(ExcelExportEntity e:exportEntityList){ //控件中限制了最大255宽
                if(e.getWidth() > 255){
                    e.setWidth(255);
                }
                if(e.getWidth() <1 ){
                    e.setWidth(1);
                }
            }
        }
    }

    /** 自定义样式类 **/
    public static class FehorizonExcelExportStylerImpl extends AbstractExcelExportStyler implements IExcelExportStyler {

        public FehorizonExcelExportStylerImpl(Workbook workbook) {
            super.createStyles(workbook);
        }

        @Override
        public CellStyle getHeaderStyle(short headerColor) {
            CellStyle titleStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setFontHeightInPoints((short) 24);
            titleStyle.setFont(font);
            titleStyle.setFillForegroundColor(headerColor);
            titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            return titleStyle;
        }

        @Override
        public CellStyle getTitleStyle(short color) {
            CellStyle titleStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true); //加粗
            font.setColor(IndexedColors.BLACK.index);
            titleStyle.setFont(font);

            //单元格
            titleStyle.setBorderLeft(BorderStyle.THIN);
            titleStyle.setBorderRight(BorderStyle.THIN);
            titleStyle.setBorderBottom(BorderStyle.THIN);
            titleStyle.setBorderTop(BorderStyle.THIN);
            titleStyle.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index); // 填充的背景颜色
            titleStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.index);
            titleStyle.setAlignment(HorizontalAlignment.CENTER);
            titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            titleStyle.setWrapText(false);
            return titleStyle;
        }

        @Override
        public CellStyle stringNoneStyle(Workbook workbook, boolean isWarp) {
            CellStyle style = workbook.createCellStyle();
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderBottom(BorderStyle.THIN);
            style.setBorderTop(BorderStyle.THIN);
            style.setAlignment(HorizontalAlignment.LEFT);
            style.setVerticalAlignment(VerticalAlignment.CENTER);
            style.setDataFormat(STRING_FORMAT);
            if (isWarp) {
                style.setWrapText(true);
            }
            return style;
        }

        @Override
        public CellStyle stringSeptailStyle(Workbook workbook, boolean isWarp) {
            CellStyle style = workbook.createCellStyle();
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderBottom(BorderStyle.THIN);
            style.setBorderTop(BorderStyle.THIN);
            style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.index); // 填充的背景颜色
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND); // 填充图案
            style.setAlignment(HorizontalAlignment.LEFT);
            style.setVerticalAlignment(VerticalAlignment.CENTER);
            style.setDataFormat(STRING_FORMAT);
            if (isWarp) {
                style.setWrapText(true);
            }
            return style;
        }
    }

    /** 将List<T>转换为List<Map<String, Object>> */
    private <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
        List<Map<String, Object>> list = Lists.newArrayList();
        if (objList != null && objList.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0, size = objList.size(); i < size; i++) {
                bean = objList.get(i);
                map = beanToMap(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**  将对象装换为map */
    private <T> Map<String, Object> beanToMap(T bean) {
        Map<String, Object> map = Maps.newHashMap();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }
}
