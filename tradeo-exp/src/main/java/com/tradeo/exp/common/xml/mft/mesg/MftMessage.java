package com.tradeo.exp.common.xml.mft.mesg;

import java.util.ArrayList;
import java.util.List;

import com.tradeo.exp.common.eum.MftEmptyEnum;
import com.tradeo.exp.common.utils.CommonUtils;
import com.tradeo.exp.common.xml.mft.send.Manifest;
import com.tradeo.exp.common.xml.mft.send.ManifestHAWB;
import com.tradeo.exp.common.xml.mft.send.ManifestMAWB;

public class MftMessage {
	
	
	public static String getMessage(Manifest mftEntity){
		StringBuilder mftSB = new StringBuilder();
		//中单子
		ManifestMAWB mawb = mftEntity.getMawb();
		
		if(!CommonUtils.isEmptyObj(mawb)){
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getApplyType(), MftEmptyEnum.EMPTY_STRING_1));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getVoyageNo(), MftEmptyEnum.EMPTY_STRING_32));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getShipId(), MftEmptyEnum.EMPTY_STRING_15));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getIeFlag(), MftEmptyEnum.EMPTY_STRING_1));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getShipNameCN(), MftEmptyEnum.EMPTY_STRING_32));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getShipNameEN(), MftEmptyEnum.EMPTY_STRING_32));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.gettGrossWt(), MftEmptyEnum.EMPTY_STRING_19));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.gettPackNo(), MftEmptyEnum.EMPTY_STRING_18));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getBillNum(), MftEmptyEnum.EMPTY_STRING_4));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getTrafMode(), MftEmptyEnum.EMPTY_STRING_1));
			mftSB.append(CommonUtils.getMftSpDealString(
					CommonUtils.formatDateToStringYMDHMS(mawb.getIeDate()), MftEmptyEnum.EMPTY_STRING_12));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getLdPort(), MftEmptyEnum.EMPTY_STRING_6));
			mftSB.append(CommonUtils.getMftSpDealString(mawb.getIePort(), MftEmptyEnum.EMPTY_STRING_4));
		}
		System.out.println(mftSB.toString().length());
		List<ManifestHAWB> manifestList = mftEntity.getHawbList();
		if(!CommonUtils.isEmptyCollection(manifestList)){
			for (ManifestHAWB manifestHAWB : manifestList) {
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getApplyType(), MftEmptyEnum.EMPTY_STRING_1));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getVoyageNo(), MftEmptyEnum.EMPTY_STRING_32));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getBillNo(), MftEmptyEnum.EMPTY_STRING_32));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getShipId(), MftEmptyEnum.EMPTY_STRING_15));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getMainGName(), MftEmptyEnum.EMPTY_STRING_50));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getPackNo(), MftEmptyEnum.EMPTY_STRING_18));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getGrossWt(), MftEmptyEnum.EMPTY_STRING_19));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getTotalValue(), MftEmptyEnum.EMPTY_STRING_12));
				mftSB.append(CommonUtils.getMftSpDealString(manifestHAWB.getCurrCode(), MftEmptyEnum.EMPTY_STRING_3));
				System.out.println(mftSB.toString().length());
			}
			
		}
		
		
		
		return mftSB.toString();
	}
	
	public static void main(String[] args) {
		Manifest manifest = new Manifest();
		
		ManifestMAWB mainManifestMAWB = new ManifestMAWB();
		manifest.setMawb(mainManifestMAWB);
		
		ManifestHAWB manifestHAWB = new ManifestHAWB();
		List<ManifestHAWB> hawbList = new ArrayList<ManifestHAWB>();
		hawbList.add(manifestHAWB);
		manifest.setHawbList(hawbList);
		
		getMessage(manifest);
	}

}
