package com.blueberry.springboot.aop;

import com.blueberry.springboot.aop.TestAspect.MyTestService2;
import com.blueberry.springboot.aop.Wildcard.CatServiceImpl;
import com.blueberry.springboot.aop.Wildcard.DogServiceImpl;
import com.blueberry.springboot.aop.validation.PayRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author hekai
 * @date 2018-02-17-19:47
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class App {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(UserService.class).addUser();

        context.getBean(MyTestService2.class).sayHello();
        context.getBean(MyTestService2.class).count();

        System.out.println("++++++++++++++");

        context.getBean(DogServiceImpl.class).bray();
        context.getBean(CatServiceImpl.class).bray();

        PayRequestDto payRequestDto = new PayRequestDto();
        context.getBean(TestValidateService.class).hello(payRequestDto);
    }
}
