package com.lee.dao;

import com.lee.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();

    int delete(int id);

     void insert(User user);
}
