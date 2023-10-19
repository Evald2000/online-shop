package com.myproject.onlineshop.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("allProducts")
    public String allProducts(){

        return "allProducts";
    }
}
