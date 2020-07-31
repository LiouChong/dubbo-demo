package com.dubbostudy.commoninterface.service;

import com.alibaba.dubbo.common.extension.SPI;
import com.dubbostudy.commoninterface.pojo.User;

/**
 * Author: Liuchong
 * Description:
 * date: 2020-7-31 15:02
 */
@SPI
public interface UserService {
    User queryUserDetail();
}
