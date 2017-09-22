package com.qijun.spring.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by qijun123 on 2017/9/22.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@XmlRootElement
public class UserInfo {
    private int id;
    private String name;
}
