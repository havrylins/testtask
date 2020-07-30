package com.eva.testtask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(ThereIsNoSuchProductException.class)
    protected ResponseEntity<PatternException> handleThereIsNoSuchUserException() {
        return new ResponseEntity<>(new PatternException("There is no such product"), HttpStatus.NOT_FOUND);
    }
}
