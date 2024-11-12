package com.registerform.service;

import com.registerform.entity.User;
import com.registerform.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo repo;


    @Override
    public void registerUser(User user) {
        repo.save(user);

    }
}
