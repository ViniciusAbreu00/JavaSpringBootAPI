package com.api.javaapi.handler;

import com.api.javaapi.model.err.ErrorMessage;
import com.api.javaapi.model.exceptions.ResourceNotFound;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandle {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<?> handleResoucerNotFoundException(ResourceNotFound ex){
        ErrorMessage error = new ErrorMessage("Not Found", ex.getMessage(), HttpStatus.NOT_FOUND.value() );

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
    }
}
