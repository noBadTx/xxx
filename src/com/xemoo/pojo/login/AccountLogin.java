package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: AccountLogin
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiangzhiwei
 * @date 2014年11月3日 下午4:13:38
 * @version 1.0
 */
public class AccountLogin implements Serializable
{
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5331066037221393253L;

	/**
     * id
     */
    private Integer id;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 密码
     */
    private transient String pwd;
    
    /**
     * 账号类型 1:品牌运营者 2：管理员 3：app用户
     */
    private Integer type;
    
    /**
     * type=3时，表示app用户，用户id标识
     */
    private Integer userId;
    
    /**
     * 联系手机
     */
    private String phone;
    
    /**
     * 账号状态 1：启用  0：禁用
     */
    private Integer status;
    
    /**
     * 创建时间
     */
    private Date create;
    
    /**
     * 修改时间
     */
    private Date modify;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Date getModify() {
		return modify;
	}

	public void setModify(Date modify) {
		this.modify = modify;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AccountLogin [id=" + id + ", loginName=" + loginName
				+ ", type=" + type + ", userId=" + userId + ", phone=" + phone
				+ ", status=" + status + ", create=" + create + ", modify="
				+ modify + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((create == null) ? 0 : create.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((loginName == null) ? 0 : loginName.hashCode());
		result = prime * result + ((modify == null) ? 0 : modify.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountLogin other = (AccountLogin) obj;
		if (create == null) {
			if (other.create != null)
				return false;
		} else if (!create.equals(other.create))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		if (modify == null) {
			if (other.modify != null)
				return false;
		} else if (!modify.equals(other.modify))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
   
}
