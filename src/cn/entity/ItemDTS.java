package cn.entity;

public class ItemDTS {
	private int id;
	private int typeid;
	private String typename;
	private String name;
	private int validity;
	private int supplierid;
	private String suname;
	private String suphone;
	private String suinfo;
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
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
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
	public String getSuname() {
		return suname;
	}
	public void setSuname(String suname) {
		this.suname = suname;
	}
	public String getSuphone() {
		return suphone;
	}
	public void setSuphone(String suphone) {
		this.suphone = suphone;
	}
	public String getSuinfo() {
		return suinfo;
	}
	public void setSuinfo(String suinfo) {
		this.suinfo = suinfo;
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
	public ItemDTS(int id, int typeid, String typename, String name,
			int validity, int supplierid, String suname, String suphone,
			String suinfo, String info, float money) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.typename = typename;
		this.name = name;
		this.validity = validity;
		this.supplierid = supplierid;
		this.suname = suname;
		this.suphone = suphone;
		this.suinfo = suinfo;
		this.info = info;
		this.money = money;
	}
	public ItemDTS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
