package com.myproject.onlineshop.admin;

import com.myproject.onlineshop.product.Product;
import com.myproject.onlineshop.product.ProductsRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Currency;

@Controller
public class AdminController {

    @Autowired
    ProductsRepository productRepo;

    @GetMapping("AdminPage")
    public String menu(){

        return "adminMenu";
    }

    @GetMapping("createProductView")
    public String createProduct(){

        return "createProduct";
    }
    @PostMapping("createProduct")
    public String createProduct(
                                @RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "price", required = false) Float price,
                                Model model
    ){
    model.addAttribute("name",name);
//    model.addAttribute("price",price);
    productRepo.save(Product.builder().name(name).price(price).build());
        return "redirect:createProductView";
    }
}
