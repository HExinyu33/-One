package cn.entity;

import java.util.Date;

public class ItemsISDT {
	private int id;
	private int itemid;// 商品
	private String itemName;
	private int storageid;// 仓库
	private String storName;
	private Date validity;
	private int count;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getStorageid() {
		return storageid;
	}

	public void setStorageid(int storageid) {
		this.storageid = storageid;
	}

	public String getStorName() {
		return storName;
	}

	public void setStorName(String storName) {
		this.storName = storName;
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

	public ItemsISDT(int id, int itemid, String itemName, int storageid, String storName, Date validity, int count, float price) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.itemName = itemName;
		this.storageid = storageid;
		this.storName = storName;
		this.validity = validity;
		this.count = count;
		this.price = price;
	}

	public ItemsISDT(String itemName, int count, float price) {
		super();
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.count = count;
		this.price = price;
	}
	public ItemsISDT(String itemName,String storName, Date validity, int count) {
		super();
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.storName = storName;
		this.count = count;
		this.validity = validity;
	}
}
