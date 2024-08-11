package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.IngredientCategory;
import java.util.List;

public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {
    List<IngredientCategory> findByRestaurantId(Long id);
}
