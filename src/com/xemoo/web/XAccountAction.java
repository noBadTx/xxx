package com.xemoo.web;

import org.apache.struts2.ServletActionContext;

import com.xemoo.base.BaseAction;
import com.xemoo.base.Config;
import com.xemoo.pojo.XAccount;
import com.xemoo.service.XAccountService;

/**
 * 用户账户信息
 * 
 * @Type XAccountAction
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class XAccountAction extends BaseAction {
	private static final long serialVersionUID = 2280833481215419167L;
	private XAccountService xAccountService;

	/**
	 * 用户登陆
	 * 
	 * @return
	 * @author Administrator
	 * @time 2014-11-6 上午10:57:07
	 */
	public String login() {
		String login_name = getStrValue("userName");
		String login_pwd = getStrValue("userPwd");
		XAccount x = new XAccount();
		x.setAccount_login_name(login_name);
		x.setAccount_type(1);
		XAccount back = xAccountService.login(x);
		if (back == null) {
			return Config.ERROR;
		} else {
			String backPwd = back.getAccount_pwd();
			if (backPwd.equals(login_pwd)) {
				this.getRequest().getSession().setAttribute("userInfo", back);
				getRequest().setAttribute("userInfo", back);
				return Config.OK;
			} else {
				return Config.ERROR;
			}
		}
	}

	/**
	 * 退出
	 * 
	 * @return
	 * @author huxy
	 * @time 2014-11-6 下午4:23:20
	 */
	public String backout() {
		ServletActionContext.getRequest().getSession()
				.removeAttribute("userInfo");
		return Config.ERROR;
	}

	public void setxAccountService(XAccountService xAccountService) {
		this.xAccountService = xAccountService;
	}

}
