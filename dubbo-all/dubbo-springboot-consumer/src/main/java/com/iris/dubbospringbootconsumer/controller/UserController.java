package com.iris.dubbospringbootconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iris.user.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(loadbalance = "consistenthash", stub = "com.iris.user.UserServiceImplStub")
    private IUserService userService;

    @RequestMapping("hello")
    public String hello(String name) {
        //调用远程服务
        return userService.hello(name);
    }
}
