package com.ivanrogulj.exercise5.exceptionHandler;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}