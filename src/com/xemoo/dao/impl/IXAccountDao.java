package com.xemoo.dao.impl;

import java.sql.SQLException;

import com.xemoo.base.BaseDAO;
import com.xemoo.base.SQLManager;
import com.xemoo.dao.XAccountDao;
import com.xemoo.pojo.XAccount;

/**
 * 实现类
 * 
 * @Type IXAccountDao
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class IXAccountDao extends BaseDAO implements XAccountDao {

	public XAccount queryXAccount(XAccount x) {
		// TODO Auto-generated method stub
		try {
			Object obj = this.queryForObject(
					SQLManager.GET_X_ACCOUNT_LOGIN_INFO, x);
			if (obj != null) {
				return (XAccount) obj;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
