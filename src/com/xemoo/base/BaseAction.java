package com.xemoo.base;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 基类
 * 
 * @Type BaseAction
 * @author huxy
 * @date 2014-11-05
 * @Version V1.0
 */
public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {

	private static final long serialVersionUID = 1L;
	private HttpServletRequest request = ServletActionContext.getRequest();
	private HttpServletResponse response = ServletActionContext.getResponse();

	protected void out(String str) {
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.println(str);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void printMsg(String returnCode, String errorNo, String errorInfo) {
		out("{\"returnCode\":\"" + returnCode + "\",\"errorNo\":\"" + errorNo
				+ "\",\"errorInfo\":\"" + errorInfo + "\"}");
	}

	protected void printJSON(String[] paramsName, Object[] paramsValue) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (paramsName == null || paramsValue == null
				|| paramsName.length != paramsValue.length) {
			return;
		}
		int len = paramsName.length;
		for (int i = 0; i < len; i++) {
			map.put(paramsName[i], paramsValue[i]);
		}
		JSONObject jsonObject = JSONObject.fromObject(map);
		out(jsonObject.toString());
	}

	protected void printJSON(String paramsName, Object paramsValue) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(paramsName, paramsValue);
		JSONObject jsonObject = JSONObject.fromObject(map);
		out(jsonObject.toString());
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getStrValue(String paramName) {
		return this.getRequest().getParameter(paramName);
	}

}
