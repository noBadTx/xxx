package com.xemoo.service.login.impl;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xemoo.dao.login.IAccountLoginDAO;
import com.xemoo.pojo.ActionPage;
import com.xemoo.pojo.login.AccountLogin;
import com.xemoo.exception.BusinessErrorCode;
import com.xemoo.exception.DBErrorCode;
import com.xemoo.exception.ServiceException;
import com.xemoo.service.login.IAccountLoginService;
import com.xemoo.util.MD5Wap;

/** 
 * @ClassName: AccountLoginServiceImpl 
 * @Description: 账号登录服务类
 * @author xiangzhiwei
 * @date 2014年11月4日 下午3:06:30 
 * @version 1.0 
 */
@Service
public class AccountLoginServiceImpl implements IAccountLoginService
{
    private static final Log logger = LogFactory
            .getLog(AccountLoginServiceImpl.class);
    
    @Autowired
    private IAccountLoginDAO accountLoginDAO;
    
//    @Override
    public AccountLogin queryAccountLogin(AccountLogin login)
    {
        AccountLogin alogin = null;
        try
        {
            alogin = accountLoginDAO.queryAccountLogin(login);
        }
        catch(SQLException e)
        {
            logger.error("accountLoginDAO.queryAccountLogin("+login.toString()+") error... :",e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
        }
        return alogin;
    }
    
    public ActionPage<AccountLogin> queryAccountLoginListPage(ActionPage<AccountLogin> page) throws ServiceException{
    	if (page == null)
        {
            throw new ServiceException(BusinessErrorCode.ARGS_IS_NULL_OR_EMPTY,
                    "必要参数为空");
        }
    	try {
			page.setTotal(accountLoginDAO.queryAccountLoginListCount());
			if (page.getCurrentPage() > page.getTotalPage())
			{
			    page.setCurrentPage(page.getTotalPage());
			}
			page.setRows(accountLoginDAO.queryAccountLoginList(page.builderDaoPage()));
		} catch (SQLException e) {
			logger.error("ERROR accountDAO.queryAccountListPage", e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
		}
    	return page;
    }
    
//    @Override
    public Integer insertAccountLogin(AccountLogin login)
    {
        try
        {
            accountLoginDAO.insertAccountLogin(login);
        }
        catch(SQLException e)
        {
            logger.error("accountLoginDAO.insertAccountLogin("+login.toString()+") error,msg :"+e.getMessage());
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
        }
        return null;
    }

//    @Override
    public Integer updateAccountLogin(AccountLogin login)
    {
        if(login.getId()==null){
            throw new ServiceException(BusinessErrorCode.ARGS_IS_NULL_OR_EMPTY, "必要参数为空");
        }
        try
        {
            accountLoginDAO.updateAccountLogin(login);
        }
        catch(SQLException e)
        {
            logger.error("accountLoginDAO.updateAccountLogin("+login.toString()+") error,msg :"+e.getMessage());
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知数据库错误");
        }
        return null;
    }

//    @Override
    public Integer updatePwdByNameOldPwd(String name, String oldPwd, String pwd)
    {
        int affect = 0;
        if (!StringUtils.hasText(name) || !StringUtils.hasText(oldPwd)
                || !StringUtils.hasText(pwd))
        {
            return affect;
        }
        // 使用MD5算法计算密码摘要
        oldPwd = MD5Wap.getMD5(oldPwd);
        pwd = MD5Wap.getMD5(pwd);
        try
        {
            affect = accountLoginDAO.updatePwdByNameOldPwd(name, oldPwd, pwd);
        }
        catch(SQLException e)
        {
            logger
                    .error("updatePwdByNameOldPwd(" + name + ", ***, ***)",
                            e);
            throw new ServiceException(DBErrorCode.UNKNOW_SQL_EX, "未知的数据库错误。");
        }
        return affect;
    }

}
