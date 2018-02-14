package com.blueberry.springboot.eventlisten;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 监听器
 *
 * @author hekai
 * @create 2018-02-14-14:14
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("接收到的事件：" + event.getClass());
    }
}
