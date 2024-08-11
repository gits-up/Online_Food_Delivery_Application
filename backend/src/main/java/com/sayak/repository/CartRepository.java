package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    public Cart findByCustomerId(Long userId);
}