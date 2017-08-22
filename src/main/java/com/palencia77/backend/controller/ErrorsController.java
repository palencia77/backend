package com.palencia77.backend.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by palencia77 on 8/12/17.
 */
@ControllerAdvice
public class ErrorsController {
    private static final String INTERNAL_SERVER_ERROR_VIEW="error/500";

    @ExceptionHandler(Exception.class)
    public String showInternalServerError(){
        return  INTERNAL_SERVER_ERROR_VIEW;
    }
}
