package com.blueberry.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 异常处理：
 * 除去springboot默认异常@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
 *
 *
 * @author hekai
 * @create 2018-02-16-17:52
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
