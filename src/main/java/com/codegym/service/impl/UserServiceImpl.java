package com.codegym.service.impl;

import com.codegym.model.Users;
import com.codegym.repository.IUserSpringDataRepository;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    IUserSpringDataRepository userRepository;

    @Override
    public Iterable<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public Users findById(Long id) {
        Users users = userRepository.findOne(id);
        return users;
    }

    @Override
    public void remove(Long id) {
        userRepository.delete(id);
    }

}

