package com.blueberry.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hekai
 * @create 2018-02-16-19:14
 */
@RestController
public class UserController {

    @Autowired
    private CounterService counterService;

    @GetMapping("/ping")
    public String hello(){
        System.out.println("hello spring boot!");
        counterService.increment("ping.count");
        return "hello spring boot!";
    }

    @GetMapping("/error")
    public String error(){
        int i = 1 / 0;
        return "hello spring boot!";
    }
}
