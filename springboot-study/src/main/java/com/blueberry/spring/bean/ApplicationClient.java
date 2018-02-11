package com.blueberry.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hekai
 * @create 2018-02-10-19:02
 */
public class ApplicationClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.blueberry.spring");
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean("createRunnableFactoryBean"));
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean("&createRunnableFactoryBean"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("Jeep"));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Pig.class));
        System.out.println(context.getBean(Bird.class));
        System.out.println(context.getBeansOfType(Bird.class));

        context.close();
    }

}
