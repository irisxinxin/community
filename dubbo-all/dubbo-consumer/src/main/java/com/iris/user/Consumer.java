package com.iris.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        //调用远程的服务
        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.hello("dubbo"));

        //按任意键退出
        System.in.read();
    }
}
