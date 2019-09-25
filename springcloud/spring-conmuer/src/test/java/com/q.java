package com;

import com.qf.Astart;
import com.qf.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = Astart.class)
public class q {
    @Resource
    private BookService bookService;
    @Test
    public void te(){
        bookService.find(1);
    }
}
