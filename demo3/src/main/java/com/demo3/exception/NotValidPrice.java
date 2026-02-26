package com.demo3.exception;

public class NotValidPrice extends RuntimeException {
    public NotValidPrice(String message) {
        super(message);
    }
}
