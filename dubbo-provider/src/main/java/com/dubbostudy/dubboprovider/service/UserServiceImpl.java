package com.dubbostudy.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbostudy.commoninterface.pojo.User;
import com.dubbostudy.commoninterface.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Author: Liuchong
 * Description:
 * date: 2020-7-31 15:15
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserDetail() {
        return new User(1,"刘冲","成都");
    }
}
