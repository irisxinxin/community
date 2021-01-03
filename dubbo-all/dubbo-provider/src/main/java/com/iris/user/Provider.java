package com.iris.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

import java.io.IOException;

/**
 * 通过启动Spring容器，发布服务
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        System.in.read();
    }
}
