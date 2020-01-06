package com.example.demo.exception;

public class TooLongException extends ValidationException {

    public TooLongException() {
        super("Too long");
    }

}
