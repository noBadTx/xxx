package com.xemoo.dao.login;

import java.sql.SQLException;
import java.util.List;

import com.xemoo.pojo.login.Permission;

/**
 * @ClassName: 资源类
 * @author xujunjie
 * @date 2013-12-7 上午11:12:01
 * @version 1.0
 */
public interface IPermissionDAO
{
    public List<Permission> findAll();

    // <!-- 根据用户Id获取该用户的权限-->
    public List<Permission> getUserResources(String userId);

    // <!-- 根据角色Id获取该角色的权限-->
    //public List<Permission> getRoleResources(int roleId);
    
    /**
    * @Title: getPermissionList 
    * @Description: 查询权限列表 
    * @param @param pid
    * @param @return    设定文件 
    * @return List<Permission>    返回类型 
    * @throws
     */
    public List<Permission> getPermissionListByPpid(int pid) throws SQLException;
}
