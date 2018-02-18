package com.blueberry.springboot.starter_redis;

import com.blueberry.springboot.redis.EnableRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @author hekai
 * @create 2018-02-18-12:25
 */
@EnableRedis
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("hello", "hello");
    }
}
