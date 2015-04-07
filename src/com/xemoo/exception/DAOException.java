package com.xemoo.exception;

/**
 * @description class
 * @author yejunwei
 * @date 2013年12月1日 下午7:10:50
 */
public class DAOException extends Exception{

	private static final long serialVersionUID = 2733238507329051043L;

	public DAOException(){
		super();
	}
	
	public DAOException(String msg){
		super(msg);
	}
	
	public DAOException(Throwable cause){
		super(cause);
	}
	
	public DAOException(String msg, Throwable cause){
		super(msg, cause);
	}
}

