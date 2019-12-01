package com.vs.demo.service;

import java.util.List;

import com.vs.demo.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
