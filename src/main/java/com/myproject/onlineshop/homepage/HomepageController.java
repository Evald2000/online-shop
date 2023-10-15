package com.myproject.onlineshop.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("")
    public String homePage(){
        return "homepage";
    }
}
