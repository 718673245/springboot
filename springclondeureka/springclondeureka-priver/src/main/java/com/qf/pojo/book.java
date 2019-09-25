package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Data
public class book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "dsec")
    private String dsec;
}
