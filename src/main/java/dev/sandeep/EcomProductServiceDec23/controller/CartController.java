package dev.sandeep.EcomProductServiceDec23.controller;

import dev.sandeep.EcomProductServiceDec23.client.FakeStoreClient;
import dev.sandeep.EcomProductServiceDec23.dto.FakeStoreCartResponseDTO;
import dev.sandeep.EcomProductServiceDec23.exception.CartNotFoundException;
import dev.sandeep.EcomProductServiceDec23.exception.ProductAndCartLimitException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private FakeStoreClient fakeStoreClient;

    @GetMapping("/cart/{userId}")
    public ResponseEntity getCartForUser(@PathVariable("userId")int userId){
        List<FakeStoreCartResponseDTO> cartResponse = fakeStoreClient.getCartByUserId(userId);
        if(cartResponse == null){
            throw new CartNotFoundException("Cart not found for the userId = " + userId);
        }
        return ResponseEntity.ok(cartResponse);
    }

    @GetMapping("/carts/{limit}")
    public ResponseEntity getCartForLimit(@PathVariable("limit")int limit){
        List<FakeStoreCartResponseDTO> cartLimitResponse = fakeStoreClient.getCartForLimit(limit);
        if(cartLimitResponse == null){
            throw new ProductAndCartLimitException("The limit for the cart is not valid = " + limit);
        }
        return ResponseEntity.ok(cartLimitResponse);
    }
}
