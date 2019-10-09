package com.tradeo.exp.schedule;

import java.util.List;

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

import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.FileUtils;
import com.tradeo.exp.common.xml.mft.mesg.MftMessage;
import com.tradeo.exp.common.xml.mft.send.Manifest;
import com.tradeo.exp.service.TradeExpSendService;

//@Component(value="mftSendSchedule")
public class MftSendSchedule implements DisposableBean{
	
	private  Logger logger = LoggerFactory.getLogger(MftSendSchedule.class);
	
	//任务编号
	@Value("${tradeo.schedule.mft.send.index}")
	private int index;

	//总组数
	@Value("${tradeo.schedule.mft.send.total}")
	private int total;
	
	//是否启用
	@Value("${tradeo.schedule.mft.send.isUse}")
	private boolean isUse;
	
	@Resource
	private ApplicationContext applicationContext;
	
	@Autowired
	private TradeExpSendService fastGoodSendService;
	
	@Value("${tradeo.schedule.mft.send.file.path}")
	private String sendFilePath;
	
	@Value("${tradeo.schedule.send.count}")
	private int count;
	
	@Scheduled(fixedDelay=10*1000)
	public void run(){
//		logger.info(CommonUtils.getOutputLine("舱单发送任务，开始..."));
//		if(!isUse){
//			TradeExpTaskScheduler ttoExpTaskScheduler = 
//					(TradeExpTaskScheduler) applicationContext.getBean("tradeExpTaskScheduler");
//			ttoExpTaskScheduler.cancelTask(this);
//			logger.info(CommonUtils.getOutputLine("舱单发送任务停止...(已完成)"));
//			return ;
//		}
//		
//		logger.info("舱单下发任务启动,index【"+ index +"】,total【"+ total +"】,count【"+ count +"】,sendFilePath【"+ sendFilePath +"】");
//		List<Manifest> manifestList = fastGoodSendService.selectMftUnsendRecodeList(index, total, count);
//		if(!CommonUtils.isEmptyCollection(manifestList)){
//			for (Manifest manifest : manifestList) {
//				String mftSendMessage  = MftMessage.getMessage(manifest);
//				if(!CommonUtils.isEmpty(mftSendMessage)){
//					//生成文件
//					FileUtils.write2File(sendFilePath, mftSendMessage, Constant.BUSI_TYPE_MFT);
//					
//					mftSendMessage = null;
//				}else{
//					logger.info(CommonUtils.getOutputLine("舱单 下发数据为空，数据异常，发送数据失败"));
//				}
//			}
//			
//			//发送完成 修改 业务数据状态    待确认  TODO
//			
//		}else{
//			logger.info(CommonUtils.getOutputLine("舱单下发任务，本次 没有待下发的数据..."));
//		}
		
		
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
