package com.tradeo.exp.common.xml.exp.send.exp301;

import java.util.List;

import com.tradeo.exp.common.xml.exp.send.Data;

public class Exp301 extends Data{
	
	private EntryHead entryHead;
	
	private List<Entry> EntryList;
	
	private List<EntryDocu> entryDocuList;

	public EntryHead getEntryHead() {
		return entryHead;
	}

	public void setEntryHead(EntryHead entryHead) {
		this.entryHead = entryHead;
	}

	public List<Entry> getEntryList() {
		return EntryList;
	}

	public void setEntryList(List<Entry> entryList) {
		EntryList = entryList;
	}

	public List<EntryDocu> getEntryDocuList() {
		return entryDocuList;
	}

	public void setEntryDocuList(List<EntryDocu> entryDocuList) {
		this.entryDocuList = entryDocuList;
	}

}
