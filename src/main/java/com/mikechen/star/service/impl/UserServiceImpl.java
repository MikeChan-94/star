package com.mikechen.star.service.impl;

import com.mikechen.star.entity.User;
import com.mikechen.star.mapper.UserMapper;
import com.mikechen.star.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
    *  查询表user所有信息
    */
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    /**
    *  根据主键id查询表user信息
    *  @param id
    */
    @Override
    public User findUserByid(@Param("id") Integer id) {
        return userMapper.findUserByid(id);
    }

    /**
    *  根据条件查询表user信息
    *  @param user
    */
    @Override
    public List<User> findUserByCondition(User user) {
        return userMapper.findUserByCondition(user);
    }

    /**
    *  根据主键id查询表user信息
    *  @param id
    */
    @Override
    public Integer deleteUserByid(@Param("id") Integer id) {
        return userMapper.deleteUserByid(id);
    }

    /**
    *  根据主键id更新表user信息
    *  @param user
    */
    @Override
    public Integer updateUserByid(User user) {
        return userMapper.updateUserByid(user);
    }

    /**
    *  新增表user信息
    *  @param user
    */
    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

}