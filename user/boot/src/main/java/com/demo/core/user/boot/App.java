package com.demo.core.user.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@EnableEurekaClient
@EnableTransactionManagement
@SpringBootApplication
@MapperScan({"com.demo.core.user.service.mapper","com.demo.sdk.mapper"})
@ComponentScan(basePackages = {"com.demo"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
