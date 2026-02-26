package com.demo3.exception;

import com.demo3.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

   /* @ExceptionHandler(NotValidTitle.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDto notValidTitle(NotValidTitle ex){
        return new ExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }

    @ExceptionHandler(NotValidAuthor.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDto notValidAuthor(NotValidAuthor ex){
        return new ExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }

    @ExceptionHandler(NotValidCount.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDto notValidCount(NotValidCount ex){
        return new ExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }

    @ExceptionHandler(NotValidPrice.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDto notValidPrice(NotValidPrice ex){
        return new ExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }*/
/*
    @ExceptionHandler({NotValidTitle.class,NotValidAuthor.class,NotValidCount.class,NotValidPrice.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String>notValid(RuntimeException ex){
        Map<String,String> map = new HashMap<>();
        if (ex instanceof NotValidTitle) {
            map.put("title", ex.getMessage());
        }  if (ex instanceof NotValidAuthor) {
            map.put("author", ex.getMessage());
        }  if (ex instanceof NotValidCount) {
            map.put("count", ex.getMessage());
        }  if (ex instanceof NotValidPrice) {
            map.put("price", ex.getMessage());
        }

        return map;
    }*/


    @ExceptionHandler(CustomValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String>notValid(CustomValidationException ex){

        return ex.getErrors();


    }

}
