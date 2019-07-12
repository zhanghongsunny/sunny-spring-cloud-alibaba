package com.sunny.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @版权: Copyright (c) 2019
 * @公司:
 * @author: zhanghong
 * @版本: 1.0
 * @创建日期: 2019-07-12
 * @创建时间: 10:10
 **/
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message) {
        return "Hello Nacos Discovery " + message + " i am from port " + port;
    }

}
