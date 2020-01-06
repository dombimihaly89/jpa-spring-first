package com.example.demo.exception;

public class InternalServerException extends ValidationException {

    public InternalServerException() {
        super("Internal server exception");
    }

}
