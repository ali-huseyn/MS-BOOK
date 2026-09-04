package org.example.msbooks.controller;

import org.example.msbooks.exception.AuthorNotFoundException;
import org.example.msbooks.exception.BookNotFoundException;
import org.example.msbooks.exception.ExceptionResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AuthorNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionResponse handlerAuthorNotFoundException(AuthorNotFoundException e) {
        return new ExceptionResponse(e.getMessage());
    }

    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionResponse handlerBookNotFoundException(BookNotFoundException e) {
        return new ExceptionResponse(e.getMessage());
    }
}
