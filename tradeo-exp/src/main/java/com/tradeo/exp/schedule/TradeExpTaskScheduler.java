package com.tradeo.exp.schedule;

import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.ScheduledMethodRunnable;
import org.springframework.stereotype.Service;

/**
 *  定时任务 --  提供停止某一定时操作 
 * @author duwenjie
 *
 */
@Service(value="tradeExpTaskScheduler")
public class TradeExpTaskScheduler extends ThreadPoolTaskScheduler {
	
	private final Map<Object, ScheduledFuture<?>> scheduledTasks = Collections.synchronizedMap(new IdentityHashMap<>());
	
	private  Logger logger = LoggerFactory.getLogger(TradeExpTaskScheduler.class);

	private static final long serialVersionUID = 1L;
	
	@Override
	public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, Date startTime, long delay) {
		ScheduledFuture<?>  future = super.scheduleWithFixedDelay(task, startTime, delay);
		ScheduledMethodRunnable runnable = (ScheduledMethodRunnable) task;
		scheduledTasks.put(runnable.getTarget(), future);
		return future;
	}
	
	@Override
	public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long delay) {
		ScheduledFuture<?>  future = super.scheduleWithFixedDelay(task, delay);
		ScheduledMethodRunnable runnable = (ScheduledMethodRunnable) task;
		scheduledTasks.put(runnable.getTarget(), future);
		return future;
	}
	
	/**
	 * 取消某一具体的定时任务
	 * @param identifier
	 */
	public void cancelTask(Object identifier) {
        ScheduledFuture<?> future = scheduledTasks.get(identifier);
        if (null != future) {
        	logger.info("future is not null");
            future.cancel(true);
            scheduledTasks.remove(future);
            logger.info("定时任务个数【"+ scheduledTasks.size() +"】");
        }
    }

}
