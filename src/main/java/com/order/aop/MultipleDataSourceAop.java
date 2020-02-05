package com.order.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.base.MultipleDataSource;
import com.order.annotation.DataSourceType;
/**
 * 
 * @author xiegaoqiong
 * @since https://www.jianshu.com/p/c6563efd34b3
 */
@Aspect    // for aop
@Component // for auto scan
@Order(0)  // execute before @Transactional
public class MultipleDataSourceAop {
	private final Logger logger = Logger.getLogger(MultipleDataSourceAop.class);

    /**
     * 拦截 com.**.servicee中所有的方法，根据配置情况进行数据源切换
     * @param joinPoint
     * @throws Throwable
     */
    @Before("execution(* com.order.service.*.*(..))")
    public void changeDataSource(JoinPoint joinPoint) throws Throwable {

        try {
            // 拦截的实体类，就是当前正在执行的service
            Class<?> clazz = joinPoint.getTarget().getClass();
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            // 提取目标对象方法注解和类型注解中的数据源标识
            Class<?>[] types = method.getParameterTypes();
            if (clazz.isAnnotationPresent(DataSourceType.class)) {
                DataSourceType source = clazz.getAnnotation(DataSourceType.class);
                MultipleDataSource.setDataSource(source.value());
                logger.info("Service Class 数据源切换至--->" + source.value());
            }

            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataSourceType.class)) {
                DataSourceType source = m.getAnnotation(DataSourceType.class);
                MultipleDataSource.setDataSource(source.value());
                logger.info("Service Method 数据源切换至--->" + source.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 方法结束后
     */
    @After("execution(* com.order.service.*.*(..))")
    public void afterReturning() throws Throwable {
        try {
            MultipleDataSource.clearDataSource();
            logger.debug("数据源已移除！");
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("数据源移除报错！");
        }

    }
}
