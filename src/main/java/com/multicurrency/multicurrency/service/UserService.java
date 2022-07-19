package com.multicurrency.multicurrency.service;

import com.multicurrency.multicurrency.model.User;

import java.util.List;


public interface UserService {
    List<User> listAll();

    void saveUser(User user);

    void deleteUserById(long id);

    User getUserById(long id);
}
