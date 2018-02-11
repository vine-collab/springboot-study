package com.blueberry.spring.ext;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-14:33
 */
@Component
public class Dog implements SpringContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void show(){
        System.out.println("=======Dog.show========" + applicationContext.getClass());
    }
}
