package com.blueberry.springboot.extension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ApplicationContextInitializer接口spring容器执行refresh之前执行回调
 * 1、实现ApplicationContextInitializer接口
 * 2、注册ApplicationContextInitializer
 *
 * 注册方法：
 * 1、SpringApplication.addInitializers方法
 * 2、使用配置文件context.initializer.classes
 * 3、使用spring.factories文件
 *
 * @author hekai
 * @create 2018-02-14-15:46
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
//        application.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = application.run(args);
        context.close();
    }


}
