package cn.entity;

import java.util.Date;

public class RecordSell {
	private int id;
	private int itemid;
	private int count;
	private float price;
	private float totalprice;
	private Date time; 
	private int transactor; 
	private int shopid; 
	private float profit;    
	private String iname;
	private String tname;
	private String sname;
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
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public RecordSell(int id, int itemid, int count, float price,
			float totalprice, Date time, int transactor, int shopid,
			float profit, String iname, String tname, String sname) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.count = count;
		this.price = price;
		this.totalprice = totalprice;
		this.time = time;
		this.transactor = transactor;
		this.shopid = shopid;
		this.profit = profit;
		this.iname = iname;
		this.tname = tname;
		this.sname = sname;
	}
	public RecordSell() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
