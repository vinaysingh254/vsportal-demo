package com.vs.demo.dao;

import java.util.List;

import com.vs.demo.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
