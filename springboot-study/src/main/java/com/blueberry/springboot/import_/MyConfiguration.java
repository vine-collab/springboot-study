package com.blueberry.springboot.import_;

import org.springframework.context.annotation.Bean;

/**
 * @author hekai
 * @create 2018-02-13-17:16
 */
public class MyConfiguration {

    @Bean
    public Runnable createRunnable(){
        return () -> {};
    }

    @Bean
    public Runnable createRunnable2(){
        return () -> {};
    }
}
