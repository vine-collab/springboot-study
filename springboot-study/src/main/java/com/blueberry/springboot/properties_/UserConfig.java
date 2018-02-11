package com.blueberry.springboot.properties_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-20:16
 * 配置文件默认在classpath、classpath/config、file:/、file:config/
 */
@Component
public class UserConfig {

    @Value("${local.port}")
    private Integer port;

    @Value("${app.name}")
    private String appName;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println(environment.getProperty("local.ip"));
        System.out.println(environment.getProperty("local.port", Integer.class));
        System.out.println(port);
        System.out.println(appName);
    }
}
