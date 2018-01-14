package com.example.redisspringboot.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户类")
public class User implements Serializable{

	/**
	 * 
	 */
	@ApiModelProperty()
	private static final long serialVersionUID = 5041607413917825751L;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
