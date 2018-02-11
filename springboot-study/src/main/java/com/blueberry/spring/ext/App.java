package com.blueberry.spring.ext;

import com.blueberry.spring.bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hekai
 * @create 2018-02-10-14:52
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.blueberry.spring.ext");
        context.getBean(Book.class).toString();
        context.getBean(Dog.class).show();
        context.close();
    }
}
