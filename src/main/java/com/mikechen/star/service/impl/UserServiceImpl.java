package com.mikechen.star.service.impl;

import com.mikechen.star.entity.User;
import com.mikechen.star.mapper.UserMapper;
import com.mikechen.star.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author chenweijian
 * @since 2020-11-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
