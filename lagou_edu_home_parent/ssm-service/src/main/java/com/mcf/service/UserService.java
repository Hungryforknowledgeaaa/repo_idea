package com.mcf.service;

import com.mcf.domain.User;

import java.util.List;

/**
 * @Author：MorningCoffee
 * @Version：1.0
 * @Description:
 */
public interface UserService {

    //查询所有用户
    List<User> selectAllUser();
}
