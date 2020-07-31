package com.dubbostudy.dubboprovider.service;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.dubbostudy.commoninterface.service.UserService;


/**
 * Author: Liuchong
 * Description:
 * date: 2020-7-31 16:46
 */
public class Test {
    public static void main(String[] args) {
        /**
         * JAVA SPI 实现方式，通过加载META-INF.service下的文件来实现
         */
       /* ServiceLoader<UserService> spiLoader = ServiceLoader.load(UserService.class);
        Iterator<UserService> iterator = spiLoader.iterator();
        while (iterator.hasNext()) {
            UserService next = iterator.next();
            System.out.println(next.queryUserDetail());
        }*/
        ExtensionLoader<UserService> extensionLoader = ExtensionLoader.getExtensionLoader(UserService.class);
        UserService userservice = extensionLoader.getExtension("userservice");
        System.out.println(userservice.queryUserDetail());
    }
}
