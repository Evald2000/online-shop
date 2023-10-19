package com.myproject.onlineshop.admin;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("AdminPage")
    public String menu(){

        return "adminMenu";
    }
}
