package com.blueberry.springboot.extension;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

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
 * CommandLineRunner、ApplicationRunner是容器启动后最后一步回调
 * 使用步骤：
 * 1、实现CommandLineRunner接口,并纳入到spring容器中
 * 使用@order或者实现Ordered接口来实现回调的先后顺序
 *
 * CommandLineRunner、ApplicationRunner区别：
 * CommandLineRunner参数为最原始的参数
 * ApplicationRunner参数为封装之后的参数对象,是对CommandLineRunner参数的封装
 *
 * ApplicationArguments是对main方法args进一步处理
 * 可以直接获取
 * @author hekai
 * @create 2018-02-14-15:46
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
//        application.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = application.run("xxx");
        ApplicationArguments arguments = context.getBean(ApplicationArguments.class);
        System.out.println(Arrays.asList(arguments.getSourceArgs()));
        System.out.println(arguments.getOptionNames());
        System.out.println(arguments.getOptionValues("myname"));
        context.close();
    }


}
