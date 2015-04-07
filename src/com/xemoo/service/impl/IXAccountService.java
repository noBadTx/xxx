package com.xemoo.service.impl;

import com.xemoo.dao.XAccountDao;
import com.xemoo.pojo.XAccount;
import com.xemoo.service.XAccountService;

/**
 * 账户
 * 
 * @Type IXAccountService
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class IXAccountService implements XAccountService{

	private XAccountDao xAccountDao;
	
	public XAccount login(XAccount x) {
		// TODO Auto-generated method stub
		return xAccountDao.queryXAccount(x);
	}

	public XAccountDao getxAccountDao() {
		return xAccountDao;
	}

	public void setxAccountDao(XAccountDao xAccountDao) {
		this.xAccountDao = xAccountDao;
	}

	
}
