package com.blueberry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hekai
 * @create 2018-02-11-17:39
 */
//@SpringBootApplication
@ComponentScan
public class App2 {

    @Bean
    public Runnable createRunnable() {
        return () -> System.out.println("runnable run...");
    }


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App2.class);

        ConfigurableApplicationContext context = springApplication.run(args);
        
//        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        context.getBean(Runnable.class).run();
    }

}
