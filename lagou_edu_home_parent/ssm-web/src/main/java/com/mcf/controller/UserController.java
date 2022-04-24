package com.mcf.controller;

import com.mcf.domain.User;
import com.mcf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author：MorningCoffee
 * @Version：1.0
 * @Description:
 */

@RestController  // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAllUser")
    public List<User> selectAllUser(){
        List<User> users = userService.selectAllUser();
        return users;
    }

}