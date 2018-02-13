package com.blueberry.springboot.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author hekai
 * @create 2018-02-13-15:35
 */
@EnableAsync
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(TomcatProperties.class));
        context.getBean(Runnable.class).run();
        context.close();
    }
}
