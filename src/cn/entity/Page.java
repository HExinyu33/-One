package cn.entity;

import java.sql.ResultSet;

public class Page extends AdvDao {

	public ResultSet getPagers(String tablename, int pagesize, int currpage) {
		return getrs("select top(" + pagesize + ")* from " + tablename + " where id not in " + "(select top((" + currpage + "-1)*" + pagesize + ") id from " + tablename + " order by id)" + " order by id", new Object[] {});
	}

	
	public ResultSet getonePagers(String tablename, int pagesize, int currpage, String where) {
		return getrs("select top(" + pagesize + ")* from " + tablename + " where " + where + " and id not in " + "(select top((" + currpage + "-1)*" + pagesize + ") id from " + tablename + " where " + where + " order by id)" + " order by id", new Object[] {});
	}

	
	public ResultSet getonePagers(String tablename, int pagesize, int currpage, String where, String order) {
		String sql = "select top(" + pagesize + ")* from " + tablename + " where " + where + " and id not in " + "(select top((" + currpage + "-1)*" + pagesize + ") id from " + tablename + " where " + where + " order by " + order + ")" + " order by " + order;
		return getrs(sql, new Object[] {});
	}

	
	public ResultSet getStorageUsers(int pagesize, int currpage) {
		return getrs("select s.id,s.name,s.info,s.userid,u.id,u.name,u.gender,u.age,u.typeid,u.info,u.email,u.phone,u.discount from storage s, users u where s.userid=u.id", new Object[] {});
	}

	
	public ResultSet getIteminTwo(String s, int pagesize, int currpage) {
		if (s == null) {
			return getrs("select i.id,i.ITEMID,i.STORAGEID,i.count,i.TIME,i.PRICE,i.totalprice,d.id,d.name,s.ID,s.name from ITEMIN i, ITEMdata d, STORAGE s where i.ITEMID=d.id and i.STORAGEID=s.ID", new Object[] {});
		} else {
			return getrs("select i.id,i.ITEMID,i.STORAGEID,i.count,i.TIME,i.PRICE,i.totalprice,d.id,d.name,s.ID,s.name from ITEMIN i, ITEMdata d, STORAGE s where i.ITEMID=d.id and i.STORAGEID=s.ID" + s, new Object[] {});
		}
	}

	
	public ResultSet getItemoutTwo(String s, int pagesize, int currpage) {
		if (s == null) {
			return getrs("select i.id,i.ITEMID,i.STORAGEID,i.count,i.TIME,d.id,d.name,s.ID,s.name from ITEMOUT i, ITEMdata d, STORAGE s where i.ITEMID=d.id and i.STORAGEID=s.ID", new Object[] {});
		} else {
			return getrs("select i.id,i.ITEMID,i.STORAGEID,i.count,i.TIME,d.id,d.name,s.ID,s.name from ITEMOUT i, ITEMdata d, STORAGE s where i.ITEMID=d.id and i.STORAGEID=s.ID" + s, new Object[] {});
		}
	}

	

	public ResultSet getPagers(String tables, int pagesize, int currpage, String where) {
		String id = where.substring(0, where.indexOf('='));
		String sql;
		if (where.indexOf("order") > -1) {
			sql = "select top(" + pagesize + ")* from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + ")" + " and " + where;

		} else {
			sql = "select top(" + pagesize + ")* from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + " order by " + id + ")" + " and " + where + " order by " + id;
		}
		return getrs(sql, new Object[] {});
	}

	
	public ResultSet getPagers(String tables, int pagesize, int currpage, String where, String id) {
		String sql;
		if (where.indexOf("order") > -1) {
			sql = "select top(" + pagesize + ")* from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + ")" + " and " + where;

		} else {
			sql = "select top(" + pagesize + ")* from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + " order by " + id + ")" + " and " + where + " order by " + id;
		}
		return getrs(sql, new Object[] {});
	}

	public int getPageCount(String tables, String where) {
		String sql = "select count(*) from " + tables + " where  " + where;
		return getid(sql, O());
	}

	public ResultSet getPagers(String params, String tables, int pagesize, int currpage, String where) {
		String id = where.substring(0, where.indexOf('=')); // 鑾峰彇瑕佹牴鎹粈涔坕d杩涜鍒嗛〉鎺掑簭,榛樿涓烘潯浠惰鍙ョ殑绗竴涓猧d
		String sql;
		if (where.indexOf("order") > -1) {
			sql = "select top(" + pagesize + ") " + params + " from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + ")" + " and " + where;
		} else {
			sql = "select top(" + pagesize + ") " + params + " from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + " order by " + id + ")" + " and " + where + " order by " + id;
		}
		return getrs(sql, O());
	}

	
	public ResultSet getPagers(String params, String tables, int pagesize, int currpage, String where, String id) {
		String sql;
		if (where.indexOf("order") > -1) {
			sql = "select top(" + pagesize + ") " + params + " from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + ")" + " and " + where;
		} else {
			sql = "select top(" + pagesize + ") " + params + " from " + tables + " where " + id + " not in " + "(select top((" + currpage + "-1)*" + pagesize + ") " + id + " from " + tables + " where " + where + " order by " + id + ")" + " and " + where + " order by " + id;
		}
		return getrs(sql, O());
	}
}
