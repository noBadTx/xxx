package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DisplayRole implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2458846712567445581L;

	/**
     * @Fields id : 主键
     */
    private Integer id;

    /**
     * @Fields name : 角色名称
     */
    private String name;

    /**
     * @Fields status : 状态   1:正常  0：已删除
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
    
    /**
     * 权限描述
     */
    private String roleDisp;
    
    /**
     * 权限中间表list
     */
    private List<RoleMoudle> moudles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRoleDisp() {
		return roleDisp;
	}

	public void setRoleDisp(String roleDisp) {
		this.roleDisp = roleDisp;
	}

	public List<RoleMoudle> getMoudles() {
		return moudles;
	}

	public void setMoudles(List<RoleMoudle> moudles) {
		this.moudles = moudles;
	}
    
}
