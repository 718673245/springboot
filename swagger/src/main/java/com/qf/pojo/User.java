package com.qf.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiResponse;
import lombok.Data;

import javax.naming.NamingEnumeration;

@Data
@ApiModel(value = "用户管理",description = "登录页面")
public class User {
    @ApiModelProperty(name = "id",value = "ID号",example = "1")
    private int id;
    @ApiModelProperty(name = "name",value = "名字",example = "wnag")
    private String name;
    @ApiModelProperty(name = "desc",value = "描述",example = "好好")
    private String desc;
}
