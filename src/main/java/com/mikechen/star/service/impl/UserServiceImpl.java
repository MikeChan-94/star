package com.mikechen.star.service.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mikechen.star.entity.User;
import com.mikechen.star.mapper.UserMapper;
import com.mikechen.star.service.UserService;
import com.mikechen.star.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(UserVO userVO) {
        User user = new User();
        user.setName(userVO.getName());
        user.setCreateTime(DateUtil.date());
        user.setUpdateTime(DateUtil.date());
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectById(id);
    }
}
