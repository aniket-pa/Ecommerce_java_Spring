package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends  Base{

    private String name;

    private  String description;
    private  String specification;

    private  Double amount;

    private  String  image_url;

}
