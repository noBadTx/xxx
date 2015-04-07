package com.xemoo.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring
 * 
 * @date 2014-11-05
 * @author huxy
 * 
 */
public class SpringContextConf implements ApplicationContextAware {
	static ApplicationContext context = null;

	public void setApplicationContext(ApplicationContext appcontext)
			throws BeansException {
		context = appcontext;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext appcontext) {
		context = appcontext;
	}

	/**
	 * 获取bean
	 * 
	 * @param name
	 * @return
	 * @throws BeansException
	 * @author huxy
	 * @date 2014-11-05
	 */
	public static Object getBean(String name) throws BeansException {
		return context.getBean(name);
	}
}