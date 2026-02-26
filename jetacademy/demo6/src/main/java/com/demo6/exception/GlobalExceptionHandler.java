package com.demo6.exception;

import com.demo6.dto.ExceptionDto;
import com.demo6.util.Status;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(NotValid.class)
    public ExceptionDto notValid(NotValid ex){
      return   new ExceptionDto(Status.BAD_REQUEST,ex.getMessage());
    }
}
