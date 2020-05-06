package com.xhq.springboot.service;

import com.xhq.springboot.mapper.UserMapper;
import com.xhq.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User dbUser = userMapper.login(user);

        return dbUser;
    }
}
