package cn.entity;

import java.util.Date;

public class Recede {
	private int id;
	private int itemid;
	private int count;
	private float price;
	private float totalprice;
	private Date time;
	private int transactor;
	private int shopid;

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getTransactor() {
		return transactor;
	}

	public void setTransactor(int transactor) {
		this.transactor = transactor;
	}

	public Recede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recede(int id, int itemid, int count, float price, float totalprice, Date time, int transactor, int shopid) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.count = count;
		this.price = price;
		this.totalprice = totalprice;
		this.time = time;
		this.transactor = transactor;
		this.shopid = shopid;
	}

}
