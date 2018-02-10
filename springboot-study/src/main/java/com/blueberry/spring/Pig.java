package com.blueberry.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author hekai
 * @create 2018-02-10-16:43
 */
public class Pig {

    @PostConstruct
    public void init() {
        System.out.println("=====pigInit======");
    }

    @PreDestroy
    public void destory() {
        System.out.println("=====pigDestory======");
    }
}
