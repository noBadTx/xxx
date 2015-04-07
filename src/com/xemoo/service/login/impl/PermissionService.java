package com.xemoo.service.login.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xemoo.dao.login.IPermissionDAO;
import com.xemoo.dao.login.IRoleDAO;
import com.xemoo.pojo.login.Permission;
import com.xemoo.pojo.login.Role;
import com.xemoo.exception.BusinessErrorCode;
import com.xemoo.exception.ServiceException;
import com.xemoo.service.login.IPermissionService;

@Service
public class PermissionService implements IPermissionService
{
    @Autowired
    private IPermissionDAO permissionDAO;

    @Autowired
    private IRoleDAO roleDAO;

    private static final Log logger = LogFactory
            .getLog(PermissionService.class);

    /*
    public List<Permission> getResourcesByRoleId(int roleId)
    {
        List<Permission> list = permissionDAO.getRoleResources(roleId);
        if (list == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }
    */

//    @Override
    public List<Permission> findAll()
    {
        List<Permission> list = permissionDAO.findAll();
        if (list == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }

//    @Override
    public List<Role> getRoleList()
    {
        try
        {
            return roleDAO.getRoleList();
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionService.getRoleList ", e);
            return null;
        }
    }
    
    public Role gerRoleById(Long roleId){
        if(roleId == null || roleId == 0){
            throw new ServiceException(BusinessErrorCode.ARGS_IS_NULL_OR_EMPTY, "roleId 不能为空");
        }
        try
        {
            return roleDAO.getRoleById(roleId);
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionService.gerRoleById ",e);
            return null;
        }
    }

//    @Override
    public Integer insertRolePermissInfo(String roleId, String permission)
    {
        try
        {
            return roleDAO.insertRolePermissInfo(roleId, permission);
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionService.insertRolePermissInfo ", e);
            return -1;
        }
    }

//    @Override
    public Integer deleteRolePermissionInfo(String roleId, String pid)
    {
        try
        {
            roleDAO.deleteRolePermissionInfo(roleId, pid);
            return 0;
        }
        catch(SQLException e)
        {
            logger.error("ERROR PermissionService.deleteRolePermissionInfo ", e);
            return -1;
        }
    }

    @SuppressWarnings("unchecked")
//    @Override
    public Integer updateRolePermission(List<String> pids, String roleId)
    {

        int recode = 0;

        // 获取角色权限列表
        List<Permission> userPermissionList = null;
//        		this.getResourcesByRoleId(StringUtil.toIntDefValue(roleId, 0));

        List<String> userPermissionListById = new ArrayList<String>();
        for (Permission permission : userPermissionList)
        {
            userPermissionListById.add(String.valueOf(permission.getId()));
        }

        // 获取相同集合并且查询需要删除的ID
        List<String> list = (List<String>) CollectionUtils.intersection(
                userPermissionListById, pids);
        List<String> deleteIds = (List<String>) CollectionUtils.disjunction(
                list, userPermissionListById);

        // 获取List中需要添加的元素
        List<String> addList = (List<String>) CollectionUtils.disjunction(
                userPermissionListById, pids);
        List<String> addIds = (List<String>) CollectionUtils.disjunction(
                addList, deleteIds);

        if (null != deleteIds && !deleteIds.isEmpty())
        {
            // 批量删除
            for (String id : deleteIds)
            {
                this.deleteRolePermissionInfo(roleId, id);
            }
        }

        if (null != addIds && !addIds.isEmpty())
        {
            // 批量添加
            for (String id : addIds)
            {
                this.insertRolePermissInfo(roleId, id);
            }
        }
        return recode;
    }

}
