package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.qf.pojo.book;
import com.qf.service.BookService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Bookcontroller {
    @Resource
    private BookService bookService;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;
    @RequestMapping("/find/{id}")
    public book findid(@PathVariable(name = "id") Integer id){
        book findid = bookService.find(id);
        return findid;
       // return restTemplate.getForObject("http://127.0.0.1:8082/find/"+id,book.class);
    }



    @RequestMapping("/findall")
    public String findall(){
        String s  = bookService.findall();
        System.out.println(s);
        return s ;
    }


}
