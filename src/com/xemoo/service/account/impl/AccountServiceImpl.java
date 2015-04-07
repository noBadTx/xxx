package com.xemoo.service.account.impl;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xemoo.dao.login.IAccountLoginDAO;
import com.xemoo.dao.role.IFrontRoleDAO;
import com.xemoo.pojo.login.AccountLogin;
import com.xemoo.pojo.login.AccountRole;
import com.xemoo.exception.DBErrorCode;
import com.xemoo.exception.ServiceException;
import com.xemoo.service.account.IAccountService;

@Service
/**
 * 管理员的操作，逻辑处理包括新建帐号，和帐号权限信息
 * @author xiangzhiwei
 *
 */
public class AccountServiceImpl implements IAccountService{

	@Autowired
    private IAccountLoginDAO accountLoginDAO;
	
	@Autowired
    private IFrontRoleDAO frontRoleDAO;
    
	private static final Log logger = LogFactory.getLog(AccountServiceImpl.class);
			
//	@Override
	@Transactional
	public void addAccount(AccountLogin aLogin, AccountRole aRole) {
		try {
			accountLoginDAO.insertAccountLogin(aLogin);
			aRole.setAccountId(aLogin.getId());
			frontRoleDAO.insertRoleAccountRelation(aRole);
		} catch (SQLException e) {
			 logger.error("add account error.", e);
			 throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
		}catch(Throwable e)
        {
            logger.error("add account error.", e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
        }
	}

//	@Override
	@Transactional
	public void updateAccount(AccountLogin aLogin, AccountRole aRole) {
		try {
			accountLoginDAO.updateAccountLogin(aLogin);
			frontRoleDAO.updateRoleAccountRelation(aRole);
		} catch (SQLException e) {
			 logger.error("update account error.", e);
			 throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
		}catch(Throwable e)
        {
            logger.error("update account error.", e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
        }
	}

//	@Override
	@Transactional
	public void delAccount(AccountLogin aLogin, AccountRole aRole) {
		try {
			aLogin.setStatus(-1);//状态改为删除
			accountLoginDAO.updateAccountLogin(aLogin);
			aRole.setStatus(0);
			frontRoleDAO.updateRoleAccountRelation(aRole);
		} catch (SQLException e) {
			 logger.error("update account error.", e);
			 throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
		}catch(Throwable e)
        {
            logger.error("update account error.", e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "数据库错误");
        }
	}
	
}
