package com.demo3.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Setter
@Getter

public class CustomValidationException extends RuntimeException {
    private final Map<String, String> errors = new HashMap<>();

    public CustomValidationException() {}

    public void addError(String field, String message) {
        errors.put(field, message);
    }

  /*  @Override
    public String getMessage() {
        return "Validation failed";
    }*/
}