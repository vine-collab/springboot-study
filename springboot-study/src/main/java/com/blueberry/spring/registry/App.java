package com.blueberry.spring.registry;

import com.blueberry.spring.bean.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hekai
 * @create 2018-02-10-14:52
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.blueberry.spring.registry");
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
        beanDefinitionBuilder.addPropertyValue("name", "admin");
        beanDefinitionBuilder.addPropertyValue("age", 25);

        context.registerBeanDefinition("Admin", beanDefinitionBuilder.getBeanDefinition());
        System.out.println(context.getBeansOfType(Person.class));
        context.close();
    }
}
