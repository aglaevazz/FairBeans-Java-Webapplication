package com.webapp.fairBeans.services;

import com.webapp.fairBeans.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void getProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
    }
}
