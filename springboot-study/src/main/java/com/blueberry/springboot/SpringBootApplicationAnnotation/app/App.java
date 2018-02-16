package com.blueberry.springboot.SpringBootApplicationAnnotation.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 启动流程：
 * 1、判断是不是web环境
 * 2、加载所有classpath下META/INF/spring.factories ApplicationContextInitializer
 * 3、加载所有classpath下META/INF/spring.factories ApplicationListener
 * 4、推断main方法所在类
 * 5、开始执行run方法
 * 6、设置java.awt.headless系统变量
 * 7、加载所有classpath下META/INF/spring.factories SpringApplicationRunListener
 * 8、执行所有SpringApplicationRunListener的started方法
 * 9、实例化ApplicationArguments对象
 * 10、创建environment
 * 11、配置environment，主要是把run方法的参数配置到environment
 * 12、执行所有的SpringApplicationRunListener的environmentPrepared方法
 * 13、如果不是web环境但是web的environment，转换environment为标准的environment
 * 14、输出banner
 *
 * @author hekai
 * @create 2018-02-14-19:20
 */
@SpringBootApplication(scanBasePackages = "com.blueberry.springboot.SpringBootApplicationAnnotation")
public class App {

    @Value("${local.ip}")
    private String host;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        Map<String, Object> defaultsProperties = new HashMap<>();
        defaultsProperties.put("local.ip", "192.168.1.200");
        application.setDefaultProperties(defaultsProperties);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.close();
    }

}
