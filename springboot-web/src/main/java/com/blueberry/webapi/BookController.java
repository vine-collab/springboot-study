package com.blueberry.webapi;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * @author hekai
 * @create 2018-02-17-14:22
 */
@RestController("/book")
public class BookController {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e){
        return e.getMessage();
    }

    @GetMapping("/error1")
    public void error1() throws FileNotFoundException {
        throw new FileNotFoundException("conf not found!");
    }

    @GetMapping("/error2")
    public void error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("class is not found!");
    }
}
