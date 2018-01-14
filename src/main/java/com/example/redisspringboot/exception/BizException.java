package com.example.redisspringboot.exception;

public class BizException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BizCode bizCode;
	
	public BizException(BizCode bizCode){
		super(bizCode.getMsg());
		this.bizCode = bizCode;
	}
	
	public BizException(BizCode bizCode,Exception e){
		super(e);
		this.bizCode = bizCode;
	}

	public BizCode getBizCode() {
		return bizCode;
	}

	public void setBizCode(BizCode bizCode) {
		this.bizCode = bizCode;
	}
	
	
	

}
