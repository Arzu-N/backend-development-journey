package com.example.demo.exception;

public class CapasityNotEnough extends RuntimeException {
    public CapasityNotEnough(String message) {
        super(message);
    }
}
