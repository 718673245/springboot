package com.qf.service.impl;

import com.qf.mapper.BookMapper;
import com.qf.pojo.book;
import com.qf.service.BookService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;



@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public book findid(Integer id) {
        book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }
}
