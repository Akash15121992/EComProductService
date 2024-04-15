package dev.sandeep.EcomProductServiceDec23.exception;

import dev.sandeep.EcomProductServiceDec23.dto.ExceptionResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe){
        ExceptionResponseDto exceptionResponseDto = new ExceptionResponseDto(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDto, HttpStatus.NOT_FOUND);
    }
}
