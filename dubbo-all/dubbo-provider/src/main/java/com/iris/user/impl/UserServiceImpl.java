package com.iris.user.impl;

import com.iris.user.IUserService;

/**
 * 把这个实现作为一个服务发布出来，方便其他工程调用
 */

public class UserServiceImpl implements IUserService {

    public String hello(String name) {
        System.out.println(name);
        return "hello " + name ;
    }
}
