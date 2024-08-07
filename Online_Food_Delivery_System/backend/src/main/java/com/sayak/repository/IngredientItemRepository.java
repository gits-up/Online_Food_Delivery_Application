package com.sayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayak.model.IngredientsItem;
import java.util.List;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem, Long>{
    List<IngredientsItem> findByRestaurantId(Long id);
}
