package com.dubbodemo.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbostudy.commoninterface.pojo.User;
import com.dubbostudy.commoninterface.service.UserService;

/**
 * Author: Liuchong
 * Description:
 * date: 2020-7-31 15:24
 */
public class UserConsumerService implements UserService {
    @Reference
    private UserService userService;

    @Override
    public User queryUserDetail() {
        return userService.queryUserDetail();
    }
}
