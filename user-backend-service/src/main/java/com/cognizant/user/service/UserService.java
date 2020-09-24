package com.cognizant.user.service;

import java.util.List;

import com.cognizant.user.entity.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(Integer id);

    User update(User user);
}
