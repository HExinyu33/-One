package cn.entity;

public class Supplier {
private int id;
private String name;
private String phone;
private String info;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public Supplier(int id, String name, String phone, String info) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.info = info;
}
public Supplier() {
	super();
	// TODO Auto-generated constructor stub
}

}
