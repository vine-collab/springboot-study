package com.blueberry.springboot.properties_;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-21:03
 */
@Component
public class JdbcConfig {

    @Value("${url}")
    private String url;

    @Value("${driverClass}")
    private String driver;

    public void show() {
        System.out.println("=======JdbcConfig.show=========");
        System.out.println(url + ":" + driver);
    }
}
