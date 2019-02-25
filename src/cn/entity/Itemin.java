package cn.entity;

import java.util.Date;

public class Itemin {
	private int id;
	private int itemid;
	private int storageid;
	private int count;
	private Date time;
	private float price;
	private float totalprice;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	public Itemin(int id, int itemid, int storageid, int count, Date time,
			float price, float totalprice) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.storageid = storageid;
		this.count = count;
		this.time = time;
		this.price = price;
		this.totalprice = totalprice;
	}
	public Itemin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
