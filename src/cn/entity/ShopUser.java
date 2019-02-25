package cn.entity;

public class ShopUser {
  private int id;
  private int uid;
  private int sid;
  private int storid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getStorid() {
	return storid;
}
public void setStorid(int storid) {
	this.storid = storid;
}
public ShopUser(int id, int uid, int sid, int storid) {
	super();
	this.id = id;
	this.uid = uid;
	this.sid = sid;
	this.storid = storid;
}
public ShopUser() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
