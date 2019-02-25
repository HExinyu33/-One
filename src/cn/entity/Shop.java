package cn.entity;

public class Shop {
	private int id;
	private String name;
	private String address;
	private int manager;
	private String uname;
	private int storid;
	private String sname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getStorid() {
		return storid;
	}

	public void setStorid(int storid) {
		this.storid = storid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Shop(int id, String name, String address, int manager, String uname, int storid, String sname) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.uname = uname;
		this.storid = storid;
		this.sname = sname;
	}

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int id, String name, String address, int manager, int storid) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.storid = storid;
	}

}
