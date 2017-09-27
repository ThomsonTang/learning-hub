package com.ihabitat.learninghub.controller;

import com.ihabitat.learninghub.repo.User;
import com.ihabitat.learninghub.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器.
 *
 * @author Thomson Tang
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public User getUser(Long id) {
        return userService.getUserById(id);
    }
}
