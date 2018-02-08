package com.qijun.spring.demo;

import com.qijun.spring.demo.config.DataConfig;
import com.qijun.spring.demo.config.WebConfig;
import com.qijun.spring.demo.convert.String2Date;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

/**
 * Created by qijun123 on 2018/2/8.
 */
@Slf4j
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {DataConfig.class, WebConfig.class})
public class TestConvert {
    @Autowired
    private String2Date string2Date;
    @Test
    public void testConvert(){
        if(string2Date.getDate() instanceof Date){
            System.out.println("convert work");
        }

    }


}
