package com.mcf.dao;

import com.mcf.domain.User;

import java.util.List;

/**
 * @Author：MorningCoffee
 * @Version：1.0
 * @Description:
 */
public interface UserMapper {

    //查询所有信息
    List<User> selectAllUser();
}
