package com.xemoo.service.role;

import java.util.List;

import com.xemoo.pojo.ActionPage;
import com.xemoo.pojo.login.DisplayRole;
import com.xemoo.pojo.login.FrontRole;
import com.xemoo.exception.ServiceException;

public interface IFrontRoleService {
	/**
	 * 分页的角色权限查询
	 * @param page
	 * @return
	 * @throws ServiceException
	 */
	public ActionPage<DisplayRole> qryFrontRoles(ActionPage<DisplayRole> page) throws ServiceException;
	
	/**
	 * 查询单个角色权限
	 * @param roleId
	 * @return
	 * @throws ServiceException
	 */
	public DisplayRole qryFrontRoleById(Long roleId)throws ServiceException;
	
	/**
	 * 新增权限角色
	 * @param fRole
	 * @param roleIds
	 */
	public void addFrontRole(FrontRole fRole, List<Integer> roleIds);
	
	/**
	 * 修改权限角色
	 * @param fRole
	 * @param roleIds
	 */
	public void modifyFrontRole(FrontRole fRole, List<Integer> roleIds);
	
	/**
	 * 删除权限角色
	 * @param fRole
	 */
	public void delFrontRole(FrontRole fRole);
}
