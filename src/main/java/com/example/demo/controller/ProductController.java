package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/product")
    public List<Product> getProduct(){

            ArrayList<Product> products =  new ArrayList<>();
            Product product = new Product();
            products.add(product);
            return products;
    }


    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") Long product_id){
        Product prod =  new Product();
        prod.setId(product_id);
        return prod;
    }

    @PostMapping("/product")
    public  Product createNewProduct(@RequestBody Product product){
        product.setId(2L);
        return product;
    }


}
