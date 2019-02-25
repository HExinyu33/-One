package cn.entity;

public class StorageUsers {
	private int sid;
	private String sname;
	private String sinfo;
	private int suserid;
	private int uid;
	private String uname;
	private String ugender;
	private int uage;
	private int utypeid;
	private String uinfo;
	private String uemail;
	private String uphone;
	private float discount;
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
	public String getSinfo() {
		return sinfo;
	}
	public void setSinfo(String sinfo) {
		this.sinfo = sinfo;
	}
	public int getSuserid() {
		return suserid;
	}
	public void setSuserid(int suserid) {
		this.suserid = suserid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUgender() {
		return ugender;
	}
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public int getUtypeid() {
		return utypeid;
	}
	public void setUtypeid(int utypeid) {
		this.utypeid = utypeid;
	}
	public String getUinfo() {
		return uinfo;
	}
	public void setUinfo(String uinfo) {
		this.uinfo = uinfo;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public StorageUsers(int sid, String sname, String sinfo, int suserid,
			int uid, String uname, String ugender, int uage, int utypeid,
			String uinfo, String uemail, String uphone, float discount) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sinfo = sinfo;
		this.suserid = suserid;
		this.uid = uid;
		this.uname = uname;
		this.ugender = ugender;
		this.uage = uage;
		this.utypeid = utypeid;
		this.uinfo = uinfo;
		this.uemail = uemail;
		this.uphone = uphone;
		this.discount = discount;
	}
	public StorageUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
