package com.blueberry.springboot.aop;

import com.blueberry.springboot.jdbc.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author hekai
 * @create 2018-02-17-19:47
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(UserService.class).addUser();
    }
}
