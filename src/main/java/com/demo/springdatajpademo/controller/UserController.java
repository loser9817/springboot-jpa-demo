package com.demo.springdatajpademo.controller;

import com.demo.springdatajpademo.domain.User;
import com.demo.springdatajpademo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    @ResponseBody
    public User query(@PathVariable("username") String username) {

        logger.info("username={}",username);

        return userService.queryUser(username);
    }
}
