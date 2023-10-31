package com.ydlclass.dao;

import com.ydlclass.entity.User;

import java.util.List;

public interface IUserDao {
    User selectById(int id);
    List<User> selectAll();
}
