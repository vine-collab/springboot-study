package com.blueberry.springboot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author hekai
 * @create 2018-02-11-19:52
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.getBean(UserConfig.class).show();
        context.getBean(JdbcConfig.class).show();
        System.out.println(context.getBean(DataSourceConfig.class));
        System.out.println(context.getEnvironment().getProperty("jdbc.username"));
        System.out.println(context.getBean(TomcatProperties.class));
        context.close();
    }
}
