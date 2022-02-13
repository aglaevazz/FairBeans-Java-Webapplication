package com.webapp.fairBeans.controllers;

import com.webapp.fairBeans.domain.Product;
import com.webapp.fairBeans.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping(value="/product/add", method= RequestMethod.GET)
    public String addProductSite() {
        return "add-product";
    }

    @RequestMapping(value="/product/add/success", method=RequestMethod.POST)
    public String addPartner(@RequestParam String name, @RequestParam String description, Model model) {
        productService.addProduct(name, description);
        model.addAttribute("message", String.format("Product %s had been added.", name));
        return "add-product";
    }
}
