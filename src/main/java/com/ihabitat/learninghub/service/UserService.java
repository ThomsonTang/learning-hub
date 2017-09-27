package com.ihabitat.learninghub.service;

import com.ihabitat.learninghub.repo.User;
import com.ihabitat.learninghub.repo.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑服务类
 *
 * @author Thomson Tang
 */
@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

}
