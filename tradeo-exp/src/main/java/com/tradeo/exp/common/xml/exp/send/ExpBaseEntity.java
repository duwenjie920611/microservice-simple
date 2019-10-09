package com.tradeo.exp.common.xml.exp.send;

import com.tradeo.exp.bo.YltBusSend;
import com.tradeo.exp.common.eum.ResponseEnum;

public class ExpBaseEntity<T extends Data> {
	
	//信封节点
	private EnvelopInfo envelopInfo;
	
	//具体实体节点
	private T data;
	
	//下发表 
	private YltBusSend yltBusSend;
	
	
	private ResponseEnum status = ResponseEnum.SUCCESS;

	public EnvelopInfo getEnvelopInfo() {
		return envelopInfo;
	}

	public void setEnvelopInfo(EnvelopInfo envelopInfo) {
		this.envelopInfo = envelopInfo;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public YltBusSend getYltBusSend() {
		return yltBusSend;
	}

	public void setYltBusSend(YltBusSend yltBusSend) {
		this.yltBusSend = yltBusSend;
	}

	public ResponseEnum getStatus() {
		return status;
	}

	public void setStatus(ResponseEnum status) {
		this.status = status;
	}
	
}
