package com.tradeo.exp.service;

import java.util.List;

import com.tradeo.exp.common.xml.exp.send.Data;
import com.tradeo.exp.common.xml.exp.send.ExpBaseEntity;

public interface TradeExpSendService {
	
	/**
	 * 读取 报关单 未发送的数据
	 * @param index	发送 报关单数据任务下标
	 * @param total	发送 报关单数据任务总个数
	 * @param count	每次读取的数据
	 * @param sendId 发送单位
	 * @return
	 */
	public List<ExpBaseEntity<Data>> selectExpUnsendRecodeList(int index,int total,int count,String sendId);
	
	
	public void updateExpSendRecodeList(List<ExpBaseEntity<Data>> expEntity);

	/**
	 * 更新下发表数据状态
	 * @param expBaseEntity
	 */
	public void updateExpSendRecode(ExpBaseEntity<Data> expBaseEntity);

}
