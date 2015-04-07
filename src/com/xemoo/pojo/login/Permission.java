package com.xemoo.pojo.login;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

/** 
* @ClassName: Permission 
* @Description: 角色权限映射关系
* @author tangtianyun 
* @date 2013-12-4 上午10:53:23 
* @version 1.0 
*/
public class Permission implements Serializable
{

    /**
     * @Fields serialVersionUID : 序列化ID
     */
    private static final long serialVersionUID = 7966234108495448494L;

    /**
     * @Fields id : 主键
     */
    private int id;

    /**
     * 权限key
     */
    private String key;
    
    /**
     * @Fields name : 权限名称
     */
    private String name;

    /**
     * @Fields resource : 资源URL
     */
    private String resource;

    /**
     * @Fields parentId : 父ID
     */
    private int parentId;

    /**
     * @Fields type : 类型 1-url 2-按钮 3-资源
     */
    private int type;

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

    /**
     * 是否有权限
     */
    private Boolean selected;
    
    /**
     * 排序
     */
    private Integer order;
    
    /** 
     * @return order 
     */
    public Integer getOrder()
    {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Integer order)
    {
        this.order = order;
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

    public String getResource()
    {
        return resource;
    }

    public void setResource(String resource)
    {
        this.resource = resource;
    }

    public int getParentId()
    {
        return parentId;
    }

    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public Date getCreate()
    {
        return create;
    }

    public void setCreate(Date create)
    {
        this.create = create;
    }

    public Date getModify()
    {
        return modify;
    }

    public void setModify(Date modify)
    {
        this.modify = modify;
    }
    

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public Boolean getSelected()
    {
        return selected;
    }

    public void setSelected(Boolean selected)
    {
        this.selected = selected;
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
        Permission other = (Permission) obj;
        if (create == null)
        {
            if (other.create != null)
                return false;
        }
        else if (!create.equals(other.create))
            return false;
        if (id != other.id)
            return false;
        if (key == null)
        {
            if (other.key != null)
                return false;
        }
        else if (!key.equals(other.key))
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
        if (resource == null)
        {
            if (other.resource != null)
                return false;
        }
        else if (!resource.equals(other.resource))
            return false;
        if (status != other.status)
            return false;
        if (type != other.type)
            return false;
        return true;
    }
    
}
