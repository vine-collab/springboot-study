package com.blueberry.springboot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author hekai
 * @create 2018-02-12-13:24
 */
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try (InputStream inputStream = new FileInputStream("G:\\programming\\codespace\\blueberry\\springboot-study\\src\\main\\resources\\META-INF\\springboot.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            PropertiesPropertySource propertySource = new PropertiesPropertySource("my", properties);
            environment.getPropertySources().addLast(propertySource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
