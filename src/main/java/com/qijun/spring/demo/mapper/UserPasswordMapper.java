package com.qijun.spring.demo.mapper;

import org.springframework.stereotype.Repository;

/**
 * Created by qijun123 on 2017/9/16.
 */
@Repository
public interface UserPasswordMapper {
    String getUserPassword(String userName);
}
