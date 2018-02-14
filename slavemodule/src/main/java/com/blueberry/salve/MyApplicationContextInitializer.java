package com.blueberry.salve;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author hekai
 * @create 2018-02-14-16:16
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("=========MyApplicationContextInitializer===========");
    }
}
