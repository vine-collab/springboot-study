package com.blueberry.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hekai
 * @create 2018-02-10-19:22
 */
@Configuration
public class ExcludeConfig {

    @Bean(initMethod = "dogInit", destroyMethod = "dogDestory")
    public Dog createDog(){
        return new Dog();
    }

}
