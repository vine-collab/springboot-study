package com.blueberry.springboot.aop;

import org.springframework.stereotype.Service;

/**
 * @author hekai
 * @create 2018-02-17-21:10
 */
@Service
public class UserService {


    public void addUser(){
        System.out.println("======addUser=======");
    }
}
