package com.mikechen.star.mapper;

import com.mikechen.star.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
    *  查询表user所有信息
    */
    List<User> findAllUser();

    /**
    *  根据主键id查询表user信息
    *  @param id
    */
    User findUserByid(@Param("id") Integer id);

    /**
    *  根据条件查询表user信息
    *  @param user
    */
    List<User> findUserByCondition(User user);

    /**
    *  根据主键id查询表user信息
    *  @param id
    */
    Integer deleteUserByid(@Param("id") Integer id);

    /**
    *  根据主键id更新表user信息
    *  @param user
    */
    Integer updateUserByid(User user);

    /**
    *  新增表user信息
    *  @param user
    */
    Integer addUser(User user);

}