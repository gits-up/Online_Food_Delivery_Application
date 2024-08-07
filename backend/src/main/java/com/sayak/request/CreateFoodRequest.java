package com.sayak.request;

import com.sayak.model.Category;
import com.sayak.model.IngredientsItem;

import java.util.List;

import lombok.Data;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;
    private long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegeterian;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;
    
}
