package com.arthurnovaisdev.web_services.repositories;

import com.arthurnovaisdev.web_services.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
