package com.example.demo.exception;

public class MissingParameterException extends ValidationException {

    public MissingParameterException() {
        super("Missing parameter");
    }

}
