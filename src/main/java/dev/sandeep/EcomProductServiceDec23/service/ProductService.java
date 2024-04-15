package dev.sandeep.EcomProductServiceDec23.service;

import dev.sandeep.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import dev.sandeep.EcomProductServiceDec23.entity.Product;

import java.util.List;

public interface ProductService {
    // crud operation
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId);
    boolean deleteProduct(int productId);

}
