package com.example.redisspringboot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobleException {

    @ExceptionHandler(ClassNotFoundException.class)
	@ResponseBody
	public Map<String,Object> globleException(){
		Map<String,Object> map = new HashMap<>();
		map.put("code", 500);
		map.put("msg", "系统错误，请重试！");
		return map;
	}
}
