package com.qf.service.impl;

import com.alibaba.fastjson.JSON;
import com.qf.pojo.book;
import com.qf.service.BookService;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl  implements BookService {
@Resource
private RestTemplate restTemplate;
@Resource
private DiscoveryClient discoveryClient;
    @Override
    public book find(Integer id) {
        //book book = restTemplate.getForObject("http://127.0.0.1:8081/find/"+id,book.class);
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-CLIENT-PROVIDER");
        ServiceInstance serviceInstance = instances.get(0);
        String scheme = serviceInstance.getScheme();
        URI uri = serviceInstance.getUri();
        System.out.println(scheme+uri);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String s="http://"+host+":"+port+"/findid/"+id;
        System.out.println(s);
        return restTemplate.getForObject(s,book.class);
    }

    //查询全部
   /* @Override
    public String findall() {
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-CLIENT-PROVIDER");
        System.out.println(instances.size());
       List<book> list=new ArrayList<book>();
        for (ServiceInstance instance : instances) {
            String host = instance.getHost();
            int port = instance.getPort();
            System.out.println(host+port);
            book forObject = restTemplate.getForObject("http://" + host + ":" + port + "/findall", book.class);
            System.out.println(forObject);
            System.out.println(forObject);
            list.add(forObject);
        }
        String s = JSON.toJSONString(list);
        return s;
    }*/
}
