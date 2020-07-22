package com.base.thread;

import java.util.concurrent.*;
import org.springframework.web.context.request.RequestContextHolder;


public class CommonTaskExecutor {

	/**
	 * 异步线程池
	 */
	private static ExecutorService executor = new ThreadPoolExecutor(20, 50, 5, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>(100));

	/**
	 * 禁止创建实例
	 */
	private CommonTaskExecutor(){}
	
	public static <T> Future<T> submit(Callable<T> task) {
        return executor.submit(new ContextAwareCallable<T>(task,RequestContextHolder.getRequestAttributes()));
	}
}
