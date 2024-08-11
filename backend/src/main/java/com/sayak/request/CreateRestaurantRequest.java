package com.sayak.request;

import com.sayak.model.Address;
import com.sayak.model.ContactInformation;
import java.util.List;

import lombok.Data;

@Data
public class CreateRestaurantRequest {

    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String> images;
}
