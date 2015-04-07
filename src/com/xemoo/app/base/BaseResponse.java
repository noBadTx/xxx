package com.xemoo.app.base;

/**
 * 返回基类
 * 
 * @Type BaseResponse
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class BaseResponse {
	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 错误消息
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private String info;
	 

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
