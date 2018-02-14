package com.blueberry.springboot.SpringBootApplicationAnnotation.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hekai
 * @create 2018-02-14-19:20
 */
@SpringBootApplication(scanBasePackages = "com.blueberry.springboot.SpringBootApplicationAnnotation")
public class App {

    @Value("${local.ip}")
    private String host;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        Map<String, Object> defaultsProperties = new HashMap<>();
        defaultsProperties.put("local.ip", "192.168.1.200");
        application.setDefaultProperties(defaultsProperties);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.close();
    }

}
