package com.blueberry.springboot.enable;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author hekai
 * @create 2018-02-13-16:52
 */
@Component
public class Jeep implements Runnable {

    @Async
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("============" + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
