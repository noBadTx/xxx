package com.xemoo.service.role.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xemoo.dao.role.IFrontRoleDAO;
import com.xemoo.pojo.ActionPage;
import com.xemoo.pojo.login.DisplayRole;
import com.xemoo.pojo.login.FrontRole;
import com.xemoo.pojo.login.RoleMoudle;
import com.xemoo.exception.DBErrorCode;
import com.xemoo.exception.ServiceException;
import com.xemoo.service.role.IFrontRoleService;

/**
 * 角色的操作，包括对角色和角色权限对应关系的操作
 * @author xiangzhiwei
 *
 */
public class FrontRoleServiceImpl implements IFrontRoleService {

	@Autowired
    private IFrontRoleDAO frontRoleDAO;
	
	private static final Log logger = LogFactory
            .getLog(FrontRoleServiceImpl.class);
	
	private DisplayRole fromFrontRole(FrontRole f){
		DisplayRole dr = new DisplayRole();
		dr.setId(f.getId());
		dr.setName(f.getName());
		dr.setStatus(f.getStatus());
		//查询roleMoudle
		List<RoleMoudle> moudles = null;
	    try {
			frontRoleDAO.qryRoleMoudleListByFroleId(f.getId());
		} catch (SQLException e) {
			logger.error("frontRoleDAO.qryRoleMoudleListByFroleId error...",e);
		}
		String roleDisp = "";
		for(RoleMoudle rm : moudles){
			roleDisp = roleDisp +"/" + rm.getRole().getName() ;
		}
		roleDisp = roleDisp.substring(1);
		dr.setRoleDisp(roleDisp);
		dr.setMoudles(moudles);
		return dr;
	}
    
//	@Override
	public ActionPage<DisplayRole> qryFrontRoles(ActionPage<DisplayRole> page)
			throws ServiceException {
		try {
			List<DisplayRole> dRoles = new ArrayList<DisplayRole>();
			page.setTotal(frontRoleDAO.qryqryFrontRoleListCnt());
			List<FrontRole> frontRoles = frontRoleDAO.qryFrontRoleList(page.builderDaoPage());
			for(FrontRole f : frontRoles){
				DisplayRole dr = fromFrontRole(f);
				dRoles.add(dr);
			}
			page.setRows(dRoles);
		} catch (SQLException e) {
			logger.error("IFrontRoleService.qryFrontRoles error...",e);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
		return page;
	}

//	@Override
	public DisplayRole qryFrontRoleById(Long roleId){
		DisplayRole dr = null;
		try {
			FrontRole f = frontRoleDAO.qryFrontRoleById(roleId);
			dr = fromFrontRole(f);
		} catch (SQLException e) {
			logger.error("IFrontRoleService.qryFrontRoleById error...",e);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
		return dr;
	}

//	@Override
	@Transactional
	public void addFrontRole(FrontRole fRole, List<Integer> roleIds) {
		try {
			frontRoleDAO.insertFrontRole(fRole);
			Integer fRoleId = fRole.getId();
			for(Integer roleId : roleIds){
				frontRoleDAO.insertRoleMoudle(fRoleId, roleId, 1);
			}
		} catch (SQLException e) {
			logger.error("IFrontRoleService.addFrontRole error...",e);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		} catch(Throwable a){
			logger.error("IFrontRoleService.addFrontRole error...",a);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
	}

//	@Override
	@SuppressWarnings("unchecked")
	@Transactional
	public void modifyFrontRole(FrontRole fRole, List<Integer> roleIds) {
		try {
			frontRoleDAO.updateFrontRole(fRole);
			//查询roleMoudle
			List<RoleMoudle> moudles = frontRoleDAO.qryRoleMoudleListByFroleId(fRole.getId());
			List<Integer> o_roleIds = new ArrayList<Integer>();
			for(RoleMoudle rm : moudles){
				o_roleIds.add(rm.getRole().getId());
			}
			// 获取相同集合并且查询需要删除的ID
	        List<Integer> list = (List<Integer>) CollectionUtils.intersection(
	        		o_roleIds, roleIds);
	        List<Integer> deleteIds = (List<Integer>) CollectionUtils.disjunction(
	                list, o_roleIds);

	        // 获取List中需要添加的元素
	        List<Integer> addList = (List<Integer>) CollectionUtils.disjunction(
	        		o_roleIds, roleIds);
	        List<Integer> addIds = (List<Integer>) CollectionUtils.disjunction(
	                addList, deleteIds);
	        if (null != deleteIds && !deleteIds.isEmpty())
	        {
	            // 批量删除
	            for (Integer id : deleteIds)
	            {
	            	frontRoleDAO.deleteRoleMoudel(fRole.getId(), id);
	            }
	        }

	        if (null != addIds && !addIds.isEmpty())
	        {
	            // 批量添加
	            for (Integer id : addIds)
	            {
	            	frontRoleDAO.insertRoleMoudle(fRole.getId(), id, 1);
	            }
	        }
		} catch (SQLException e) {
			logger.error("IFrontRoleService.modifyFrontRole error...",e);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		} catch(Throwable a){
			logger.error("IFrontRoleService.modifyFrontRole error...",a);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
	}

//	@Override
	@Transactional
	public void delFrontRole(FrontRole fRole) {
		try {
			fRole.setStatus(0); //状态改为已删除
			frontRoleDAO.updateFrontRole(fRole);
			//查询roleMoudle
			List<RoleMoudle> moudles = frontRoleDAO.qryRoleMoudleListByFroleId(fRole.getId());
			for (RoleMoudle rm : moudles)
            {
            	frontRoleDAO.deleteRoleMoudel(fRole.getId(), rm.getRole().getId());
            }
		}catch (SQLException e) {
			logger.error("IFrontRoleService.delFrontRole error...",e);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		} catch(Throwable a){
			logger.error("IFrontRoleService.delFrontRole error...",a);
			throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
	}

}
