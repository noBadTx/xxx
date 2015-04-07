package com.xemoo.service;

import com.xemoo.pojo.XAccount;

/**
 * 账户信息
 * 
 * @Type XAccountService
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public interface XAccountService {

	/**
	 * 用户登陆
	 * 
	 * @param x
	 * @return
	 * @author Administrator
	 * @time 2014-11-6 上午10:44:26
	 */
	public XAccount login(XAccount x);

}
