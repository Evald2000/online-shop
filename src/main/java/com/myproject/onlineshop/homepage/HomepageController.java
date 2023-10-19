package com.myproject.onlineshop.homepage;

import com.myproject.onlineshop.product.Product;
import com.myproject.onlineshop.product.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @Autowired
    ProductsRepository productRepo;



    @GetMapping("/")
    public String homePage(){




        return "homepage";
    }

    @GetMapping("save")
    public String test(){
        productRepo.save(Product.builder().name("kek").build());
        return "homepage";
    }
}