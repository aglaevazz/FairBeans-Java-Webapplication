package com.webapp.fairBeans.controllers;

import com.webapp.fairBeans.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String getProducts(Model model) {
        productService.getProducts(model);
        return "products";
    }
}
