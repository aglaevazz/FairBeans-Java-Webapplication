package com.webapp.fairBeans.services;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.domain.Product;
import com.webapp.fairBeans.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public void addProduct(String name, String description) {
        Product product = new Product(name, description);
        productRepository.save(product);
    }
}
