package cn.entity;

import java.util.Date;

public class Itemdata {
	private int id;
	private int typeid;
	private String name;
	private int validity;
	private int supplierid;
	private String info;
	private float money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public Itemdata(int id, int typeid, String name, int validity,
			int supplierid, String info, float money) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.name = name;
		this.validity = validity;
		this.supplierid = supplierid;
		this.info = info;
		this.money = money;
	}
	public Itemdata() {
		super();
		// TODO Auto-generated constructor stub
	}
}
