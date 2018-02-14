package com.blueberry.springboot.extension;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hekai
 * @create 2018-02-14-17:34
 */
@Component
public class FinshedApplicationRunner implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("FinshedApplicationRunner.run:" + Arrays.asList(args.getSourceArgs()));
    }
}
