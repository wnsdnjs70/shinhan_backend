package com.example.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Getter
@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<ExceptionResponse> handleException(NoSuchElementException e){
        ExceptionResponse exceptionResponse = new ExceptionResponse("잘좀해라", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
    }

}
