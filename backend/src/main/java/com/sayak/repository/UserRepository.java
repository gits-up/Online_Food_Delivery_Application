package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sayak.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);

}
