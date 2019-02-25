package cn.entity;

import java.util.Date;

public class Record {
	private int id;
	private int itemid;
	private int count;
	private float outprice;
	private float price;
	private float totalprice;
	private Date time;
	private Date validity;
	private int transactor;
	private int shopid;
	private float profit;
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
	public float getOutprice() {
		return outprice;
	}
	public void setOutprice(float outprice) {
		this.outprice = outprice;
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
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public int getTransactor() {
		return transactor;
	}
	public void setTransactor(int transactor) {
		this.transactor = transactor;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public Record(int id, int itemid, int count, float outprice, float price,
			float totalprice, Date time, Date validity, int transactor,
			int shopid, float profit) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.count = count;
		this.outprice = outprice;
		this.price = price;
		this.totalprice = totalprice;
		this.time = time;
		this.validity = validity;
		this.transactor = transactor;
		this.shopid = shopid;
		this.profit = profit;
	}
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}



}
