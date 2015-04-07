package com.xemoo.dao;

import com.xemoo.pojo.XAccount;

/**
 * 用户账户信息
 * 
 * @Type XAccountDao
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public interface XAccountDao {

	/**
	 * 查询账户信息
	 * 
	 * @param x
	 * @return
	 * @author Administrator
	 * @time 2014-11-6 上午10:34:57
	 */
	public XAccount queryXAccount(XAccount x);
}
