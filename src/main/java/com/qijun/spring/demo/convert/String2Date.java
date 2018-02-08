package com.qijun.spring.demo.convert;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author 祁军
 */



@Data
@AllArgsConstructor
public class String2Date{
    private Date date;

}

