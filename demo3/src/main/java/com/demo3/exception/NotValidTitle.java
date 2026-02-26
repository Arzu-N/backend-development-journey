package com.demo3.exception;

public class NotValidTitle extends RuntimeException {
    public NotValidTitle(String message) {
        super(message);
    }
}
