package com.mikechen.star.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {


    @RequestMapping("/get")
    public String getString() {
        return null;
    }

}
