package com.blueberry.webapi;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hekai
 * @create 2018-02-17-14:27
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e) {
        System.out.println(e);
        return "global exception" + e.getMessage();
    }


}
