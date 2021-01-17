package com.iris.dubbospringbootprovider.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.iris.user.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String hello(String name) {
        System.out.println("SpringBoot hello");
        return "Spintboot hello" + name;
    }
}
