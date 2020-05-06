package com.xhq.springboot.controller;

import com.xhq.springboot.model.User;
import com.xhq.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        User dbUser = userService.login(user);
        if(dbUser == null){

            return "index";
        }else{
            return "system";
        }


    }
}
