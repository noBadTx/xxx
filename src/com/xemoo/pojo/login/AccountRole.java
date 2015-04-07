package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: AccountRole
 * @Description: 账号角色对应关系实体
 * @author xiangzhiwei
 * @date 2014年11月3日 下午4:13:38
 * @version 1.0
 */
public class AccountRole implements Serializable
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
     * 账号id
     */
    private Integer accountId;
    
    /**
     * 角色id
     */
    private Integer roleId;
    
    /**
     * 来源即brand_id
     */
    private Integer brandId;
    
    /**
     * 账号状态 1：有效  0：无效
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

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((create == null) ? 0 : create.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modify == null) ? 0 : modify.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		AccountRole other = (AccountRole) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
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
		if (modify == null) {
			if (other.modify != null)
				return false;
		} else if (!modify.equals(other.modify))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountRole [id=" + id + ", accountId=" + accountId
				+ ", roleId=" + roleId + ", brandId=" + brandId
				+ ", status=" + status
				+ ", create=" + create + ", modify=" + modify + "]";
	}
    
    
}
