package com.qijun.spring.demo.service.impl;

import com.qijun.spring.demo.mapper.UserPasswordMapper;
import com.qijun.spring.demo.service.UserPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qijun123 on 2017/9/16.
 */
@Service
public class UserPasswordServiceImpl implements UserPasswordService {
    @Autowired
    UserPasswordMapper userPasswordMapper;
    @Override
    public String getUserPassword(String userName) {
        return userPasswordMapper.getUserPassword(userName);
    }
}
