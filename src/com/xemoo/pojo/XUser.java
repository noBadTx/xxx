package com.xemoo.pojo;

import java.math.BigDecimal;

/**
 * 用户信息表
 * 
 * @Type XUser
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class XUser {
	/**
	 * 用户id
	 */
	private long user_id;
	/**
	 * 姓名
	 */
	private String user_name;
	/**
	 * 用户图像
	 */
	private String user_img;
	/**
	 * 出生时间
	 */
	private String user_birth;
	/**
	 * 住家城市
	 */
	private String user_city;
	/**
	 * 手机号码
	 */
	private String user_phone;
	/**
	 * 支付宝账户
	 */
	private String user_alipay_no;
	/**
	 * 邀请码
	 */
	private String user_invitation_code;
	/**
	 * 注册时间
	 */
	private String user_create;

	/**
	 * 婚姻状况 1:单身 2:未婚 3:已婚 4:分居 5:离婚 6:丧偶
	 */
	private int user_marriage;
	/**
	 * 有多少孩子 0:0 1:1 2:2 3:3 4:4 5:5 6:5+
	 */
	private int user_children;
	/**
	 * 性别 1：男 2：女
	 */
	private int user_sex;
	/**
	 * 教育程度
	 */
	private int user_education;
	/**
	 * 职业
	 */
	private int user_occupation;
	/**
	 * 激活状态
	 */
	private int user_invitation_state;
	/**
	 * 用户状态
	 */
	private int state;

	/**
	 * 用户收入
	 */
	private BigDecimal user_my_income;
	/**
	 * 家庭收入
	 */
	private BigDecimal user_home_income;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_img() {
		return user_img;
	}

	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_city() {
		return user_city;
	}

	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_alipay_no() {
		return user_alipay_no;
	}

	public void setUser_alipay_no(String user_alipay_no) {
		this.user_alipay_no = user_alipay_no;
	}

	public String getUser_invitation_code() {
		return user_invitation_code;
	}

	public void setUser_invitation_code(String user_invitation_code) {
		this.user_invitation_code = user_invitation_code;
	}

	public String getUser_create() {
		return user_create;
	}

	public void setUser_create(String user_create) {
		this.user_create = user_create;
	}

	public int getUser_marriage() {
		return user_marriage;
	}

	public void setUser_marriage(int user_marriage) {
		this.user_marriage = user_marriage;
	}

	public int getUser_children() {
		return user_children;
	}

	public void setUser_children(int user_children) {
		this.user_children = user_children;
	}

	public int getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(int user_sex) {
		this.user_sex = user_sex;
	}

	public int getUser_education() {
		return user_education;
	}

	public void setUser_education(int user_education) {
		this.user_education = user_education;
	}

	public int getUser_occupation() {
		return user_occupation;
	}

	public void setUser_occupation(int user_occupation) {
		this.user_occupation = user_occupation;
	}

	public int getUser_invitation_state() {
		return user_invitation_state;
	}

	public void setUser_invitation_state(int user_invitation_state) {
		this.user_invitation_state = user_invitation_state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public BigDecimal getUser_my_income() {
		return user_my_income;
	}

	public void setUser_my_income(BigDecimal user_my_income) {
		this.user_my_income = user_my_income;
	}

	public BigDecimal getUser_home_income() {
		return user_home_income;
	}

	public void setUser_home_income(BigDecimal user_home_income) {
		this.user_home_income = user_home_income;
	}

}
