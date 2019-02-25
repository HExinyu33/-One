package cn.entity;

import java.util.Date;

public class ReqItems {
	private int id;
	private int itemid;
	private int reqid;
	private Date validity;
	private int count;
	private float money;
	private int stoid;
	public int getStoid() {
		return stoid;
	}

	public void setStoid(int stoid) {
		this.stoid = stoid;
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

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
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

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public ReqItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReqItems(int id, int itemid, int reqid, Date validity, int count, float money) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.reqid = reqid;
		this.validity = validity;
		this.count = count;
		this.money = money;
	}

	public ReqItems(int id, int itemid, int reqid, Date validity, int count, float money, int stoid) {
		super();
		this.id = id;
		this.itemid = itemid;
		this.reqid = reqid;
		this.validity = validity;
		this.count = count;
		this.money = money;
		this.stoid = stoid;
	}
}
