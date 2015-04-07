package com.xemoo.app.base;

import java.lang.reflect.Method;

/**
 * 基类
 * 
 * @Type ServiceExecuter
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class ServiceExecuter {

private Object obj;

private Method method;


public ServiceExecuter(Object obj, Method method) {
	super();
	this.obj = obj;
	this.method = method;
}

public String executer(Object...arrs) throws Exception
{
   return	(String) method.invoke(obj,arrs);
}

public Object getObj() {
	return obj;
}

}
