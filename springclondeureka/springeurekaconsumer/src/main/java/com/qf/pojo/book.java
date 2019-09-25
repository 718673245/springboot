package com.qf.pojo;


import lombok.Data;

import java.io.Serializable;


@Data
public class book  implements Serializable {
    private int id;
    private String name;
    private String dsec;
}
