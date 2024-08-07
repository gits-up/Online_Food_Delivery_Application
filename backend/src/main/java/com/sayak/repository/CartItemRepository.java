package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{
    
}
