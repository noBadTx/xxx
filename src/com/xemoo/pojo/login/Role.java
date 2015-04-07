package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.xemoo.formatter.ISOLongDateSerializer;
/** 
* @ClassName: Role 
* @Description: 角色
* @author tangtianyun 
* @date 2013-12-4 上午10:48:13 
* @version 1.0 
*/
public class Role implements Serializable
{
    /**
     * @Fields serialVersionUID : 序列化ID
     */
    private static final long serialVersionUID = 236567421895926737L;

    /**
     * @Fields id : 主键
     */
    private int id;

    /**
     * @Fields name : 角色名称
     */
    private String name;

    /**
     * @Fields parentId : 角色父ID
     */
    private int parentId;

    /**
     * @Fields status : 状态
     */
    private int status;

    /**
     * @Fields type : 类型
     */
    private int type;

    /**
     * @Fields create : 创建时间
     */
    private Date create;

    /**
     * @Fields modify : 修改时间
     */
    private Date modify;
    
	/**
     * @Fields 角色所有权限列表
     */
    private List<Permission> permissions;
    
    public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getParentId()
    {
        return parentId;
    }

    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public Date getCreate()
    {
        return create;
    }

    @JsonSerialize(using = ISOLongDateSerializer.class)
    public void setCreate(Date create)
    {
        this.create = create;
    }
    
    @JsonSerialize(using = ISOLongDateSerializer.class)
    public Date getModify()
    {
        return modify;
    }

    public void setModify(Date modify)
    {
        this.modify = modify;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((create == null) ? 0 : create.hashCode());
        result = prime * result + id;
        result = prime * result + ((modify == null) ? 0 : modify.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + parentId;
        result = prime * result
                + ((permissions == null) ? 0 : permissions.hashCode());
        result = prime * result + status;
        result = prime * result + type;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Role other = (Role) obj;
        if (create == null)
        {
            if (other.create != null)
                return false;
        }
        else if (!create.equals(other.create))
            return false;
        if (id != other.id)
            return false;
        if (modify == null)
        {
            if (other.modify != null)
                return false;
        }
        else if (!modify.equals(other.modify))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (parentId != other.parentId)
            return false;
        if (permissions == null)
        {
            if (other.permissions != null)
                return false;
        }
        else if (!permissions.equals(other.permissions))
            return false;
        if (status != other.status)
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Role [id=" + id + ", name=" + name + ", parentId=" + parentId
                + ", status=" + status + ", type=" + type + ", create="
                + create + ", modify=" + modify + ", permissions="
                + permissions + "]";
    }

}
