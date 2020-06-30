package net.zhaoqing.shopmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;
    @Autowired
    private RedisTemplate<String, Serializable> serializableRedisTemplate;


    public void testString() {
        strRedisTemplate.opsForValue().set("strKey", "zwqh");
        String value =(strRedisTemplate.opsForValue().get("strKey"));

        System.out.println(value);
    }

}
