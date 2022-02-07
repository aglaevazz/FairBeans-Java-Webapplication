package com.webapp.fairBeans.repositories;

import com.webapp.fairBeans.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
