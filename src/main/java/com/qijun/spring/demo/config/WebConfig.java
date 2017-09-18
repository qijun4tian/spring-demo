package com.qijun.spring.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by qijun123 on 2017/9/14.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.qijun.spring.demo.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
}
