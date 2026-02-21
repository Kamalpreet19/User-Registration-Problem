package com.test.services;

public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}
