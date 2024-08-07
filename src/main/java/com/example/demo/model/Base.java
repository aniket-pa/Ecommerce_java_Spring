package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Base {

    private Long id;

    private Date createdDate;

    private  Date updatedDate;

    private Status status;
}
