package com.tradeo.exp.schedule;

import java.io.File;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.alibaba.fastjson.JSON;
import com.tradeo.exp.common.handler.MftReceiptHandler;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.FileUtils;
import com.tradeo.exp.common.xml.mft.receipt.MftReceipt;


//@Component(value = "mftReceiptSchedule")
public class MftReceiptSchedule implements DisposableBean{
	
	private  Logger logger = LoggerFactory.getLogger(MftReceiptSchedule.class);
	
	//任务编号
	@Value("${tradeo.schedule.mft.receipt.index}")
	private int index;

	//总组数
	@Value("${tradeo.schedule.mft.receipt.total}")
	private int total;
	
	//是否启用
	@Value("${tradeo.schedule.mft.receipt.isUse}")
	private boolean isUse;
	
	@Resource
	private ApplicationContext applicationContext;
	
	@Value("${tradeo.schedule.mft.receipt.file.path}")
	private String receiptFilePath;
	
	
//	@Scheduled(fixedDelay=10*1000,initialDelay=10*1000)
	@Scheduled(fixedDelay=10*1000)
	public void run (){
		logger.info(CommonUtils.getOutputLine("舱单接受任务，开始..."));
		if(!isUse){
			TradeExpTaskScheduler ttoExpTaskScheduler = 
					(TradeExpTaskScheduler) applicationContext.getBean("tradeExpTaskScheduler");
			ttoExpTaskScheduler.cancelTask(this);
			logger.info(CommonUtils.getOutputLine("舱单接受任务停止...(已完成)"));
			return;
		}
		File [] files = FileUtils.getFilePathList(receiptFilePath, index, total);
		if(CommonUtils.isEmptyObj(files) || files.length == 0){
			logger.info("没有要处理的回执数据");
			return ;
		}
		for (File file : files) {
			String receiptMessage = FileUtils.read2String(file);
			MftReceipt mftReceipt = MftReceiptHandler.getMtfReceiptEntity(receiptMessage);
			if(!CommonUtils.isEmptyObj(mftReceipt)){
				logger.info(CommonUtils.getOutputLine("返回的回执数据【"+ JSON.toJSONString(mftReceipt) +"】"));
				
				//业务逻辑 处理
			}else{
			}
			
			FileUtils.rename(file);
		}
	}


	@Override
	public void destroy() throws Exception {
		try {
			ThreadPoolTaskScheduler scheduler = (ThreadPoolTaskScheduler)applicationContext.getBean("tradeExpTaskScheduler");
			if(!CommonUtils.isEmptyObj(scheduler)){
				scheduler.destroy();
			}
		} catch (Exception e) {
			logger.info(CommonUtils.getOutputLine("容器关闭，停止任务"));
		}
		
		
	}
	

}
