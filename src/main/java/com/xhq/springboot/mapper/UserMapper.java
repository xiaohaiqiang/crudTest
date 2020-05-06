package com.xhq.springboot.mapper;


import com.xhq.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User login(User user);
}
