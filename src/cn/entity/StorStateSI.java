package cn.entity;

import java.util.Date;

public class StorStateSI {
	private int id;
	private int oldstoid;
	private String oldname;
	private int newstoid;
	private String newname;
	private int itemid;
	private String itemname;
	private Date time;
	private int count;
	private int transactor;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOldstoid() {
		return oldstoid;
	}
	public void setOldstoid(int oldstoid) {
		this.oldstoid = oldstoid;
	}
	public String getOldname() {
		return oldname;
	}
	public void setOldname(String oldname) {
		this.oldname = oldname;
	}
	public int getNewstoid() {
		return newstoid;
	}
	public void setNewstoid(int newstoid) {
		this.newstoid = newstoid;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public StorStateSI(int id, int oldstoid, String oldname, int newstoid,
			String newname, int itemid, String itemname, Date time, int count,
			int transactor, String username) {
		super();
		this.id = id;
		this.oldstoid = oldstoid;
		this.oldname = oldname;
		this.newstoid = newstoid;
		this.newname = newname;
		this.itemid = itemid;
		this.itemname = itemname;
		this.time = time;
		this.count = count;
		this.transactor = transactor;
		this.username = username;
	}
	public StorStateSI() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
