package com.blueberry.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hekai
 * @create 2018-02-16-19:14
 */
@RestController
public class UserController {


    @GetMapping("/ping")
    public String hello(){
        System.out.println("hello spring boot!");
        return "hello spring boot!";
    }
}
