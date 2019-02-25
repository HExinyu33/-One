package cn.entity;

import java.util.Date;

public class Itemout {
	private int id;
	private int itemid;
	private int storageid;
	private int count;
	private Date TIME;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getStorageid() {
		return storageid;
	}
	public void setStorageid(int storageid) {
		this.storageid = storageid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getTIME() {
		return TIME;
	}
	public void setTIME(Date tIME) {
		TIME = tIME;
	}
	public Itemout(int id, int itemid, int storageid, int count, Date tIME) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.storageid = storageid;
		this.count = count;
		TIME = tIME;
	}
	public Itemout() {
		super();
		// TODO Auto-generated constructor stub
	}
}
