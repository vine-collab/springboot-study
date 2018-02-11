package com.blueberry.spring.ext;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-11:59
 */
@Component
public class Book implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("=======================");
        this.applicationContext = applicationContext;
    }

    @Override
    public String toString() {
        System.out.println("=========toString=========");
        return "Book{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
