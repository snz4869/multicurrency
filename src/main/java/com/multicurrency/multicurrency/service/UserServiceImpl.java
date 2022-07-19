package com.multicurrency.multicurrency.service;

import com.multicurrency.multicurrency.model.User;
import com.multicurrency.multicurrency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id) {
        this.userRepository.deleteById(id);

    }

    @Override
    public User getUserById(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User Tidak Ditemukan"));
        return user;
    }
}
