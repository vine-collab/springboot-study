package com.blueberry.springboot.starter;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hekai
 * @create 2018-02-11-18:30
 */
@SpringBootConfiguration
public class MyConfig {

    @Bean
    public List createList() {
        return new ArrayList();
    }
}
