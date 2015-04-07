package com.xemoo.dao.role;

import java.sql.SQLException;
import java.util.List;

import com.xemoo.pojo.DaoPage;
import com.xemoo.pojo.login.AccountRole;
import com.xemoo.pojo.login.FrontRole;
import com.xemoo.pojo.login.RoleMoudle;


public interface IFrontRoleDAO {
	
	/**
	 * 插入一条账号和角色的关联关系记录
	 * @param accountRole
	 * @throws DAOException
	 */
	public void insertRoleAccountRelation(AccountRole accountRole) throws SQLException;
	
	/**
	 * 修改角色和帐号关联关系的记录
	 * @param accountRole
	 * @throws DAOException
	 */
	public void updateRoleAccountRelation(AccountRole accountRole) throws SQLException;
	
	/**
	 * 查询前端角色list
	 * @return
	 * @throws DAOException
	 */
	public List<FrontRole> qryFrontRoleList(DaoPage daopage) throws SQLException;
	
	/**
	 * 查询前端角色个数
	 * @return
	 * @throws DAOException
	 */
	public Integer qryqryFrontRoleListCnt() throws SQLException;
	
	/**
	 * 按照id查询前端角色
	 * @param id
	 * @return
	 * @throws DAOException
	 */
	public FrontRole qryFrontRoleById(Long id) throws SQLException;
	
	/**
	 * 插入单条前端角色
	 * @param role
	 * @throws DAOException
	 */
	public void insertFrontRole(FrontRole role) throws SQLException;
	
	/**
	 * 修改单条前端角色
	 * @param role
	 * @throws DAOException
	 */
	public void updateFrontRole(FrontRole role) throws SQLException;
	
	/**
	 * 新增角色中间表
	 * @param fRoleId
	 * @param roleId
	 * @param status
	 * @return
	 */
	public Integer insertRoleMoudle(Integer fRoleId, Integer roleId,
			Integer status) throws SQLException;
	
	/**
	 * 删除角色中间表记录
	 * @param fRoleId
	 * @param roleId
	 */
	public void deleteRoleMoudel(Integer fRoleId, Integer roleId) throws SQLException;
	
	/**
	 * 根据前端角色查询对应关系列表
	 * @param roleId
	 * @return
	 * @throws DAOException
	 */
	public List<RoleMoudle> qryRoleMoudleListByFroleId(Integer roleId)throws SQLException;
}
