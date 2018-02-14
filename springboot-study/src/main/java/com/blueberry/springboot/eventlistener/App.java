package com.blueberry.springboot.eventlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、自定义事件，一般是继承ApplicationListener接口
 * 2、定义事件监听器，一般是实现ApplicationListener接口
 * 3、配置监听器，启动时，将监听器加入到spring容器中
 * 4、发布事件，使用ApplicationContext.publishEvent发布事件
 *
 * 监听器配置：
 * 1、使用 springApplication.addListeners添加监听器
 * 2、使用@component注解标注监听器类
 * 3、使用context.listener.class配置，参照：DelegatingApplicationListener
 * 4、使用@EventListener注解，并且该类要纳入到spring容器中
 * 5、使用spring.factories文件
 *
 * @author hekai
 * @create 2018-02-14-14:09
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App.class);
//        springApplication.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = springApplication.run(args);
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.stop();
        context.close();
    }
}
