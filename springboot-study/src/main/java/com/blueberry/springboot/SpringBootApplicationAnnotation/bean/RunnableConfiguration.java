package com.blueberry.springboot.SpringBootApplicationAnnotation.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author hekai
 * @create 2018-02-14-19:48
 */
@SpringBootConfiguration
public class RunnableConfiguration {

    @Bean
    public Runnable createRunnable(){
        System.out.println("xxxxxxx");
        return () -> {};
    }
}
