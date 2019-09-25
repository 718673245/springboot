package com.qf;

import com.netflix.ribbon.RequestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Astartconsumer {
    public static void main(String[] args) {
        SpringApplication.run(Astartconsumer.class,args);
    }
    @Bean
    public RestTemplate RestTemplate(){
        return new RestTemplate();
    }
}
