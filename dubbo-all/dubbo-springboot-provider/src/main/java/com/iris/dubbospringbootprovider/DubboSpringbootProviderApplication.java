package com.iris.dubbospringbootprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo // 注解式的dubbo发布服务
public class DubboSpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootProviderApplication.class, args);
	}

}
