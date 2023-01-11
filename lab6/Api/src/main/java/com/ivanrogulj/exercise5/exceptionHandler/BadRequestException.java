package com.ivanrogulj.exercise5.exceptionHandler;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}