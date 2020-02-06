package com.base;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

import org.apache.log4j.Logger;

public class BaseUtil {

	private static Logger logger = Logger.getLogger(BaseUtil.class);
	
	/**
	 * 只要有一个属性值不为null 就返回false 表示对象不为null
	 * @param object
	 * @return
	 */
	public static boolean objCheckIsNull(Object object) {
    	if (object == null) {
            return true;
        }
        // 得到类对象
        Class clazz = object.getClass();
        // 得到所有属性
        Field[] fields = clazz.getDeclaredFields();
        //定义返回结果，默认为true
        boolean flag = true;
        for (Field field : fields) {
        	//设置权限（很重要，否则获取不到private的属性，不了解的同学补习一下反射知识）
            field.setAccessible(true);
            Object fieldValue = null;
            String fieldName = null;
            try {
                //得到属性值
                fieldValue = field.get(object);
                //得到属性类型
                Type fieldType = field.getGenericType();
                //得到属性名
                fieldName = field.getName();
                if("serialVersionUID".equals(fieldName)) continue;
                //打印输出(调试用可忽略)
            	logger.info("属性类型：" + fieldType + ",属性名：" + fieldName + ",属性值：" + fieldValue);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
            //只要有一个属性值不为null 就返回false 表示对象不为null
            if (fieldValue != null) {
                flag = false;
                break;
            }
        }
        return flag;
    }
	
	private static boolean objFieldCheckIsNull(Object object) {
    	if (object == null) {
            return true;
        }
        // 得到类对象
        Class clazz = object.getClass();
        // 得到所有属性
        Field[] fields = clazz.getDeclaredFields();
        //定义返回结果，默认为true
        boolean flag = true;
        for (Field field : fields) {
        	//设置权限（很重要，否则获取不到private的属性，不了解的同学补习一下反射知识）
            field.setAccessible(true);
            Object fieldValue = null;
            String fieldName = null;
            try {
                //得到属性值
                fieldValue = field.get(object);
                //得到属性类型
                Type fieldType = field.getGenericType();
                //得到属性名
                fieldName = field.getName();
                if("serialVersionUID".equals(fieldName)) continue;
                //打印输出(调试用可忽略)
            	logger.info("属性类型：" + fieldType + ",属性名：" + fieldName + ",属性值：" + fieldValue);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
            //只要有一个属性值不为null 就返回false 表示对象不为null
            if (fieldValue != null) {
                flag = false;
                break;
            }
        }
        return flag;
    }
	
	/**
	 * 将null值付默认值
	 * String ""
	 * @param object
	 */
	public static void objNullSetDefault(Object object) {
    	if (object == null) {
            return;
        }
		try {
			for (Field f : object.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				String type = f.getGenericType().toString();
				if (f.get(object) == null && type.equals("class java.lang.String")){ //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
					f.set(object, "");
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
    }
	
}
