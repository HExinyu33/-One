package cn.entity;

public class Itemreq {
	private int id;
	private String name;
	private float money;
	private int transactor;
	private int state;
	private String info;
	private int type;
	private int stoid;

	public int getStoid() {
		return stoid;
	}

	public void setStoid(int stoid) {
		this.stoid = stoid;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

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

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public int getTransactor() {
		return transactor;
	}

	public void setTransactor(int transactor) {
		this.transactor = transactor;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Itemreq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Itemreq(int id, String name, float money, int transactor, int state, String info, int type) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.transactor = transactor;
		this.state = state;
		this.info = info;
		this.type = type;
	}

	public Itemreq(int id, String name, float money, int transactor, int state, String info, int type, int stoid) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.transactor = transactor;
		this.state = state;
		this.info = info;
		this.type = type;
		this.stoid = stoid;
	}
}
