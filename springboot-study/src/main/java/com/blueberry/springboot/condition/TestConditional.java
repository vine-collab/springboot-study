package com.blueberry.springboot.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @author hekai
 * @create 2018-02-13-14:46
 */
@SpringBootConfiguration
public class TestConditional {

    @Bean
    @ConditionalOnProperty(name = "test.conditional", havingValue = "true", matchIfMissing = true)
    public Runnable createRunnable(){
        return () -> {};
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public Runnable createFastJsonRunnable(){
        return () -> {};
    }

    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable createBeanRunnable(){
        return () -> {};
    }
}
