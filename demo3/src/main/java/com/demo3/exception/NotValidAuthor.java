package com.demo3.exception;

public class NotValidAuthor extends RuntimeException {
    public NotValidAuthor(String message) {
        super(message);
    }
}
