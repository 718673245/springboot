package com.qf.controller;

import com.qf.pojo.book;
import com.qf.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("/find/{id}")
    public book findid(@PathVariable(name = "id") Integer id){
        book findid = bookService.findid(id);
        return findid;
    }
}
