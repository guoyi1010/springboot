package com.example.redisspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BizExceptionController {

	@ExceptionHandler(BizException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public BizCode bizException(BizException bizException){
		return bizException.getBizCode();
	} 
}
