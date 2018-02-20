package com.blueberry.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * 异常处理：
 * 除去springboot默认异常@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
 *
 * metric查看：
 * CounterService.increment统计调用
 * GaugeService.submit统计某个值
 *
 * @author hekai
 * @create 2018-02-16-17:52
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@PropertySource("classpath:demo.properties")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
