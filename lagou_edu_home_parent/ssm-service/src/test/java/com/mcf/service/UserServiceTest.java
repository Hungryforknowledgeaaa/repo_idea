package com.mcf.service;

import com.mcf.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author：MorningCoffee
 * @Version：1.0
 * @Description:
 */
public class UserServiceTest {

    @Test
    public void selectAllUser() {
        UserService userService = new UserServiceImpl();
        userService.selectAllUser();
    }
}