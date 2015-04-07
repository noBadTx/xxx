package com.xemoo.dao.login;

import java.sql.SQLException;
import java.util.List;

import com.xemoo.pojo.login.Role;

/**
 * @ClassName: IRoleDAO
 * @Description: 角色DAO
 * @author tangtianyun
 * @date 2013-12-19 下午05:28:58
 * @version 1.0
 */
public interface IRoleDAO
{
    /**
     * 
     * @Title: insertRoleAccountRelation
     * @Description: 插入一条角色和账号关联关系的记录
     * @param account
     *            账号
     * @throws DAOException
     */
//    void insertRoleAccountRelation(Account account) throws DAOException;
    
    /**
    * @Title: updateRoleAccountRelation 
    * @Description: 修改角色和帐号关联关系的记录
    * @param @param account
    * @param @throws DAOException    设定文件 
    * @return void    返回类型 
    * @throws
     */
//    void updateRoleAccountRelation(Account account) throws DAOException;
    
    /**
    * @Title: getRoleList 
    * @Description: 获取角色列表
    * @param @return
    * @param @throws DAOException    设定文件 
    * @return List<Role>    返回类型 
    * @throws
     */
    public List<Role> getRoleList() throws SQLException;
    
    /**
    * @Title: getRoleById 
    * @Description: 根据roleId查询角色信息
    * @param @param roleId
    * @param @return
    * @param @throws DAOException    设定文件 
    * @return Role    返回类型 
    * @throws
     */
    public Role getRoleById(Long roleId) throws SQLException;
    
    /**
    * @Title: insertRolePermissInfo 
    * @Description: 添加角色权限 
    * @param @param roleId
    * @param @param permission
    * @param @return
    * @param @throws DAOException    设定文件 
    * @return Integer    返回类型 
    * @throws
     */
    public Integer insertRolePermissInfo(String roleId ,String pid) throws SQLException;
    
    /**
    * @Title: deleteRolePermissionInfo 
    * @Description: 删除角色管理权限
    * @param @param roleId
    * @param @param pid
    * @param @throws DAOException    设定文件 
    * @return void    返回类型 
    * @throws
     */
    public void deleteRolePermissionInfo(String roleId, String pid) throws SQLException;
}
