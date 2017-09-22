package com.qijun.spring.demo.mapper;

import com.qijun.spring.demo.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by qijun123 on 2017/9/16.
 */
@Repository
public interface UserPasswordMapper {
    UserInfo getUserPassword(String userName);
}
