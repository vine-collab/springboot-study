package com.blueberry.springboot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-21:14
 */
@Data
@Component
@ConfigurationProperties(prefix = "db")
public class DataSourceConfig {

    private String username;

    private String password;

}
