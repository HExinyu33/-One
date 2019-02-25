package cn.entity;

import java.util.Date;

public class Storagestate {
	private int id;
	private int oldstoid;
	private int newstoid;
	private int itemid;
	private Date time;
	private int count;
	private int transactor;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

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

	public int getNewstoid() {
		return newstoid;
	}

	public void setNewstoid(int newstoid) {
		this.newstoid = newstoid;
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

	public Storagestate(int id, int oldstoid, int newstoid, int itemid, Date time, int count, int transactor) {
		super();
		this.id = id;
		this.oldstoid = oldstoid;
		this.newstoid = newstoid;
		this.itemid = itemid;
		this.time = time;
		this.count = count;
		this.transactor = transactor;

	}

	public Storagestate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
