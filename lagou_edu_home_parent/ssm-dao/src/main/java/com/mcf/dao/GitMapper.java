package com.mcf.dao;

import com.mcf.domain.User;

import java.util.List;

/**
 * @Author：MorningCoffee
 * @Version：1.0
 * @Description:
 */
public interface GitMapper {

    List<User> selectAllUser();
}
