package com.blueberry.spring.beanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hekai
 * @create 2018-02-11-15:54
 */
@Configuration
public class Config {

    @Bean(initMethod = "init")
    public User createUser(){
        return new User();
    }

    @Bean
    public User createUser2(){
        return new User();
    }
}
