package dev.sandeep.EcomProductServiceDec23.controller;

import dev.sandeep.EcomProductServiceDec23.client.FakeStoreClient;
import dev.sandeep.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import dev.sandeep.EcomProductServiceDec23.exception.InvalidInputException;
import dev.sandeep.EcomProductServiceDec23.exception.ProductAndCartLimitException;
import dev.sandeep.EcomProductServiceDec23.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService; // field injection

    @Autowired
    private FakeStoreClient fakeStoreClient;

    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);

    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable("id") int id){
        if(id < 1){
            throw new InvalidInputException("Input is not correct as the id is negative and id can't be negative. Please re enter with correct id");
        }
        FakeStoreProductResponseDTO product = productService.getProduct(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/products/{limit}")
    public ResponseEntity getProductForLimit(@PathVariable("limit")int limit){
        List<FakeStoreProductResponseDTO> productLimitResponse = fakeStoreClient.getProductForLimit(limit);
        if(productLimitResponse == null){
            throw new ProductAndCartLimitException("The limit for the product is not valid = " + limit);
        }
        return ResponseEntity.ok(productLimitResponse);
    }
}
