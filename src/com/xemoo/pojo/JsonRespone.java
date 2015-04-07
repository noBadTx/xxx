package com.xemoo.pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JsonRespone implements Serializable
{
    
    private int code;

    private String msg;
    
    /** 分装对象*/
    private Object object;
    
    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }

    public int getCode()
    {
        return code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public void setCode(int code)
    {
        this.code = code;
    }
}