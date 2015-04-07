package com.xemoo.app.base;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求转发
 * 
 * @Type ServiceManage
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class ServiceManage {

	private final Map<String, ServiceExecuter> map = new ConcurrentHashMap<String, ServiceExecuter>();

	private static ServiceManage instanse = new ServiceManage();

	public static ServiceManage getInstanse() {
		return instanse;
	}

	private ServiceManage() {

	}

	public void add(String string, ServiceExecuter executer) {
		map.put(string, executer);
	}

	public String deal(String name, String jsonStr) {
		String r = "";
		try {
			r = map.get(name).executer(jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

	public void deal(String name, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			map.get(name).executer(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String dealStr(String name, HttpServletRequest request) {
		String r = "";
		try {
			ServiceExecuter executer = map.get(name);
			Method method = executer.getObj().getClass()
					.getMethod("dealStr", HttpServletRequest.class);
			r = (String) method.invoke(executer.getObj(), request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

}
