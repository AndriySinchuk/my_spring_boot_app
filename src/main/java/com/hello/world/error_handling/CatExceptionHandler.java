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
    public ResponseEntity<CatExceptionMessage> handleThereIsNoSuchCatException() {
        return new ResponseEntity<>(new CatExceptionMessage("There is no such cat"), HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class CatExceptionMessage {
        private String message;
    }
}
