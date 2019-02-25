package cn.entity;

public class Permission {
	private int id;
	private String name;
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
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
