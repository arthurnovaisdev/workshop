package com.arthurnovaisdev.web_services.repositories;

import com.arthurnovaisdev.web_services.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
