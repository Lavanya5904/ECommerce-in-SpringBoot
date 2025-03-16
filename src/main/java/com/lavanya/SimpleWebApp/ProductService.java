package com.lavanya.SimpleWebApp;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"IPhone",50000),
            new Product(102,"Camera",70000));

    public List<Product> getProducts(){
        return products;
    }
}
