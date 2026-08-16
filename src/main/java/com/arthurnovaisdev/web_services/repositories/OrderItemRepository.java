package com.arthurnovaisdev.web_services.repositories;

import com.arthurnovaisdev.web_services.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
