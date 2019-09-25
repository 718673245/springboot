package com.qf;

import com.qf.pojo.book;
import com.qf.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = appStart.class)
public class te {
    @Resource
    private BookService bookService;
    @Test
    public  void  ter(){
        book findid = bookService.findid(2);
        System.out.println(findid);
       /* List<book> findall = bookService.findall();
        System.out.println(findall);*/
    }
}
