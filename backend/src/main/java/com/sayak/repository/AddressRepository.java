package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
