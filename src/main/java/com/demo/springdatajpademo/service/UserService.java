package com.demo.springdatajpademo.service;

import com.demo.springdatajpademo.domain.User;
import com.demo.springdatajpademo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User queryUser(String username){

        return userRepository.findUserByUsername(username);
    }
}
