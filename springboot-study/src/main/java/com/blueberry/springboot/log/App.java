package com.blueberry.springboot.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动参数：--debug
 * springboot默认的日志级别是info
 * 可以通过logging.level.*=debug来设置，*可以为包，或者是某个类
 *
 * 日志级别：TRACE,DEBUG,WARN,ERROR,FATAL,OFF
 *
 * 日志文件10M为切割
 * logging.file指定日志文件
 * logging.path指定日志文件位置，文件名默认spring.log
 *
 * 日志格式：
 * logging.pattern.console配置控制台日志格式
 * logging.file.console配置文件日志格式
 *
 * springboot默认支持logback日志，只需要在classpath下放置logback.xml或者logback-spring.xml即可
 *
 * @author hekai
 * @create 2018-02-20-10:24
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(LogTest.class).testLog();
        context.close();
    }
}
