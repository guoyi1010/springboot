package com.example.redisspringboot.service;

public interface RedisServices {

    public void set(String key, Object value);  

    public Object get(String key);  

}
