package com.hello.world.error_handling;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CatExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ThereIsNoSuchCatException.class)
    public ResponseEntity<CatException> handleThereIsNoSuchCatException() {
        return new ResponseEntity<>(new CatException("There is no such cat"), HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class CatException {
        private String message;
    }
}
