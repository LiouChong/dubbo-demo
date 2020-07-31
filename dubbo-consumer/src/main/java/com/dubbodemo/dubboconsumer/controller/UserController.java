package com.dubbodemo.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbostudy.commoninterface.pojo.User;
import com.dubbostudy.commoninterface.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Liuchong
 * Description:
 * date: 2020-7-31 15:28
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping(value = "/get/user")
    public User test() {
        User user = userService.queryUserDetail();
        System.out.println("调用成功");

        return user;
    }
}
