package com.webapp.fairBeans.services;

import com.webapp.fairBeans.domain.Product;
import com.webapp.fairBeans.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    private List<Product> products;

    @BeforeEach
    private void initEach() {
        Product productA = new Product("name", "description");
        Product productB = new Product("name", "description");
        products = Arrays.asList(productA, productB);
    }

    @Test
    public void getProductsAreaIsNull() {
        when(productRepository.findAll()).thenReturn(products);
        assertEquals(products, productService.getProducts());
    }
}
