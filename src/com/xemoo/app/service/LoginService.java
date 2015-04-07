package com.xemoo.app.service;

import org.apache.log4j.Logger;

import com.xemoo.app.base.Service;

/**
 * 用户登陆
 * 
 * @Type LoginService
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class LoginService  implements Service{
	private static Logger logger = Logger.getLogger(LoginService.class);
	public String deal(String jsonStr) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("用户登陆:"+jsonStr);
		return null;
	}

}
