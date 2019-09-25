package com.qf.service;

import com.qf.pojo.book;

import java.util.List;

public interface BookService {
    //单个访问
    public book findid(Integer id);
    //全查
    public List<book> findall();
}
