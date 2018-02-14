package com.blueberry.springboot.enableconfiguration;

import com.blueberry.salve.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hekai
 * @create 2018-02-14-12:04
 *
 * @EnableAutoConfiguration 从classpath中扫描所有的META-INF/spring.factories配置文件
 * 将key = org.springframework.boot.autoconfigure.EnableAutoConfiguration 的配置加载到spring容器中
 *
 * 1、ImportSelector 接口的返回值都会纳入到spring容器中管理
 * 2、SpringFacotiesLoader 该类可以从classpath中扫描所有的META-INF/spring.factories配置文件，并加载类
 * 3、只有spring.boot.enableautoconfiguration配置为true时@EnableAutoConfiguration才起作用
 */
@EnableAutoConfiguration
@ComponentScan
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean(User.class));

        context.close();
    }

}
