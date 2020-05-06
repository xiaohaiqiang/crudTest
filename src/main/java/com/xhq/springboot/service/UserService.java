package com.xhq.springboot.service;

import com.xhq.springboot.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User login(User user);
}
