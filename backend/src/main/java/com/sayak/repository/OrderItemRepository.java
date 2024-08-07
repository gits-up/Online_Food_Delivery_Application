package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
