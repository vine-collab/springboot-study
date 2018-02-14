package com.blueberry.springboot.extension;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author hekai
 * @create 2018-02-14-15:47
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(applicationContext.getBeanDefinitionCount());
    }
}
