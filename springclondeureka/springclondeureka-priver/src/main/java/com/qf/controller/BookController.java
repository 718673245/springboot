package com.qf.controller;

import com.qf.pojo.book;
import com.qf.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping("find/{id}")
    @ResponseBody
    public  book findid(@PathVariable(name = "id")Integer id){
        book findid = bookService.findid(id);
        return findid;
    }
    @RequestMapping("/findall")

    public List<book> findall(){
        List<book> findall = bookService.findall();
        return findall ;
    }
}
