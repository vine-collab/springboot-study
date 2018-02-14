package com.blueberry.salve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hekai
 * @create 2018-02-14-12:37
 */
@Configuration
public class RunnableCofiguration {

    @Bean
    public Runnable createRunnable(){
        return () -> {};
    }

    @Bean
    public User createUser(){
        return new User();
    }
}
