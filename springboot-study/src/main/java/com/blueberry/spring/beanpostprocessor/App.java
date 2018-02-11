package com.blueberry.spring.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

/**
 * @author hekai
 * @create 2018-02-10-14:52
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.blueberry.spring.beanpostprocessor");
        context.getBean(Book.class).toString();
        context.getBean(Dog.class).show();
        context.close();
    }
}
