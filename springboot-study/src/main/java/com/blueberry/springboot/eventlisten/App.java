package com.blueberry.springboot.eventlisten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、自定义事件，一般是继承ApplicationListener接口
 * 2、定义事件监听器，一般是实现ApplicationListener接口
 * 3、启动时，将监听器加入到spring容器中
 * 4、发布事件，使用ApplicationContext.publishEvent发布事件
 *
 * @author hekai
 * @create 2018-02-14-14:09
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = springApplication.run(args);
        context.publishEvent(new MyApplicationEvent(new Object()));

        context.close();
    }
}
