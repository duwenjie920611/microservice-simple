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
import org.springframework.util.StringUtils;

import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.eum.ResponseEnum;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.FileUtils;
import com.tradeo.exp.common.xml.exp.mesg.DExp301Message;
import com.tradeo.exp.common.xml.exp.mesg.DExp311Message;
import com.tradeo.exp.common.xml.exp.mesg.Exp307Message;
import com.tradeo.exp.common.xml.exp.send.Data;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.service.TradeExpSendService;

@Component(value="expSendSchedule")
public class ExpSendSchedule implements DisposableBean{
	
	private  Logger logger = LoggerFactory.getLogger(ExpSendSchedule.class);
	
	//任务编号
	@Value("${tradeo.schedule.exp.send.index}")
	private int index;

	//总组数
	@Value("${tradeo.schedule.exp.send.total}")
	private int total;
	
	//是否启用
	@Value("${tradeo.schedule.exp.send.isUse}")
	private boolean isUse;
	
//	@Value("${tradeo.schedule.exp.send.isValid}")
//	private boolean isValid;
	
	@Resource
	private ApplicationContext applicationContext;
	
	@Autowired
	private TradeExpSendService tradeExpSendService;
	
	@Value("${tradeo.schedule.exp.send.file.path}")
	private String sendFilePath;
	
	@Value("${tradeo.schedule.send.count}")
	private int count;
	
	@Value("${tradeo.schedule.exp.send.sendId}")
	private String sendId;
	
	@Scheduled(fixedDelay=10*1000)
	public void run(){
		logger.info(CommonUtils.getOutputLine("新快件发送任务，开始..."));
		
		if(!isUse){
			TradeExpTaskScheduler ttoExpTaskScheduler = (TradeExpTaskScheduler) applicationContext.getBean("tradeExpTaskScheduler");
			ttoExpTaskScheduler.cancelTask(this);
			logger.info(CommonUtils.getOutputLine("新快件发送任务停止...(已完成)"));
			return ;
		}
		
		List<ExpBaseEntity<Data>> expList = tradeExpSendService.selectExpUnsendRecodeList(index, total, count,sendId);
		if(!CommonUtils.isEmptyCollection(expList)){
			logger.info(CommonUtils.getOutputLine("快件下发任务，本次下发条数据【"+ expList.size() +"】"));
			
			for (ExpBaseEntity<Data> expBaseEntity : expList) {
				
				String expSendMessage = null;
				
				if(expBaseEntity.getStatus().getCode().equals(ResponseEnum.SUCCESS.getCode())){
					try {
						String messageType = expBaseEntity.getEnvelopInfo().getMessageType();
						switch (messageType) {
						case Constant.MESSAGE_TYPE_EXP301:
							//if("DXPENT0000021121".equals(sendId)){
								//expSendMessage = new DExp301Message().getMessage(expBaseEntity);
							//}else{
								//expSendMessage = new Exp301Message().getMessage(expBaseEntity);
							//}
							
							expSendMessage = new DExp301Message().getMessage(expBaseEntity);
							break;
							
						case Constant.MESSAGE_TYPE_EXP307:
							expSendMessage = new Exp307Message().getMessage(expBaseEntity);
							break;
							
						case Constant.MESSAGE_TYPE_EXP311:
							//if("DXPENT0000021121".equals(sendId)){
								//expSendMessage = new DExp311Message().getMessage(expBaseEntity);
							//}else{
								//expSendMessage = new Exp311Message().getMessage(expBaseEntity);
							//}
							expSendMessage = new DExp311Message().getMessage(expBaseEntity);
							break;
							
						default:
							logger.info("快件下发任务，不支持的业务类型【"+ messageType +"】");
							expBaseEntity.setStatus(ResponseEnum.UN_SUPPORT_BUSI_RELATION);
							continue;
						}
						System.out.println("快件下发内容【"+ expSendMessage +"】");
						
						if(!StringUtils.isEmpty(expSendMessage)){
							String validMessage = null;
							boolean isSend = true;
//							if(isValid && !StringUtils.isEmpty(validMessage = CommonUtils.getXmlCheckMessage(expSendMessage.getBytes(), messageType))){
//								expBaseEntity.setStatus(ResponseEnum.VALID_FAILD);
//								logger.info("快件下发，报文校验出现问题，详情【"+ validMessage +"】");
//							}
							
							if(isSend){
								String fileAbsPath = FileUtils.write2File(sendFilePath, expSendMessage, messageType);
								expBaseEntity.getYltBusSend().setSendcontent(expSendMessage);
								expBaseEntity.getYltBusSend().setFilepath(fileAbsPath);
							}
							
						}else{
							expBaseEntity.setStatus(ResponseEnum.EMPTY_SEND_MESSAGE);
						}
						
						
						

						
					} catch (Exception e) {
						logger.error("快件下发，出现异常，详情【"+ e.getMessage() +"】", e);
						expBaseEntity.setStatus(ResponseEnum.UN_SUPPORT_BUSI_RELATION);
					}
				}
				//数据发送完成  更新业务数据状态    
				tradeExpSendService.updateExpSendRecode(expBaseEntity);
				
				expSendMessage = null;
			}
			
		}else{
			logger.info(CommonUtils.getOutputLine("新快件发送任务，本次没有待处理的数据..."));
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
