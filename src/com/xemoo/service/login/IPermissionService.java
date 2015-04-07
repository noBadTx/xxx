package com.xemoo.service.login;

import java.util.List;

import com.xemoo.pojo.login.Permission;
import com.xemoo.pojo.login.Role;

/**
 * 
* @ClassName: IPermissionService 
* @Description: 资源管理类
* @author xujunjie 
* @date 2013-12-9 下午3:38:42 
* @version 1.0
 */
public interface IPermissionService
{

    /**
    * @Title: getResourcesByRoleId 
    * @Description: 根据用户名称获取资源列表
    * @param @param roleId
    * @param @return    设定文件 
    * @return List<Permission>    返回类型 
    * @throws
     */
    //public List<Permission> getResourcesByRoleId(int roleId);

    /**
    * @Title: findAll 
    * @Description: 查询所有资源列表 
    * @param @return    设定文件 
    * @return List<Permission>    返回类型 
    * @throws
     */
    List<Permission> findAll();
    
    /**
    * @Title: getRoleList 
    * @Description: 查询角色列表
    * @param @return    设定文件 
    * @return List<Role>    返回类型 
    * @throws
     */
    public List<Role> getRoleList();
    
    /**
    * @Title: gerRoleById 
    * @Description: 根据roleId查询角色信息
    * @param @param roleId
    * @param @return    设定文件 
    * @return Role    返回类型 
    * @throws
     */
    public Role gerRoleById(Long roleId);
    
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
     public Integer insertRolePermissInfo(String roleId ,String pid);
     
     /**
     * @Title: deleteRolePermissionInfo 
     * @Description: 删除角色管理权限
     * @param @param roleId
     * @param @param pid
     * @param @throws DAOException    设定文件 
     * @return void    返回类型 
     * @throws
      */
     public Integer deleteRolePermissionInfo(String roleId, String pid);
     
     /**
     * @Title: updateRolePermission 
     * @Description: 更新角色权限 
     * @param @param pids
     * @param @param roleId
     * @param @return    设定文件 
     * @return Integer    返回类型 
     * @throws
      */
     public Integer updateRolePermission(List<String> pids,String roleId);
    
}
