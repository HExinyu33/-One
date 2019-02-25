package cn.entity;

public class Itemchange {
	private int id ;
	private int type;			
	private int itemid ;
	private int count ;
	private int transactor ;    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public int getTransactor() {
		return transactor;
	}
	public void setTransactor(int transactor) {
		this.transactor = transactor;
	}
	public Itemchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Itemchange(int id, int type, int itemid, int count, int transactor) {
		super();
		this.id = id;
		this.type = type;
		this.itemid = itemid;
		this.count = count;
		this.transactor = transactor;
	}
	
	
}
