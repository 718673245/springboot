package com.qf.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.qf.pojo.Book;
import com.qf.service.BookService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl  implements BookService {
@Resource
private RestTemplate restTemplate;
    @Override
   // @HystrixCommand(fallbackMethod = "find")
    public Book findid(Integer id) {
        String addess="http://localhost:8085/find/1";
        System.out.println(addess);
        return restTemplate.getForObject(addess,Book.class);
    }
    public Book find(Integer id) {
        Book book=new Book();
        book.setId(id);
        book.setName("异常");
        book.setDsec("时间超时");
        return book;
    }


}
