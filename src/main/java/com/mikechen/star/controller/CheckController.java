package com.mikechen.star.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    /*@Value("${star.name}")
    private String name;*/

    @GetMapping("/check")
    public String check() {
        return "success";
    }

}
