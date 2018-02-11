package com.blueberry.springboot.properties_;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author hekai
 * @create 2018-02-11-21:00
 */
@Configuration
@PropertySource("classpath:config/jdbc.properties")
public class FileConfig {

}
