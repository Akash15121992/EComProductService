package dev.sandeep.EcomProductServiceDec23.exception;

public class ProductAndCartLimitException extends RuntimeException{
    public ProductAndCartLimitException(String message) {
        super(message);
    }
}
