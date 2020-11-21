package com.mikechen.star.service;

import com.mikechen.star.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mikechen.star.mapper.UserMapper;
import com.mikechen.star.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author chenweijian
 * @since 2020-11-21
 */
public interface UserService extends IService<User> {

    void add(UserVO userVO);

    User getUserById(Integer id);
}
