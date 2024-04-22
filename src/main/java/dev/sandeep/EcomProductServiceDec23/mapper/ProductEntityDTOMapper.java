package dev.sandeep.EcomProductServiceDec23.mapper;

import dev.sandeep.EcomProductServiceDec23.dto.ProductResponseDto;
import dev.sandeep.EcomProductServiceDec23.entity.Product;

public class ProductEntityDTOMapper {

    public  static ProductResponseDto convertProductEntityToProductResponseDto(Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setTitle(product.getTitle());
        productResponseDto.setCategory(product.getCategory());
        productResponseDto.setRating(product.getRating());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setImageUrl(product.getImageURL());
        productResponseDto.setDescription(product.getDescription());
        return  productResponseDto;
    }
}
