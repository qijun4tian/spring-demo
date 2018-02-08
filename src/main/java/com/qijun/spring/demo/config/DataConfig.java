package com.qijun.spring.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by qijun123 on 2017/9/17.
 */
@Configuration
@ComponentScan(basePackages= "com.qijun.spring.demo.*")
@ImportResource("classpath:spring_config.xml")
public class DataConfig {
}
