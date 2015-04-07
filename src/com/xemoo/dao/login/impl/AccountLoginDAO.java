package com.xemoo.dao.login.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xemoo.base.BaseDAO;
import com.xemoo.base.SQLManager;
import com.xemoo.constant.Status;
import com.xemoo.dao.login.IAccountLoginDAO;
import com.xemoo.pojo.DaoPage;
import com.xemoo.pojo.login.AccountLogin;

/** 
 * @ClassName: AccountLoginDAO 
 * @Description: 
 * @author xiangzhiwei
 * @date 2014年4月2日 下午2:30:42 
 * @version 1.0 
 */
@Repository
public class AccountLoginDAO extends BaseDAO implements IAccountLoginDAO 
{

    public AccountLogin queryAccountLogin(AccountLogin login) throws SQLException
    {
        AccountLogin alogin = null;
        alogin = (AccountLogin)queryForObject(SQLManager.ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN, login);
        return alogin;
    }

    public Integer insertAccountLogin(AccountLogin login) throws SQLException
    {
        int recode = Status.FAIL;
        Object obj = this.insert(SQLManager.ACCOUNT_LOGIN_INSERT_ACCOUNT_LOGIN,
                login);
        if (obj != null)
            recode = Status.SUCCESS;
        return recode;
    }

    public Integer updateAccountLogin(AccountLogin login) throws SQLException
    {
        int recode = Status.FAIL;
        recode = update(SQLManager.ACCOUNT_LOGIN_UPDATE_ACCOUNT_LOGIN, login);
        return recode;
    }

    public Integer updatePwdByNameOldPwd(String name, String oldPwd, String pwd) throws SQLException
    {
        Map<String, String> params = new HashMap<String, String>(3);
        params.put("loginName", name);
        params.put("oldPwd", oldPwd);
        params.put("pwd", pwd);
        return super.update(SQLManager.ACCOUNT_LOGIN_UPDATE_PWD_BY_NAME_AND_OLDPWD, params);
    }

	public List<AccountLogin> queryAccountLoginList(DaoPage daoPage)
			throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>(1);
        map.put(SQLManager.PAGE_NAME, daoPage);
        return (List<AccountLogin>) this.queryForList(
        		SQLManager.ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN_LIST, map);
	}

	public Integer queryAccountLoginListCount() throws SQLException {
		Integer count = 0;
		count = (Integer)this.queryForObject(
				SQLManager.ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN_LIST_COUNT, null);
		return count;
	}
	
}
