package com.qijun.spring.demo.controller;

import com.qijun.spring.demo.service.UserPasswordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qijun123 on 2017/9/14.
 */
@RestController
@Slf4j
public class DemoController {
    @Autowired
    private UserPasswordService userPasswordService;
    @RequestMapping(path ="/greeting/{name}")

    public void greeting(@PathVariable("name") String name) {
        log.info("hello world");  log.info("hello world");
         userPasswordService.getUserPassword(name);
    }
}
