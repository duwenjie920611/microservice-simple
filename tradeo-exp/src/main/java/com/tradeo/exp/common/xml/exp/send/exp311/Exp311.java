package com.tradeo.exp.common.xml.exp.send.exp311;

import java.util.List;

import com.tradeo.exp.common.xml.exp.send.Data;

public class Exp311 extends Data{

    private ExpMftHead expMftHead;
    
    private List<ExpMft> expMftList;
	
    public ExpMftHead getExpMftHead() {
		return expMftHead;
	}
	public void setExpMftHead(ExpMftHead expMftHead) {
		this.expMftHead = expMftHead;
	}
	public List<ExpMft> getExpMftList() {
		return expMftList;
	}
	public void setExpMftList(List<ExpMft> expMftList) {
		this.expMftList = expMftList;
	}
    
    


}
