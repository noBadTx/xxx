package com.xemoo.base;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO 基类
 * 
 * @Type BaseDAO
 * @author huxy
 * @date 2014-11-05
 * @Version V1.0
 */
public abstract class BaseDAO extends SqlMapClientDaoSupport {

	public Object insert(String arg0) throws SQLException {
		return this.getSqlMapClient().insert(arg0);
	}

	public Object insert(String p1, Object p2) throws SQLException {
		return this.getSqlMapClient().insert(p1, p2);
	}

	public Object queryForObject(String arg0) throws SQLException {
		return this.getSqlMapClient().queryForObject(arg0);
	}

	public Object queryForObject(String arg0, Object arg1) throws SQLException {
		return this.getSqlMapClient().queryForObject(arg0, arg1);
	}

	public Object queryForObject(String arg0, Object arg1, Object arg2)
			throws SQLException {
		return this.getSqlMapClient().queryForObject(arg0, arg1, arg2);
	}

	public Object queryForList(String arg0, Object arg1) throws SQLException {
		return this.getSqlMapClient().queryForList(arg0, arg1);
	}

	public Object queryForList(String arg0) throws SQLException {
		return this.getSqlMapClient().queryForList(arg0);
	}

	public Object queryForList(String arg0, int arg1, int arg2)
			throws SQLException {
		return this.getSqlMapClient().queryForList(arg0, arg1, arg2);
	}

	public int update(String arg0) throws Exception {
		return this.getSqlMapClient().update(arg0);
	}

	public int update(String arg0, Object arg1) throws SQLException {
		return this.getSqlMapClient().update(arg0, arg1);
	}

	public int delete(String arg0) throws SQLException {
		return this.getSqlMapClient().delete(arg0);
	}

	public int delete(String arg0, Object arg1) throws SQLException {
		return this.getSqlMapClient().delete(arg0, arg1);
	}

}
