package com.xemoo.dao.login.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xemoo.base.BaseDAO;
import com.xemoo.base.SQLManager;
import com.xemoo.dao.login.IRoleDAO;
import com.xemoo.pojo.login.Role;

/**
 * @ClassName: RoleDAO
 * @Description: 角色DAO
 * @author tangtianyun
 * @date 2013-12-19 下午05:32:17
 * @version 1.0
 */
@Repository
public class RoleDAO extends BaseDAO implements IRoleDAO
{

//    @Override
//    public void insertRoleAccountRelation(Account account) throws DAOException
//    {
//        super.executeInsert(NamingSQLIDs.ROLE_INSERT_ACCOUNT_ROLE_MAPPING,
//                account);
//        // throw new DAOException("test");
//    }
//
//    public void updateRoleAccountRelation(Account account) throws DAOException
//    {
//        super.executeInsert(NamingSQLIDs.ROLE_UPDATE_ACCOUNT_ROLE_MAPPING,
//                account);
//    }

    public List<Role> getRoleList() throws SQLException
    {
        return (List<Role>)this.queryForList(SQLManager.ROLE_QUERY_ROLE_LIST_MAPPING,null)  ;
    }
    
    public Role getRoleById(Long roleId) throws SQLException{
        return (Role)this.queryForObject(SQLManager.ROLE_QUERY_ROLE_MAPPING, roleId);
    }

    public Integer insertRolePermissInfo(String roleId, String pid)
            throws SQLException
    {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("roleId", roleId);
        map.put("pid", pid);
        return (Integer)this.insert(SQLManager.ROLE_INSERT_PERMISSION_ROLE_MAPPING, map);
    }

    public void deleteRolePermissionInfo(String roleId, String pid)
            throws SQLException
    {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("roleId", roleId);
        map.put("pid", pid);
        this.update(SQLManager.ROLE_DELETE_PERMISSION_ROLE_MAPPING, map);
    }
}
