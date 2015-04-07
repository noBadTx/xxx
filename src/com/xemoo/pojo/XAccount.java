package com.xemoo.pojo;

/**
 * 账户信息表
 * 
 * @Type XAccount
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class XAccount {
	/**
	 * id
	 */
	private long account_id;
	/**
	 * 对于用户id
	 */
	private long account_user_id;

	/**
	 * 登陆名
	 */
	private String account_login_name;
	/**
	 * 密码
	 */
	private String account_pwd;
	/**
	 * 电话
	 */
	private String account_phone;

	/**
	 * mac
	 */
	private String account_mac;
	/**
	 * 创建时间
	 */
	private String account_create;
	/**
	 * 修改时间
	 */
	private String account_modify;

	/**
	 * 账号类型 1:管理员 2:app用户
	 */
	private int account_type;
	/**
	 * 状态1：启用 0：禁用 -1：删除
	 */
	private int account_status;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getAccount_user_id() {
		return account_user_id;
	}

	public void setAccount_user_id(long account_user_id) {
		this.account_user_id = account_user_id;
	}

	public String getAccount_login_name() {
		return account_login_name;
	}

	public void setAccount_login_name(String account_login_name) {
		this.account_login_name = account_login_name;
	}

	public String getAccount_pwd() {
		return account_pwd;
	}

	public void setAccount_pwd(String account_pwd) {
		this.account_pwd = account_pwd;
	}

	public String getAccount_phone() {
		return account_phone;
	}

	public void setAccount_phone(String account_phone) {
		this.account_phone = account_phone;
	}

	public String getAccount_mac() {
		return account_mac;
	}

	public void setAccount_mac(String account_mac) {
		this.account_mac = account_mac;
	}

	public String getAccount_create() {
		return account_create;
	}

	public void setAccount_create(String account_create) {
		this.account_create = account_create;
	}

	public String getAccount_modify() {
		return account_modify;
	}

	public void setAccount_modify(String account_modify) {
		this.account_modify = account_modify;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}

	public int getAccount_status() {
		return account_status;
	}

	public void setAccount_status(int account_status) {
		this.account_status = account_status;
	}

}
