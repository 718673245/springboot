package com.qf;

import com.qf.pojo.book;
import com.qf.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = start.class)
public class te {
    @Resource
    private BookService bookService;
    @Test
    public void te(){
        book findid = bookService.findid(1);
        System.out.println(findid);
    }
}
