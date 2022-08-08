package com.dzq.service.impl;

import com.dzq.mapper.UserMapper;
import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        List<User> allUser = userMapper.findAllUser();
        return allUser;
    }
}
