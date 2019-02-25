package cn.entity;

public class Userpermiss {
	private int id;
	private int tid;
	private int pid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Userpermiss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userpermiss(int id, int tid, int pid) {
		super();
		this.id = id;
		this.tid = tid;
		this.pid = pid;
	}
}
