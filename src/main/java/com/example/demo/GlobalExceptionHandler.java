package com.example.demo;

import com.example.demo.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    // miért pont List típusú a visszatérés?
    // miért Runtime exception-t várunk paraméterül?
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public List<String> handleRuntimeException(RuntimeException e) {
        return List.of(e.getMessage());
    }

    @ExceptionHandler(IdValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<String> handleIdValidationException(IdValidationException e) {
        return List.of(e.getMessage() + ". IdValidationException appeared");
    }

    @ExceptionHandler(TooLongException.class)
    @ResponseStatus(HttpStatus.LENGTH_REQUIRED)
    public List<String> handleTooLongException(TooLongException e) {
        return List.of(e.getMessage() + ". TooLongException appeared");
    }

    @ExceptionHandler(MissingParameterException.class)
    @ResponseStatus(HttpStatus.LENGTH_REQUIRED)
    public List<String> handleMissingParameterException(MissingParameterException e) {
        return List.of(e.getMessage() + ". MissingParameterException appeared");
    }

    @ExceptionHandler(InternalServerException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public List<String> handleInternalServerException(InternalServerException e) {
        return List.of(e.getMessage() + ". InternalServerException appeared");
    }

}
