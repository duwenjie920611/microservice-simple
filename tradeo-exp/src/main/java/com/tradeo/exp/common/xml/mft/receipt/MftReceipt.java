package com.tradeo.exp.common.xml.mft.receipt;

import java.util.List;

/**
 * 舱单回执  实体
 * @author duwenjie
 *
 */
public class MftReceipt {
	
	private MftMAWBResult mftMAWBResult ;
	
	private List<MftHAWBResult> mftHAWBResultList;

	public MftMAWBResult getMftMAWBResult() {
		return mftMAWBResult;
	}

	public void setMftMAWBResult(MftMAWBResult mftMAWBResult) {
		this.mftMAWBResult = mftMAWBResult;
	}

	public List<MftHAWBResult> getMftHAWBResultList() {
		return mftHAWBResultList;
	}

	public void setMftHAWBResultList(List<MftHAWBResult> mftHAWBResultList) {
		this.mftHAWBResultList = mftHAWBResultList;
	}
	
}
