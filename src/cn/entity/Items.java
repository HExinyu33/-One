package cn.entity;

import java.util.Date;

public class Items {
	private int id;
	private int itemid;
	private int storageid;
	private Date validity;
	private int count;
	private String itemdatename;
	private String storagename;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

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

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int id, int itemid, int storageid, Date validity, int count, float price) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.storageid = storageid;
		this.validity = validity;
		this.count = count;
		this.price = price;
	}

	public String getItemdatename() {
		return itemdatename;
	}

	public void setItemdatename(String itemdatename) {
		this.itemdatename = itemdatename;
	}

	public String getStoragename() {
		return storagename;
	}

	public void setStoragename(String storagename) {
		this.storagename = storagename;
	}

	public Items(int id, int itemid, int storageid, Date validity, int count, String itemdatename, String storagename, float price) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.storageid = storageid;
		this.validity = validity;
		this.count = count;
		this.itemdatename = itemdatename;
		this.storagename = storagename;
		this.price = price;
	}

	public Items(int itemid, int storageid, Date validity, int count, float price) {
		super();
		this.itemid = itemid;
		this.storageid = storageid;
		this.validity = validity;
		this.count = count;
		this.price = price;
	}

}
