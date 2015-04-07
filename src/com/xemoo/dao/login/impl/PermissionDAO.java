package com.xemoo.dao.login.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.xemoo.base.BaseDAO;
import com.xemoo.base.SQLManager;
import com.xemoo.dao.login.IPermissionDAO;
import com.xemoo.pojo.login.Permission;
import com.xemoo.util.StringUtil;

@Repository
public class PermissionDAO extends BaseDAO implements IPermissionDAO
{
    private static final Log logger = LogFactory.getLog(PermissionDAO.class);

    public List<Permission> findAll()
    {
        try
        {
            List<Permission> list = (List<Permission>) queryForList(
                    SQLManager.PERMISSION_FINDALL, null);
            return list;
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionDAO.findAll is DAOException = ", e);
            return null;
        }

    }

    // <!-- 根据账号Id获取该用户的权限-->
    public List<Permission> getUserResources(String accountId)
    {
        try
        {
            List<Permission> list = (List<Permission>) queryForList(
                    SQLManager.PERMISSION_FINDALL_TO_ACCOUNTID,
                    StringUtil.toIntDefValue(accountId, 0));
            return list;
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionDAO.getUserResources is DAOException = ", e);
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<Permission> getPermissionListByPpid(int pid) throws SQLException
    {
        return (List<Permission>)this.queryForList(SQLManager.PERMISSION_LIST_BY_PPID, pid);
    }

}
