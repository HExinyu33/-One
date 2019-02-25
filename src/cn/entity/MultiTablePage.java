package cn.entity;

import java.util.ArrayList;
import java.util.List;

public class MultiTablePage extends AdvDao {
	private int totalcount;
	private int totalpage;
	private int currpage;
	private int pagesize;
	@SuppressWarnings("rawtypes")
	private List<?> list = new ArrayList();

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public int getCurrpage() {
		return currpage;
	}

	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public MultiTablePage(int currpage, String sql, int pagesize, String tableName) {
		this.pagesize = pagesize;
		totalcount = gettablecount(tableName);
		totalpage = totalcount % pagesize == 0 ? totalcount / pagesize : totalcount / pagesize + 1;
		this.currpage = currpage;
		list = getList(sql, new Object[] {});
	}

}
