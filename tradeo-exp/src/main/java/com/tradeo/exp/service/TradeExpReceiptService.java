package com.tradeo.exp.service;

import com.tradeo.exp.common.xml.exp.receipt.ExpReceipt;

/**
 * 快件回执业务处理类
 * @author duwenjie
 *
 */
public interface TradeExpReceiptService {
	
	/**
	 * 快件 回执处理
	 * @param expReceipt
	 */
	public void expReceiptCoreHandler(ExpReceipt expReceipt);

}
