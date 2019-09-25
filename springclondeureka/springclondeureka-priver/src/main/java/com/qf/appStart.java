package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.com.qf.mapper")
@EnableEurekaClient
public class appStart {
    public static void main(String[] args) {
        SpringApplication.run(appStart.class,args);
    }
}
