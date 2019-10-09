package com.tradeo.exp.common.xml.mft.send;

import java.util.List;

/**
 * 舱单 发送报文实体对象
 * @author duwenjie
 *
 */
public class Manifest {
	
	private ManifestMAWB mawb;
	
	private List<ManifestHAWB> hawbList;

	public ManifestMAWB getMawb() {
		return mawb;
	}

	public void setMawb(ManifestMAWB mawb) {
		this.mawb = mawb;
	}

	public List<ManifestHAWB> getHawbList() {
		return hawbList;
	}

	public void setHawbList(List<ManifestHAWB> hawbList) {
		this.hawbList = hawbList;
	}

}
