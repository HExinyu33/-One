package cn.entity;
/**
 * �ֿ���
 * @author Administrator
 *
 */
public class Storage {
	private int id;
	private String name;
	private String info;
	private int userid;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Storage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Storage(int id, String name, String info, int userid) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
		this.userid = userid;
	}
}
