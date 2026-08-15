package com.arthurnovaisdev.web_services.repositories;

import com.arthurnovaisdev.web_services.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
