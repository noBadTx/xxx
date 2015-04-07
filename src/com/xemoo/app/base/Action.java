package com.xemoo.app.base;

/**
 * Action 属性
 * 
 * @Type Action
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class Action {

	private String msgType;

	private String service;

	private String method;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMethod() {
		return method == null ? "deal" : method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
