package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

@Table(name = "book")
@Data
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "dsec")
    private String dsec;
}
