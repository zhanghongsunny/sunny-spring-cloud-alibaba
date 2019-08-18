package com.sunny.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @描述:
 * @版权: Copyright (c) 2019
 * @公司:
 * @author: zhanghong
 * @版本: 1.0
 * @创建日期: 2019-08-18
 * @创建时间: 16:31
 **/
@Service
public class ProviderService {

    @Autowired
    private MessageChannel output;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }

}
