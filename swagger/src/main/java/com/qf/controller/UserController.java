package com.qf.controller;

import com.qf.pojo.User;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import java.awt.print.Book;

@RestController
@Api(description = "用户操作",value = "用户")
public class UserController {
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部用户",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User find(){
        User user=new User();
        user.setId(1);
        user.setName("男女");
        user.setDesc("kok");
        return user;
    }
    @RequestMapping(value = "fif",method = RequestMethod.POST)
    @ApiOperation(value = "添加")
    public User fin(@ApiParam(name = "yonghu",value = "用户",example = "{id:1,name:'wang'}")  User user){
        return user;
    }
}
