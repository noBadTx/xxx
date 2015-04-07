package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Date;

/** 
* @ClassName: Role 
* @Description: 角色
* @author tangtianyun 
* @date 2013-12-4 上午10:48:13 
* @version 1.0 
*/
public class RoleMoudle implements Serializable
{
    /**
     * @Fields serialVersionUID : 序列化ID
     */
    private static final long serialVersionUID = 236567421895926737L;

    /**
     * @Fields id : 主键
     */
    private Integer id;
    
    /**
     * 前端roleId
     */
    private Integer fRoleId;
    
    /**
     * roleId 角色
     */
    private Role role;

    /**
     * @Fields status : 状态
     */
    private int status;

    /**
     * @Fields create : 创建时间
     */
    private Date create;

    /**
     * @Fields modify : 修改时间
     */
    private Date modify;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getfRoleId() {
		return fRoleId;
	}

	public void setfRoleId(Integer fRoleId) {
		this.fRoleId = fRoleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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
		result = prime * result + ((create == null) ? 0 : create.hashCode());
		result = prime * result + ((fRoleId == null) ? 0 : fRoleId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modify == null) ? 0 : modify.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + status;
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
		RoleMoudle other = (RoleMoudle) obj;
		if (create == null) {
			if (other.create != null)
				return false;
		} else if (!create.equals(other.create))
			return false;
		if (fRoleId == null) {
			if (other.fRoleId != null)
				return false;
		} else if (!fRoleId.equals(other.fRoleId))
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
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoleMoudle [id=" + id + ", fRoleId=" + fRoleId + ", role="
				+ role + ", status=" + status + ", create=" + create
				+ ", modify=" + modify + "]";
	}

    
}
