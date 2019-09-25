package com.qf;

import com.qf.pojo.Book;
import com.qf.service.BookService;
import com.qf.service.impl.BookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonStatsRecorder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Cumer.class)
public class te {
    //负载均衡用的和客户端查询
@Resource
private RibbonLoadBalancerClient ribbonLoadBalancerClient;
@Resource
private BookService bookService;
@Test
    public  void test(){
    for (int i = 0; i < 10; i++) {
        ServiceInstance choose = ribbonLoadBalancerClient.choose("EUREKA-CLIENT-PROVIDER");
        System.out.println(choose.getHost()+"--------"+choose.getPort());
    }
    }
    @Test
    public  void test1(){
        for (int i = 0; i < 10; i++) {
            Book findid = bookService.findid(1);
            System.out.println(findid.toString());
        }
    }

}
