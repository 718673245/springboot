package com.qf.service.impl;

import com.qf.pojo.book;
import com.qf.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private RestTemplate restTemplate;
    @Override
    public void find(int id) {
        book forObject = restTemplate.getForObject("http://localhost:8080/find/"+id, book.class);
        System.out.println(forObject);
    }
}
