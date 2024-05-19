package org.example.rababtammagroupe5.web;

import org.example.rababtammagroupe5.dao.entities.Product;
import org.example.rababtammagroupe5.dao.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ProductRepo productRepository;


    @GetMapping("/shop")
    public String showShop(Model model) {

        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "shop";
    }
}

