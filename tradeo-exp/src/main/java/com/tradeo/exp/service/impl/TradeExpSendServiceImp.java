package com.tradeo.exp.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;
import com.tradeo.exp.bo.YltBusAgreement;
import com.tradeo.exp.bo.YltBusDeclareResponse;
import com.tradeo.exp.bo.YltBusDeclareResponseWithBLOBs;
import com.tradeo.exp.bo.YltBusDeclarebill;
import com.tradeo.exp.bo.YltBusDeclaregoods;
import com.tradeo.exp.bo.YltBusSend;
import com.tradeo.exp.bo.YltBusShipbill;
import com.tradeo.exp.bo.YltBusShipsubbill;
import com.tradeo.exp.bo.YltBusVoucher;
import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.eum.ResponseEnum;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.ExpBeanConver;
import com.tradeo.exp.common.xml.exp.send.Data;
import com.tradeo.exp.common.xml.exp.send.EXP307;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;
import com.tradeo.exp.common.xml.exp.send.exp301.Entry;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryDocu;
import com.tradeo.exp.common.xml.exp.send.exp301.EntryHead;
import com.tradeo.exp.common.xml.exp.send.exp301.Exp301;
import com.tradeo.exp.common.xml.exp.send.exp311.Exp311;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMft;
import com.tradeo.exp.common.xml.exp.send.exp311.ExpMftHead;
import com.tradeo.exp.dao.YltBusAgreementDao;
import com.tradeo.exp.dao.YltBusDeclareResponseDao;
import com.tradeo.exp.dao.YltBusDeclarebillDao;
import com.tradeo.exp.dao.YltBusDeclaregoodsDao;
import com.tradeo.exp.dao.YltBusSendDao;
import com.tradeo.exp.dao.YltBusShipbillDao;
import com.tradeo.exp.dao.YltBusShipsubbillDao;
import com.tradeo.exp.dao.YltBusVoucherDao;
import com.tradeo.exp.service.TradeExpSendService;

@Service
public class TradeExpSendServiceImp implements TradeExpSendService{
	
	//logger日志
	private  Logger logger = LoggerFactory.getLogger(TradeExpSendServiceImp.class);
	
	//申报单  表头
	@Autowired
	private YltBusDeclarebillDao yltBusDeclarebillDao;
	
	//表体
	@Autowired
	private YltBusDeclaregoodsDao yltBusDeclaregoodsDao;
	
	//随附单据
	@Autowired
	private YltBusVoucherDao yltBusVoucherDao;
	
	//舱单 
	@Autowired
	private YltBusShipbillDao yltBusShipbillDao;
	
	//分运单
	@Autowired
	private YltBusShipsubbillDao yltBusShipsubbillDao;
	
	//委托申请
	@Autowired
	private YltBusAgreementDao yltBusAgreementDao;
	
	//查询下发表
	@Autowired
	private YltBusSendDao yltBusSendDao;
	
	//回执表
	@Autowired
	private YltBusDeclareResponseDao yltBusDeclareResponseDao;

	@Override
	public List<ExpBaseEntity<Data>> selectExpUnsendRecodeList(int index, int total, int count,String sendId) {
		List<ExpBaseEntity<Data>> expEntityList = Lists.newArrayList();
		//查询待处理的数据
		List<YltBusSend> YltBusSendList = yltBusSendDao.selectYltUnpushList(index, total, count,sendId);
		if(!CommonUtils.isEmptyCollection(YltBusSendList)){
			for (YltBusSend yltBusSend : YltBusSendList) {
				
				ExpBaseEntity<Data> expEntity = new ExpBaseEntity<>();
				int busiType = yltBusSend.getBusitype();//业务类型
				Data data = null;//待下发的数据实体
				String messageType = null;
				
				switch (busiType) {
				//舱单申报 总单 + 分运舱单
				case 0:
				//舱单申报 分运单 
				case 1:
					//总舱单
					YltBusShipbill yltBusShipbill = yltBusShipbillDao.selectByPrimaryKey(yltBusSend.getBusiid().intValue());
					if(!CommonUtils.isEmptyObj(yltBusShipbill)){
						Exp311 exp311 = new Exp311();
						ExpMftHead expMftHead = ExpBeanConver.yltBusShipbill2Exp311ExpMftHead(yltBusShipbill);
						exp311.setExpMftHead(expMftHead);
											
						//舱单 分运单
						YltBusShipsubbill shipSubBillExample = new YltBusShipsubbill();
						shipSubBillExample.setBillno(yltBusSend.getBillno());
						List<YltBusShipsubbill> shipSubBillList = yltBusShipsubbillDao.selectByExampleSelective(shipSubBillExample);
						List<ExpMft> expMftList = ExpBeanConver.yltBusShipSubbillList2Exp311ExpMftList(shipSubBillList);
						exp311.setExpMftList(expMftList);
						
						data = exp311;
						messageType = Constant.MESSAGE_TYPE_EXP311;
					}

					break;
					
				case 2:
					// 查询报关单 表头数据
					YltBusDeclarebill yltBusDeclarebill = yltBusDeclarebillDao.selectByPrimaryKey(yltBusSend.getBusiid().intValue());
					if(!CommonUtils.isEmptyObj(yltBusDeclarebill)){
						Exp301 exp301 = new Exp301();
						EntryHead exp301EntryHead = ExpBeanConver.ytlBusDeclarebill2Exp301EntryHead(yltBusDeclarebill);
						exp301.setEntryHead(exp301EntryHead);
						
						//查询报关单 表体数据
						YltBusDeclaregoods declateGoodExample = new YltBusDeclaregoods();
						declateGoodExample.setLecenseno(yltBusDeclarebill.getLecenseno());
						declateGoodExample.setBillno(yltBusDeclarebill.getBillno());
						declateGoodExample.setSubbillno(yltBusDeclarebill.getSubbillno());
						List<YltBusDeclaregoods> declareGoodList = yltBusDeclaregoodsDao.selectByExampleSelective(declateGoodExample);
						List<Entry> exp301EntryList = ExpBeanConver.yltBusDeclaregoods2EntryList(declareGoodList);
						exp301.setEntryList(exp301EntryList);
						
						// 查询报关单随附单据数据
						YltBusVoucher declaredocExample = new YltBusVoucher(); 
						declaredocExample.setLecenseno(yltBusDeclarebill.getLecenseno());
						declaredocExample.setBillno(yltBusDeclarebill.getBillno());
						declaredocExample.setSubbillno(yltBusDeclarebill.getSubbillno());
						List<YltBusVoucher> declareDocList = yltBusVoucherDao.selectByExampleSelective(declaredocExample);
						List<EntryDocu> exp301EntryDocList = ExpBeanConver.yltBusDeclaredocs2EntryDocList(declareDocList);
						exp301.setEntryDocuList(exp301EntryDocList);
						
						data = exp301;
						messageType = Constant.MESSAGE_TYPE_EXP301;
					}

					break;
					
				case 3:
					YltBusAgreement yltBusAgreement = yltBusAgreementDao.selectByPrimaryKey(yltBusSend.getBusiid());
					if(!CommonUtils.isEmptyObj(yltBusAgreement)){
						EXP307 exp307 = ExpBeanConver.yltBusAgreement2Exp307(yltBusAgreement);
						
						data = exp307;
						messageType = Constant.MESSAGE_TYPE_EXP307;
					}
					
					break;
				}

				expEntity.setYltBusSend(yltBusSend);
				if(CommonUtils.isEmptyObj(data)){
					expEntity.setStatus(ResponseEnum.UN_SUPPORT_BUSI_RELATION);
				}else{
					//信封节点
					EnvelopInfo envelopInfo = ExpBeanConver.getEnvelop(yltBusSend.getSendid(), messageType);
					expEntity.setEnvelopInfo(envelopInfo);
					expEntity.setData(data);
					yltBusSend.setMessageid(envelopInfo.getMessageId());
				}
				
				expEntityList.add(expEntity);
			}
		}else{
			logger.info(CommonUtils.getOutputLine("本次未读取到下发数据"));
		}
		
		return expEntityList;
	}


	@Override
	public void updateExpSendRecodeList(List<ExpBaseEntity<Data>> expEntity) {
		if(!CommonUtils.isEmptyCollection(expEntity)){
			for (ExpBaseEntity<Data> expBaseEntity : expEntity) {
				this.updateExpSendRecode(expBaseEntity);
			}
		}
	}


	@Override
	public void updateExpSendRecode(ExpBaseEntity<Data> expBaseEntity) {
		YltBusSend yltBusSend = expBaseEntity.getYltBusSend();
		int busiType = yltBusSend.getBusitype();
		String status = expBaseEntity.getStatus().getCode().equals(ResponseEnum.SUCCESS.getCode()) ? "1" : "-1";
		
		Date nowDate = new Date();
		switch (busiType) {
		//舱单 
		case 0:
		case 1:
			//Status状态是1 标识 数据下发成功 2 则下发失败
			//更新数据状态
			YltBusShipbill shipBillExample = new YltBusShipbill();
			shipBillExample.setBillstatus(status);
			shipBillExample.setBillid(yltBusSend.getBusiid().intValue());
			shipBillExample.setLastupdatetime(nowDate);
			yltBusShipbillDao.updateByPrimaryKeySelective(shipBillExample);
			logger.info(CommonUtils.getOutputLine("修改舱单总运单数据状态【"+ status +"】,舱单表主键【"+ yltBusSend.getBusiid() +"】"));
			
			//修改分运单数据状态
			YltBusShipsubbill example = new YltBusShipsubbill();
			example.setBillno(yltBusSend.getBillno());
			YltBusShipsubbill update  = new YltBusShipsubbill();
			update.setSubbillstatus(status);
			update.setLastupdatetime(nowDate);
			int influentCount = yltBusShipsubbillDao.updateByExampleSelective(example,update);
			logger.info(CommonUtils.getOutputLine("修改舱单分运单数据状态【"+ status +"】,billno【"+ yltBusSend.getBillno()+"】,受影响行数【"+ (influentCount) +"】"));
			break;
			
		//报关单	
		case 2:
			//修改报关单状态
			YltBusDeclarebill declarebillExample = new YltBusDeclarebill();
			declarebillExample.setdStatus(status);
			declarebillExample.setDeclareid(yltBusSend.getBusiid().intValue());
			yltBusDeclarebillDao.updateByPrimaryKeySelective(declarebillExample);
			logger.info(CommonUtils.getOutputLine("修改报关单单数据状态【"+ status +"】,报关单表主键【"+ yltBusSend.getBusiid() +"】"));
			break;
		
		//委托申请	
		case 3:
			YltBusAgreement agreement = new YltBusAgreement();
			agreement.setStatus(status);
			agreement.setLastupdatetime(nowDate);
			agreement.setAgreementid(yltBusSend.getBusiid());
			yltBusAgreementDao.updateByPrimaryKeySelective(agreement);
			logger.info(CommonUtils.getOutputLine("修改委托申报单数据状态【"+ status +"】,报关单表主键【"+ yltBusSend.getBusiid() +"】"));
			
			break;
		}
		
		long sendFlowNum = yltBusSend.getFlowno();
		
		//下发数据 移动到 历史表
		yltBusSend.setUpdatetime(nowDate);
		yltBusSend.setStatus(expBaseEntity.getStatus().getCode().equals(ResponseEnum.SUCCESS.getCode()) ? 1 :2);
		yltBusSend.setFailreason(expBaseEntity.getStatus().getMsg());
		yltBusSend.setFlowno(null);//自增长 会出现主键重新从1开始，造成主键冲突的问题
		yltBusSendDao.insertHisSelective(yltBusSend);
		logger.info(CommonUtils.getOutputLine("下发数据移动到历史表，主键【"+ sendFlowNum +"】，业务主键【"+ yltBusSend.getBusiid() +"】"));
		
		//删除下发数据
		yltBusSendDao.deleteByPrimaryKey(sendFlowNum);
		logger.info(CommonUtils.getOutputLine("删除下发数据，主键【"+ sendFlowNum +"】"));
		
		//添加数据状态数据
		insertYltBusDeclareRecode(yltBusSend.getLecenseno(), yltBusSend.getBillno(), yltBusSend.getSubbillno(), 
				busiType, status, expBaseEntity.getStatus().getMsg(),yltBusSend.getBusiid(),null);
	}
	
	/**
	 * 添加	申报回执	数据
	 * @param lecenseno		授权号
	 * @param billno		总运单号
	 * @param subbillno		扥运单号
	 * @param busiType		业务类型
	 * @param respStatus	数据状态
	 * @param rmk			回执描述信息
	 * @param busiId		业务主键
	 * @param responseMessage 回执原始报文
	 * @return
	 */
	private boolean insertYltBusDeclareRecode(Integer lecenseno,String billno,String subbillno,int busiType,String respStatus,String rmk,long busiId,String responseMessage){
		YltBusDeclareResponseWithBLOBs yltBusDeclareReponse = new YltBusDeclareResponseWithBLOBs();
		Date date = new Date();
		yltBusDeclareReponse.setLecenseno(lecenseno.longValue());
		yltBusDeclareReponse.setBusiid(busiId);
		yltBusDeclareReponse.setBillno(billno);
		yltBusDeclareReponse.setSubbillno(subbillno);
		yltBusDeclareReponse.setBustype(busiType);
		yltBusDeclareReponse.setDeclaredate(date);
		yltBusDeclareReponse.setResponsedate(date);
		yltBusDeclareReponse.setRespstatus(respStatus);
		yltBusDeclareReponse.setRmk(rmk);
		yltBusDeclareReponse.setResponseContent(responseMessage);
		int resutlt = yltBusDeclareResponseDao.insertSelective(yltBusDeclareReponse);
		logger.info(CommonUtils.getOutputLine("添加业务数据状态,busiId【"+ busiId +"】,busiType【"+ busiType +"】,respStatus【"+respStatus+"】,result【"+ resutlt +"】"));
		return true;
	}




}
