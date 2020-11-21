package com.mikechen.star.controller;


import com.mikechen.star.entity.User;
import com.mikechen.star.service.UserService;
import com.mikechen.star.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author chenweijian
 * @since 2020-11-21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void add(@RequestBody UserVO userVO) {
        userService.add(userVO);
    }

    @GetMapping("/get")
    public User get(@RequestBody UserVO userVO) {
        return userService.getUserById(userVO.getId());
    }

}

