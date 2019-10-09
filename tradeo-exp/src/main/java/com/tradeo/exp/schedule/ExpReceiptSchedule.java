package com.tradeo.exp.schedule;

import java.io.File;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.handler.ExpReceiptHandler;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.FileUtils;
import com.tradeo.exp.common.xml.exp.receipt.ExpReceipt;
import com.tradeo.exp.service.TradeExpReceiptService;

@Component(value = "expReceiptSchedule")
public class ExpReceiptSchedule implements DisposableBean{
	
	private  Logger logger = LoggerFactory.getLogger(ExpReceiptSchedule.class);
	
	@Resource
	private ApplicationContext applicationContext;
	
	/***********************多布置节点使用**********************/
	
	//任务编号
	@Value("${tradeo.schedule.exp.receipt.index}")
	private int index;

	//总组数
	@Value("${tradeo.schedule.exp.receipt.total}")
	private int total;
	
	//是否启用
	@Value("${tradeo.schedule.exp.receipt.isUse}")
	private boolean isUse;
	
	/*********************************************/
	
	@Value("${tradeo.schedule.exp.receipt.file.path}")
	private String receiptFilePath;
	
	@Autowired
	private TradeExpReceiptService tradeExpReceiptService;
	
	@Autowired
	private ExpReceiptHandler expReceiptHandler;
	
	@Scheduled(fixedDelay=10*1000)
	public void run (){
		
		
		logger.info(CommonUtils.getOutputLine("新快件接受任务，开始..."));
		
		if(!isUse){
			TradeExpTaskScheduler ttoExpTaskScheduler = 
					(TradeExpTaskScheduler) applicationContext.getBean("tradeExpTaskScheduler");
			ttoExpTaskScheduler.cancelTask(this);
			logger.info(CommonUtils.getOutputLine("新快件接受任务停止...(已完成)"));
			return;
		}
		File [] files = FileUtils.getFilePathList(receiptFilePath, index, total);
		if(CommonUtils.isEmptyObj(files) || files.length == 0){
			logger.info(CommonUtils.getOutputLine("没有要处理的新快件回执数据"));
			return ;
		}
		
		for (File file : files) {
			try {
				byte [] receiptMessage = FileUtils.read2Byte(file);
				
				if(!FileUtils.rename(file)){
					logger.info(CommonUtils.getOutputLine("快件回执：接受报文文件移动失败,进入下次循环..."));
					continue;
				}
				if(!CommonUtils.isEmptyObj(receiptMessage)){
					String orginalMessage = new String(receiptMessage,Constant.ENCODE);
					logger.info(CommonUtils.getOutputLine("快件回执原始报文【"+ orginalMessage +"】"));
					ExpReceipt expReceipt = expReceiptHandler.getExpReceipt(receiptMessage);
					
					if(!CommonUtils.isEmptyObj(expReceipt)){
						logger.info(CommonUtils.getOutputLine("新快件回执对象信息【"+ JSON.toJSONString(expReceipt) +"】"));
						//业务逻辑 处理
						expReceipt.setOrginalMessage(orginalMessage);
						tradeExpReceiptService.expReceiptCoreHandler(expReceipt);
					}
				}

			} catch (Exception e) {
				logger.error("新快件回执处理出现异常,详情【"+ e.getMessage() +"】", e);
			}	
		}
		
		files = null;
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
