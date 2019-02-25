package cn.entity;

import java.util.ArrayList;
import java.util.List;

public class PageEntity extends AdvDao {
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

	/**
	 * 
	 * @param 褰撳墠椤�
	 * @param 琛ㄥ悕
	 * @param 椤靛ぇ灏�
	 * @param 鏁版嵁闆嗗悎
	 */
	public PageEntity(int currpage, String tableName, int pagesize, List<?> list) {
		this.pagesize = pagesize;
		totalcount = gettablecount(tableName);
		totalpage = totalcount % pagesize == 0 ? totalcount / pagesize : totalcount / pagesize + 1;
		this.currpage = currpage;
		this.list = list;
	}

	/**
	 * 
	 * @param 褰撳墠椤�
	 * @param 鏁伴噺
	 * @param 椤靛ぇ灏�
	 * @param 鏁版嵁闆嗗悎
	 */
	public PageEntity(int currpage, int count, int pagesize, List<?> list) {
		this.pagesize = pagesize;
		totalcount = count;
		totalpage = totalcount % pagesize == 0 ? totalcount / pagesize : totalcount / pagesize + 1;
		this.currpage = currpage;
		this.list = list;
	}
}
