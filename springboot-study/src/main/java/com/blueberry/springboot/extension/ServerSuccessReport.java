package com.blueberry.springboot.extension;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hekai
 * @create 2018-02-14-16:54
 */
@Order(2)
@Component
public class ServerSuccessReport implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ServerSuccessReport.run:" + Arrays.asList(args));
    }
}
