package com.qijun.spring.demo.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by qijun123 on 2017/9/14.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.qijun.spring.demo.controller")
public class WebConfig extends WebMvcConfigurerAdapter{
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.forEach(converter -> {
//            if (converter.getClass().equals(MappingJackson2HttpMessageConverter.class)) {
//                ObjectMapper om = ((MappingJackson2HttpMessageConverter) converter).getObjectMapper();
//                om.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
//                SimpleModule module = new SimpleModule("PageListJSONModule", new Version(1, 0, 0, null, null, null));
//                module.addSerializer(PageList.class, new PageListJsonSerializer(om));
//                om.registerModule(module);
//            }
//        });
//    }
}
