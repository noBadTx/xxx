package com.xemoo.dao.role.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xemoo.base.BaseDAO;
import com.xemoo.base.SQLManager;
import com.xemoo.dao.role.IFrontRoleDAO;
import com.xemoo.pojo.DaoPage;
import com.xemoo.pojo.login.AccountRole;
import com.xemoo.pojo.login.FrontRole;
import com.xemoo.pojo.login.RoleMoudle;
import com.xemoo.exception.DAOException;
@Repository
public class FrontRoleDAO extends BaseDAO implements IFrontRoleDAO {

	public void insertRoleAccountRelation(AccountRole accountRole)
			throws SQLException {
		this.insert(SQLManager.ROLE_INSERT_ACCOUNT_ROLE_MAPPING, accountRole);
	}

	public void updateRoleAccountRelation(AccountRole accountRole)
			throws SQLException {
		this.update(SQLManager.ROLE_UPDATE_ACCOUNT_ROLE_MAPPING, accountRole);
	}

	public List<FrontRole> qryFrontRoleList(DaoPage daopage) throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>(1);
        map.put(SQLManager.PAGE_NAME, daopage);
		return (List<FrontRole>)this.queryForList(
				SQLManager.QUERY_FRONT_ROLE_LIST, map);
	}

	public Integer qryqryFrontRoleListCnt() throws SQLException {
		return (Integer)this.queryForObject(SQLManager.QUERY_FRONT_ROLE_LIST_COUNT, null);
	}

	public FrontRole qryFrontRoleById(Long id) throws SQLException {
		return (FrontRole)this.queryForObject(SQLManager.QUERY_FRONT_ROLE_BY_ID, id);
	}

	public void insertFrontRole(FrontRole role) throws SQLException {
		this.insert(SQLManager.INSERT_FRONT_ROLE, role);
	}

	public void updateFrontRole(FrontRole role) throws SQLException {
		this.update(SQLManager.UPDATE_FRONT_ROLE, role);
	}

	public Integer insertRoleMoudle(Integer fRoleId, Integer roleId, Integer status) throws SQLException{
		Map<String,Object> map = new HashMap<String, Object>(3);
		map.put("fRoleId", fRoleId);
		map.put("roleId", roleId);
		map.put("status", status);
		return (Integer)this.insert(SQLManager.INSERT_FRONT_ROLE, map);
	}

	public void deleteRoleMoudel(Integer fRoleId, Integer roleId) throws SQLException{
		Map<String,Object> map = new HashMap<String, Object>(2);
		map.put("fRoleId", fRoleId);
		map.put("roleId", roleId);
		this.update(SQLManager.DELETE_ROLE_MOUDLE, map);
	}

	public List<RoleMoudle> qryRoleMoudleListByFroleId(Integer roleId)
			throws SQLException {
		Map<String,Object> map = new HashMap<String, Object>(1);
		map.put("roleId", roleId);
		return (List<RoleMoudle>)this.queryForList(
				SQLManager.QRY_ROLE_MOUDLE_LIST_BY_ID, map);
	}

}
