package com.example.redisspringboot.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration  
@EnableCaching//开启注解  
public class RedisConfigs extends CachingConfigurerSupport {
    @Bean
    public CacheManager cacheManager(RedisTemplate<?,?> redisTemplate) {
       CacheManager cacheManager = new RedisCacheManager(redisTemplate);
       return cacheManager;
    }

	//ssss
	//sssss
	//sssss
	//sssss//sssss
	//sssss
	//sssss
	//sssss
	//sssss
	//sssss
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
       RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
       redisTemplate.setConnectionFactory(factory);
       return redisTemplate;
    }
}
