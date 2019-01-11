package com.blueberry.webapi;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author hekai
 * @create 2018-02-16-19:14
 */
@RestController
public class UserController {

    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gaugeService;

    @GetMapping("/ping")
    public String hello() {
        System.out.println("hello spring boot!");
        counterService.increment("ping.count");
        return "hello spring boot!";
    }

    @GetMapping("/error")
    public String error() {
        int i = 1 / 0;
        return "hello spring boot!";
    }

    @GetMapping("/testGaugeService")
    public String testGaugeService(@RequestParam(value = "name", required = false) Long value) {
        gaugeService.submit("testGaugeService.value", value);
        return "testGuageService";
    }

    @PostMapping(path = "/test")
    public String hello(@RequestBody Cat req, Dog dog) {
        System.out.println(req);
        System.out.println(dog);
        return JSON.toJSONString(req);
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("tomcat");
        System.out.println(JSON.toJSONString(cat));
    }
}
