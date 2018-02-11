package com.blueberry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author hekai
 * @create 2018-02-11-17:39
 */
@SpringBootApplication
public class App {

    @Bean
    public Runnable createRunnable() {
        return () -> System.out.println("runnable run...");
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(Runnable.class).run();
    }

}
