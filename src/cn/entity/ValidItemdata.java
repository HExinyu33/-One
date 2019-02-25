package cn.entity;

import java.util.Date;

public class ValidItemdata {
	private int  iid ;
	private String tname;
	private String dname ;
	private Date ivalidity ;
	private int dvalidity ;
	private int count;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Date getIvalidity() {
		return ivalidity;
	}
	public void setIvalidity(Date ivalidity) {
		this.ivalidity = ivalidity;
	}
	public int getDvalidity() {
		return dvalidity;
	}
	public void setDvalidity(int dvalidity) {
		this.dvalidity = dvalidity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public ValidItemdata(int iid, String tname, String dname, Date ivalidity,
			int dvalidity, int count) {
		super();
		this.iid = iid;
		this.tname = tname;
		this.dname = dname;
		this.ivalidity = ivalidity;
		this.dvalidity = dvalidity;
		this.count = count;
	}
	public ValidItemdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
