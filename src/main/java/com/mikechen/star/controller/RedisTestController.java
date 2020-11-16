package com.mikechen.star.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/get")
    public String getString() {
        return redisTemplate.opsForValue().get("k1").toString();
    }

}
