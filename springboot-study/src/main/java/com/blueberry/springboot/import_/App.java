package com.blueberry.springboot.import_;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author hekai
 *
 * @create 2018-02-13-17:10
 */
//@Import({User.class, Role.class, MyConfiguration.class})
//@Import(MyImportSelector.class)
@ComponentScan
@EnableLog(name = "my spring boot")
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }
}
