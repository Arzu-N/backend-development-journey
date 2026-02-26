package com.demo6.exception;

public class NotValid extends RuntimeException {
    public NotValid(String message) {
        super(message);
    }
}
