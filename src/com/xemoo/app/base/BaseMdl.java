package com.xemoo.app.base;

/**
 * 基类
 * 
 * @Type BaseMdl
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class BaseMdl {
	/**
	 * 接口名
	 */
	private String action;

	/**
	 * 传递信息
	 */
	private String info;


	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
