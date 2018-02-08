package com.qijun.spring.demo.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 祁军
 */
public class String2DateConvert implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }


}
