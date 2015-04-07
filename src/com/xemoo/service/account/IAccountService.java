package com.xemoo.service.account;

import com.xemoo.pojo.login.AccountLogin;
import com.xemoo.pojo.login.AccountRole;

public interface IAccountService {
	/**
	 * 新建账号,需要同时新增账号信息和账号角色对应表信息
	 * @param aLogin
	 * @param aRole
	 */
	public void addAccount(AccountLogin aLogin, AccountRole aRole);
	
	/**
	 * 修改账号信息,需要同时修改账号信息和账号角色对应表信息
	 * @param aLogin
	 * @param aRole
	 */
	public void updateAccount(AccountLogin aLogin, AccountRole aRole);
	
	/**
	 * 删除账号信息,同上,亦即将2表状态同时改为失效
	 * @param aLogin
	 * @param aRole
	 */
	public void delAccount(AccountLogin aLogin, AccountRole aRole);
	
}
