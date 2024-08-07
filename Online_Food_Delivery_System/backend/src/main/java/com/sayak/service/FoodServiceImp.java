package com.sayak.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayak.model.Category;
import com.sayak.model.Food;
import com.sayak.model.Restaurant;
import com.sayak.repository.FoodRepository;
import com.sayak.request.CreateFoodRequest;

@Service
public class FoodServiceImp implements FoodService{

    @Autowired
    private FoodRepository foodRespository;

    @Override
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant) {
        Food food = new Food();
        food.setFoodCategory(category);
        food.setRestaurant(restaurant);
        food.setDescription(req.getDescription());
        food.setImages(req.getImages());
        food.setName(req.getName());
        food.setPrice(req.getPrice());
        food.setIngredients(req.getIngredients());
        food.setSeasonal(req.isSeasonal());
        food.setVegeterian(req.isVegeterian());
        Food savedFood = foodRespository.save(food);
        restaurant.getFoods().add(savedFood);
        return savedFood;
    }

    @Override
    public void deleteFood(Long foodId) throws Exception {
        Food food = findFoodById(foodId);
        food.setRestaurant(null);
        foodRespository.save(food);
    }

    @Override
    public List<Food> getRestaurantsFood(Long restaurantId, boolean isVegeterian, boolean isNonveg, boolean isSeasonal,
            String foodCategory) {
                List<Food> foods = foodRespository.findByRestaurantId(restaurantId);
                if(isVegeterian){
                    foods = filterByVegeterian(foods, isVegeterian);
                }
                if(isNonveg){
                    foods = filterByNonveg(foods, isNonveg);
                }
                if(isSeasonal){
                    foods = filterBySeasonal(foods, isSeasonal);
                }
                if(foodCategory != null && !foodCategory.equals("")){
                    foods = filterByCategory(foods, foodCategory);
                }
                return foods;
    }

    private List<Food> filterByCategory(List<Food> foods, String foodCategory) {
       return foods.stream().filter(food -> {
        if(food.getFoodCategory() != null){
            return food.getFoodCategory().getName().equals(foodCategory);
        }
        return false;
       }).collect(Collectors.toList());
    }

    private List<Food> filterBySeasonal(List<Food> foods, boolean isSeasonal) {
        return foods.stream().filter(food -> food.isSeasonal() == isSeasonal).collect(Collectors.toList());

    }

    private List<Food> filterByNonveg(List<Food> foods, boolean isNonveg) {
        return foods.stream().filter(food -> food.isVegeterian() == false).collect(Collectors.toList());

    }

    private List<Food> filterByVegeterian(List<Food> foods, boolean isVegeterian) {
        return foods.stream().filter(food -> food.isVegeterian() == isVegeterian).collect(Collectors.toList());
    }

    @Override
    public List<Food> searchFood(String keyword) {
        return foodRespository.searchFood(keyword);
    }

    @Override
    public Food findFoodById(Long foodId) throws Exception {
       Optional<Food> optionalFood = foodRespository.findById(foodId);
       if(optionalFood.isEmpty()){
            throw new Exception("Food does not exist");
       }
       return optionalFood.get();
    }

    @Override
    public Food updateAvailabilityStatus(Long foodId) throws Exception {
        Food food = findFoodById(foodId);
        food.setAvailable(!food.isAvailable());
        return foodRespository.save(food);
    }
    
}
