package com.tradeo.exp.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tradeo.exp.bo.YltBusAgreement;
import com.tradeo.exp.bo.YltBusDeclareResponse;
import com.tradeo.exp.bo.YltBusDeclareResponseWithBLOBs;
import com.tradeo.exp.bo.YltBusDeclarebill;
import com.tradeo.exp.bo.YltBusDeclaregoods;
import com.tradeo.exp.bo.YltBusDuty;
import com.tradeo.exp.bo.YltBusDutyEntry;
import com.tradeo.exp.bo.YltBusDutyHead;
import com.tradeo.exp.bo.YltBusShipbill;
import com.tradeo.exp.bo.YltBusShipsubbill;
import com.tradeo.exp.bo.YltBusTax;
import com.tradeo.exp.bo.YltBusVoucher;
import com.tradeo.exp.common.eum.Constant;
import com.tradeo.exp.common.message.EXP302.EXP302;
import com.tradeo.exp.common.message.EXP304.EXP304;
import com.tradeo.exp.common.message.EXP312.Package.DataInfo.SignedData.Data.EXP312;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.utils.ExpBeanConver;
import com.tradeo.exp.common.xml.exp.receipt.ExpReceipt;
import com.tradeo.exp.common.xml.exp.send.EnvelopInfo;
import com.tradeo.exp.dao.YltBusAgreementDao;
import com.tradeo.exp.dao.YltBusDeclareResponseDao;
import com.tradeo.exp.dao.YltBusDeclarebillDao;
import com.tradeo.exp.dao.YltBusDeclaregoodsDao;
import com.tradeo.exp.dao.YltBusDutyDao;
import com.tradeo.exp.dao.YltBusDutyEntryDao;
import com.tradeo.exp.dao.YltBusDutyHeadDao;
import com.tradeo.exp.dao.YltBusShipbillDao;
import com.tradeo.exp.dao.YltBusShipsubbillDao;
import com.tradeo.exp.dao.YltBusTaxDao;
import com.tradeo.exp.dao.YltBusVoucherDao;
import com.tradeo.exp.service.TradeExpReceiptService;

@Service
public class TradeExpReceiptServiceImp implements TradeExpReceiptService {
	
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
	
	//汇总纳税清单
	@Autowired
	private YltBusDutyDao yltBusDutyDao;
	
	//汇总征税清单 表头
	@Autowired
	private YltBusDutyHeadDao yltBusDutyHeadDao;
	
	//汇总征税 清单 表体
	@Autowired
	private YltBusDutyEntryDao yltBusDutyEntryDao;
	
	//报关单 税单信息
	@Autowired
	private YltBusTaxDao yltBusTaxDao;
	
	
	//回执表
	@Autowired
	private YltBusDeclareResponseDao yltBusDeclareResponseDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public void expReceiptCoreHandler(ExpReceipt expReceipt) {
		EnvelopInfo envelopInfo = expReceipt.getEnvelopInfo();
		String messageType = envelopInfo.getMessageType();
		switch (messageType) {
		//报关单回执
		case Constant.MESSAGE_TYPE_EXP302:
			dealExp302DeclareReceipt(expReceipt);
			break;
			
		//报关单 修改同步报文 
		case Constant.MESSAGE_TYPE_EXP304:
			dealExp304DeclareUpdReceipt(expReceipt);
			break;
			
			//汇总纳税清单
		case Constant.MESSAGE_TYPE_EXP306:
			dealExp306DutyReceipt(expReceipt);
			break;			
		
			//委托申报 回执
		case Constant.MESSAGE_TYPE_EXP308:
			dealExp308AgreementReceipt(expReceipt);
			break;
			
			//报关单税费信息
		case Constant.MESSAGE_TYPE_EXP310:
			dealExp310TaxReceipt(expReceipt);
			break;			
			
			//舱单回执
		case Constant.MESSAGE_TYPE_EXP312:
			dealExp312ShipReceipt(expReceipt);
			break;
		}
		
	}
	
	
	/**********************************************************私有函数 *************************************************************/

	/**
	 * 处理报关单申报回执数据
	 * @param expReceipt  回执报文
	 */
	private void dealExp302DeclareReceipt(ExpReceipt expReceipt) {
		
		EXP302 exp302 = expReceipt.getExp302();
		com.tradeo.exp.common.message.EXP302.EXP302.EntryHead entryHeadExp302 = exp302.getEntryHead();
		entryHeadExp302.getBillNo();
		
		//判断条件
		YltBusDeclarebill declareBillSelect = new YltBusDeclarebill();
		declareBillSelect.setBillno(entryHeadExp302.getBillNo());
		declareBillSelect.setSubbillno(entryHeadExp302.getAssBillNo());
		declareBillSelect.setOptype(entryHeadExp302.getOpType());
		declareBillSelect.setiEFlag(entryHeadExp302.getIEFlag());
		List<YltBusDeclarebill> yltBusDeclarebillList = yltBusDeclarebillDao.selectByExampleSelective(declareBillSelect);
		if(CommonUtils.isEmptyCollection(yltBusDeclarebillList)){
			logger.info(CommonUtils.getOutputLine("快件回执，报关单回执exp302,根据总运单号【"+ entryHeadExp302.getBillNo() +"】，分运单号【"+ entryHeadExp302.getAssBillNo() 
			+"】，操作类型【"+entryHeadExp302.getOpType()+"】，进出口标志【"+entryHeadExp302.getIEFlag()+"】未关联到业务数据。"));
			return ;
		}
		
		YltBusDeclarebill declarebill = yltBusDeclarebillList.get(0);
	
		//修改值
		YltBusDeclarebill declareBillValue = new YltBusDeclarebill();
		declareBillValue.setPreEntryId(entryHeadExp302.getPreEntryId());
		declareBillValue.setEntryId(entryHeadExp302.getEntryId());
		declareBillValue.setDeclareid(declarebill.getDeclareid());
		declareBillValue.setdStatus(entryHeadExp302.getOpResult());
		declareBillValue.setOptime(CommonUtils.formatStringtToDateyMdHmsSSS(entryHeadExp302.getOpTime()));
		
		//修改条件
		YltBusDeclarebill declareBillExample = new YltBusDeclarebill();
		declareBillExample.setDeclareid(declarebill.getDeclareid());
		declareBillExample.setOptime(CommonUtils.formatStringtToDateyMdHmsSSS(entryHeadExp302.getOpTime()));
		int influentCount = yltBusDeclarebillDao.updateByExampleSelectiveCompare(declareBillValue,declareBillExample);
		logger.info(CommonUtils.getOutputLine("快件回执，报关单回执exp302,更新数据状态,报关单表头主键【"+ declarebill.getDeclareid() +"】,状态【"+ (entryHeadExp302.getOpResult()) +"】，更新结果【"+(influentCount > 0)+"】"));
		
		//插入回执数据
		insertYltBusDeclareRecode(declarebill.getLecenseno().intValue(), entryHeadExp302.getBillNo(), entryHeadExp302.getAssBillNo(), 2, 
				entryHeadExp302.getOpResult(), entryHeadExp302.getNotes(),declarebill.getDeclareid(),expReceipt.getOrginalMessage());
		
	}
	

	/**
	 * 处理 报关单 修改同步报文 数据
	 * @param expReceipt 回执实体
	 */
	private void dealExp304DeclareUpdReceipt(ExpReceipt expReceipt) {
		
		EXP304 exp04 = expReceipt.getExp304();
		com.tradeo.exp.common.message.EXP304.EXP304.EntryHead entryHead = exp04.getEntryHead();
		List<com.tradeo.exp.common.message.EXP304.EXP304.EntryList> entryList = exp04.getEntryList();
		List<com.tradeo.exp.common.message.EXP304.EXP304.EntryDocu> entryDocuLIst = exp04.getEntryDocu();
		
		YltBusDeclarebill yltBusDeclarebill =  ExpBeanConver.exp304EntryHead2YltBusDeclarebill(entryHead);
		if(!CommonUtils.isEmptyObj(yltBusDeclarebill)){
			String billNo = yltBusDeclarebill.getBillno();
			String subBillNo = yltBusDeclarebill.getSubbillno();
			
			YltBusDeclarebill yltBusDeclarebillSelect = new YltBusDeclarebill();
			yltBusDeclarebillSelect.setBillno(billNo);
			yltBusDeclarebillSelect.setSubbillno(subBillNo);
			
			List<YltBusDeclarebill> yltBusDeclarebillExp304List = yltBusDeclarebillDao.selectByExampleSelective(yltBusDeclarebillSelect);
			if(CommonUtils.isEmptyCollection(yltBusDeclarebillExp304List)){
				logger.info(CommonUtils.getOutputLine("快件回执，报关单修改同步报文exp304,不存在关联数据，提前返回，billNo【"+ billNo +"】,subBillNo【"+ subBillNo +"】"));
				return ;
			}
			
			yltBusDeclarebill.setDeclareid(yltBusDeclarebillExp304List.get(0).getDeclareid());
			int influentCount = yltBusDeclarebillDao.updateByPrimaryKeySelective(yltBusDeclarebill);
			logger.info(CommonUtils.getOutputLine("快件回执，报关单修改同步报文exp304,更新表头数据，billNo【"+ billNo+"】,subBillNo【"+ (subBillNo) +"】，更新结果【"+(influentCount > 0)+"】"));
			
			List<YltBusDeclaregoods> yltBusDeclaregoodsList = ExpBeanConver.exp304EntryList2YltBusDeclaregoodList(entryList);
			if(!CommonUtils.isEmptyCollection(yltBusDeclaregoodsList)){
				for (YltBusDeclaregoods yltBusDeclaregoods : yltBusDeclaregoodsList) {
					YltBusDeclaregoods declaregoodsExampe = new YltBusDeclaregoods();
					declaregoodsExampe.setBillno(billNo);
					declaregoodsExampe.setSubbillno(subBillNo);
					declaregoodsExampe.setgNo(yltBusDeclaregoods.getgNo());
					
					influentCount = yltBusDeclaregoodsDao.updateByExampleSelective(yltBusDeclaregoods, declaregoodsExampe);
					logger.info(CommonUtils.getOutputLine("快件回执，报关单修改同步报文exp304,更新表体数据，billNo【"+ billNo +"】,subBillNo【"+ subBillNo 	+"】,序号gNo【"+ declaregoodsExampe.getgNo() +"】，更新结果【"+(influentCount > 0)+"】"));
				}
			}
			
			List<YltBusVoucher> yltBusVoucherList = ExpBeanConver.exp304EntryDocuList2YltBusDeclaredocList(entryDocuLIst);
			if(!CommonUtils.isEmptyCollection(yltBusVoucherList)){
				for (YltBusVoucher yltBusVoucher : yltBusVoucherList) {
					YltBusVoucher voucherExample = new YltBusVoucher();
					voucherExample.setBillno(billNo);
					voucherExample.setSubbillno(subBillNo);
					voucherExample.setOrderNo(yltBusVoucher.getOrderNo());
					influentCount = yltBusVoucherDao.updateByExampleSelective(yltBusVoucher, voucherExample);
					logger.info(CommonUtils.getOutputLine("快件回执，报关单修改同步报文exp304,更新随附单据数据，billNo【"+ billNo +"】,subBillNo【"+ subBillNo +"】,序号gNo【"+ voucherExample.getOrderNo() +"】，更新结果【"+(influentCount > 0)+"】"));
				}
			}
			
			//修改单报文入库
			insertYltBusDeclareRecode(yltBusDeclarebill.getLecenseno().intValue(), billNo, subBillNo, 4, "-1", null, 
					yltBusDeclarebill.getDeclareid(), expReceipt.getOrginalMessage());
		}
		
	}

	/**
	 * 处理 汇总纳税清单 同步报文
	 * @param expReceipt
	 */
	private void dealExp306DutyReceipt(ExpReceipt expReceipt) {
		com.tradeo.exp.common.message.EXP306.EXP306 exp306 = expReceipt.getExp306();
		com.tradeo.exp.common.message.EXP306.EXP306.DutyFormHead dutyForm = exp306.getDutyFormHead();//清单数据
		List<com.tradeo.exp.common.message.EXP306.EXP306.DutyFormList> dutyFormLHeadist = exp306.getDutyFormList();//税单表头
		List<com.tradeo.exp.common.message.EXP306.EXP306.EntryList> dutyEntryList = exp306.getEntryList();//税单表体
		
		if(!CommonUtils.isEmptyObj(dutyForm)){
			
			Date nowDate = new Date();
			YltBusDuty yltBusDuty = ExpBeanConver.exp306DutyForm2YltBusDuty(dutyForm);
			yltBusDuty.setCreatetime(nowDate);
			yltBusDuty.setLastupdatetime(nowDate);
			yltBusDutyDao.insertSelective(yltBusDuty);
			
			logger.info(CommonUtils.getOutputLine("快件回执，纳税清单exp306,yltbusduty 表主键【"+ yltBusDuty.getDutyformid() +"】"));
			
			List<YltBusDutyHead> yltBusDutyHeadList = ExpBeanConver.exp306DutyFormHeadList2YltBusDutyHeadList(dutyFormLHeadist);
			if(!CommonUtils.isEmptyCollection(yltBusDutyHeadList)){
				for (YltBusDutyHead yltBusDutyHead : yltBusDutyHeadList) {
					yltBusDutyHead.setCreatetime(nowDate);
					yltBusDutyHead.setLastupdatetime(nowDate);
					yltBusDutyHead.setDutyformid(yltBusDuty.getDutyformid());
					yltBusDutyHeadDao.insertSelective(yltBusDutyHead);
					logger.info(CommonUtils.getOutputLine("快件回执，纳税清单exp306,yltBusDutyHead 表主键【"+ yltBusDutyHead.getDutyformheadid() +"】,yltbusduty主键【"+ yltBusDuty.getDutyformid() +"】"));
				}
			}
			
			List<YltBusDutyEntry> yltBusDutyEntryList = ExpBeanConver.exp306DutyEntryList2yltBusDutyEntryList(dutyEntryList);
			if(!CommonUtils.isEmptyCollection(yltBusDutyEntryList)){
				for (YltBusDutyEntry yltBusDutyEntry : yltBusDutyEntryList) {
					yltBusDutyEntry.setCreatetime(nowDate);
					yltBusDutyEntry.setLastupdatetime(nowDate);
					yltBusDutyEntry.setDutyformid(yltBusDuty.getDutyformid());
					yltBusDutyEntryDao.insertSelective(yltBusDutyEntry);
					logger.info(CommonUtils.getOutputLine("快件回执，纳税清单exp306,yltBusDutyEntry 表主键【"+ yltBusDutyEntry.getDutyformentryid() +"】,yltbusduty主键【"+ yltBusDuty.getDutyformid() +"】"));
				}
			}
			
//			yltBusDuty.get
			
			//将接受到的数据插入到 回执表中
			insertYltBusDeclareRecode(new Integer(yltBusDuty.getDutyformid().toString()), null, null, 5, "-1", null, yltBusDuty.getDutyformid(), expReceipt.getOrginalMessage());
		}
	}
	
	/**
	 * 报关委托协议回执报文
	 * @param expReceipt
	 */
	private void dealExp308AgreementReceipt(ExpReceipt expReceipt) {
		
		com.tradeo.exp.common.message.EXP308.EXP308 exp308 = expReceipt.getExp308();
		
		YltBusAgreement yltBusAgreementSelect  = new YltBusAgreement();
		yltBusAgreementSelect.setAgentcod(exp308.getAgentCode());
		yltBusAgreementSelect.setTradecode(exp308.getTradeCode());
		yltBusAgreementSelect.setCustomscode(exp308.getCustomsCode());
		List<YltBusAgreement> agreementList = yltBusAgreementDao.selectByExampleSelective(yltBusAgreementSelect);
		if(CommonUtils.isEmptyCollection(agreementList)){
			logger.info(CommonUtils.getOutputLine("快件回执，委托申请exp306,YltBusAgreement,条件AgentCode【"+ exp308.getAgentCode() +"】,customcode【"+ 
					exp308.getCustomsCode()+"】,TradeCode【"+ exp308.getTradeCode() +"】,未关联上业务数据，提前返回"));
			return ;
		}
		
		YltBusAgreement yltBusAgreement = agreementList.get(0);
		
		//修改条件
		YltBusAgreement agreementExample = new YltBusAgreement();
		agreementExample.setAgreementid(yltBusAgreement.getAgreementid());
		agreementExample.setOptime(CommonUtils.formatStringtToDateyMdHms(exp308.getOpTime()));
		
		//修改 值
		YltBusAgreement agreementValue= new YltBusAgreement();
		agreementValue.setBegindate(CommonUtils.formatStringtToDateyMd(exp308.getBeginDate()));
		agreementValue.setEnddate(CommonUtils.formatStringtToDateyMd(exp308.getEndDate()));
		agreementValue.setOptime(CommonUtils.formatStringtToDateyMdHms(exp308.getOpTime()));
		agreementValue.setAgentscc(exp308.getAgentScc());
		agreementValue.setTradescc(exp308.getTradeScc());
		
		int influentCount = yltBusAgreementDao.updateByExampleSelective(agreementValue,agreementExample);
		logger.info(CommonUtils.getOutputLine("快件回执，委托申请exp306,协议表主键【"+ agreementExample.getAgreementid() +"】,更新结果【"+ (influentCount > 0) +"】"));
		
		//插入回执数据
		insertYltBusDeclareRecode(yltBusAgreement.getLecenseno().intValue(),null, null, 3, 
				exp308.getOpResult(), exp308.getNotes(),yltBusAgreement.getAgreementid(),expReceipt.getOrginalMessage());
	}
	
	/**
	 * 处理 310 报关单税单同步数据
	 * @param expReceipt
	 */
	private void dealExp310TaxReceipt(ExpReceipt expReceipt) {
		com.tradeo.exp.common.message.EXP310.EXP310.EntryDuty entryDuty =  expReceipt.getExp310().getEntryDuty();
		YltBusTax yltBusTax = ExpBeanConver.exp310EntryDuty2YltBusTax(entryDuty);
		Date nowDate = new Date();
		yltBusTax.setCreatetime(nowDate);
		yltBusTax.setLastupdatetime(nowDate);
		yltBusTaxDao.insertSelective(yltBusTax);
		logger.info(CommonUtils.getOutputLine("快件回执，纳税清单exp306,yltBusTax 表主键【"+ yltBusTax.getTaxid() +"】"));
		
		//将接受到的数据插入到 回执表中
		insertYltBusDeclareRecode(new Integer(yltBusTax.getTaxid().toString()), null, null, 6, "-1", null, yltBusTax.getTaxid(), expReceipt.getOrginalMessage());
	}
	
	/**
	 * 处理312舱单回执 数据
	 * @param expReceipt
	 */
	private void dealExp312ShipReceipt(ExpReceipt expReceipt) {
		
		EXP312 exp312= expReceipt.getExp312();
		com.tradeo.exp.common.message.EXP312.Package.DataInfo.SignedData.Data.EXP312.ExpMftHead expMftHead = exp312.getExpMftHead();
		
		YltBusShipbill yltBusShipbillSelect = new YltBusShipbill();
		yltBusShipbillSelect.setBillno(expMftHead.getBillNo());
		yltBusShipbillSelect.setFlightno(expMftHead.getVoyageNo());
		List<YltBusShipbill> yltBusShipbillList = yltBusShipbillDao.selectByExampleSelective(yltBusShipbillSelect);
		
		Date nowDate = new Date();
		if(!CommonUtils.isEmptyCollection(yltBusShipbillList)){
			YltBusShipbill yltBusShipbill = yltBusShipbillList.get(0);
			//更新的字段
			YltBusShipbill yltBusShipbillUpdate = new YltBusShipbill();
			yltBusShipbillUpdate.setBillstatus(expMftHead.getRtnFlag());
			yltBusShipbillUpdate.setLastupdatetime(nowDate);
			yltBusShipbillUpdate.setBillid(yltBusShipbill.getBillid());
			yltBusShipbillDao.updateByPrimaryKeySelective(yltBusShipbillUpdate);
			logger.info(CommonUtils.getOutputLine("快件回执，舱单回执exp312.修改主业务表数据状态，总运单业务主键【"+ yltBusShipbill.getBillid() +"】,状态【"+ expMftHead.getRtnFlag() +"】"));
			//插入回执表 
			insertYltBusDeclareRecode(yltBusShipbill.getLecenseno().intValue(), expMftHead.getBillNo(), null, 1, expMftHead.getRtnFlag(), 
					expMftHead.getNotes(),yltBusShipbill.getBillid(),expReceipt.getOrginalMessage());
		}else{
			logger.info(CommonUtils.getOutputLine("快件回执，舱单回执 exp312，根据总运单号【"+ expMftHead.getBillNo() +"】,运输工具航次号【"+ expMftHead.getVoyageNo() +"】,未关联到数据"));
		}
		
		List<com.tradeo.exp.common.message.EXP312.Package.DataInfo.SignedData.Data.EXP312.ExpMftList> expMftList = exp312.getExpMftList();
		if(!CommonUtils.isEmptyCollection(expMftList)){
			
			for (com.tradeo.exp.common.message.EXP312.Package.DataInfo.SignedData.Data.EXP312.ExpMftList expMft : expMftList) {
				YltBusShipsubbill yltBusShipsubbillSelect = new YltBusShipsubbill();
				//条件
				yltBusShipsubbillSelect.setBillno(expMft.getBillNo());
				yltBusShipsubbillSelect.setSubbillno(expMft.getAssBillNo());
				List<YltBusShipsubbill> yltBusShipsubbillList = yltBusShipsubbillDao.selectByExampleSelective(yltBusShipsubbillSelect);
				if(CommonUtils.isEmptyCollection(yltBusShipsubbillList)){
					logger.info(CommonUtils.getOutputLine("快件回执，舱单回执exp312,根据总运单【"+ expMft.getBillNo() +"】，分运单【"+ expMft.getAssBillNo() +"】未关联到数据"));
					continue;
				}
				YltBusShipsubbill yltBusShipsubbill = yltBusShipsubbillList.get(0);
				
				// 修改数据 
				YltBusShipsubbill yltBusShipsubbillUpdate = new YltBusShipsubbill();
				yltBusShipsubbillUpdate.setSubbillstatus(expMft.getRtnFlag());
				yltBusShipsubbillUpdate.setLastupdatetime(nowDate);
				yltBusShipsubbillUpdate.setSubbillid(yltBusShipsubbill.getSubbillid());
				yltBusShipsubbillDao.updateByPrimaryKeySelective(yltBusShipsubbillUpdate);
				logger.info(CommonUtils.getOutputLine("快件回执，舱单回执exp312.修改主业务表数据状态，分运单业务主键【"+ yltBusShipsubbill.getSubbillid() +"】,状态【"+ expMftHead.getRtnFlag() +"】"));
				
				//插入 状态表数据
				insertYltBusDeclareRecode(yltBusShipsubbill.getLecenseno().intValue(), expMft.getBillNo(), expMft.getAssBillNo(), 1, expMft.getRtnFlag(), 
						expMft.getNotes(),yltBusShipsubbill.getSubbillid(),null);
			}
		}
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
