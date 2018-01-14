package com.example.redisspringboot.exception;

import java.io.Serializable;

public class BizCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;//错误代码
	private String msg;//错误信息
	
	
	public BizCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BizCode(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
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
	@Override
	public String toString() {
		return "SizCode [code=" + code + ", msg=" + msg + "]";
	}
	
	
	

}
