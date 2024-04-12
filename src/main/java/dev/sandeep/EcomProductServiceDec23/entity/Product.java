package dev.sandeep.EcomProductServiceDec23.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageUrl;
    private double rating;
}

/*
entity class will be stored in db which will needed by backend and it will have lots of data that will not be
required by UI , so we do not return entity object as response.

As part of coding practice we return dto object , and to create the dto object we create
mapper class to convert entity to dto object
 */