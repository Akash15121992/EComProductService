package dev.sandeep.EcomProductServiceDec23.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private int productId;
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageUrl;
    private double rating;
}
