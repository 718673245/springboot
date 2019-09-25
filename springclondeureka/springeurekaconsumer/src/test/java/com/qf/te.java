package com.qf;

import com.qf.pojo.book;
import com.qf.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Astartconsumer.class)
public class te {
    @Resource
    private BookService bookService;
    @Test
    public void teee(){
        /*book findid = bookService.find(2);
        System.out.println(findid);*/
        String findall = bookService.findall();
        System.out.println(findall);

    }
}
