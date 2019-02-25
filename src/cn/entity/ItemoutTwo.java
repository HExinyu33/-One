package cn.entity;

import java.util.Date;

public class ItemoutTwo {
	private int iid;
	private int iitemid;
	private int istorageid;
	private int icount;
	private Date itime;
	private int did;
	private String dname;
	private int sid;
	private String sname;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public int getIitemid() {
		return iitemid;
	}

	public void setIitemid(int iitemid) {
		this.iitemid = iitemid;
	}

	public int getIstorageid() {
		return istorageid;
	}

	public void setIstorageid(int istorageid) {
		this.istorageid = istorageid;
	}

	public int getIcount() {
		return icount;
	}

	public void setIcount(int icount) {
		this.icount = icount;
	}

	public Date getItime() {
		return itime;
	}

	public void setItime(Date itime) {
		this.itime = itime;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public ItemoutTwo(int iid, int iitemid, int istorageid, int icount, Date itime, int did, String dname, int sid, String sname) {
		super();
		this.iid = iid;
		this.iitemid = iitemid;
		this.istorageid = istorageid;
		this.icount = icount;
		this.itime = itime;
		this.did = did;
		this.dname = dname;
		this.sid = sid;
		this.sname = sname;
	}

	public ItemoutTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
