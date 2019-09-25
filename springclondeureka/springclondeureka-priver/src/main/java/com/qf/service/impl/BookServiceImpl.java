package com.qf.service.impl;

import com.qf.mapper.BookMapper;
import com.qf.pojo.book;
import com.qf.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public book findid(Integer id)  {
        try {
    long l=new Random().nextInt(3000-100)+100;
            Thread.sleep(l);
            System.out.println(l);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(id);
        return bookMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<book> findall() {
        List<book> books = bookMapper.selectAll();
        return books;
    }
}
