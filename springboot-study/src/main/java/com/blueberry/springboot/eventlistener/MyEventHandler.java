package com.blueberry.springboot.eventlistener;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-14-14:46
 */
@Component
public class MyEventHandler {

    /**
     * 参数必须是ApplicationEvent或其子类
     * @param event
     */
    @EventListener
    public void event(MyApplicationEvent event){
        System.out.println("接收到的事件：" + event.getClass());
    }

    /**
     * 应用停止监听
     * @param event
     */
    @EventListener
    public void event2(ContextStoppedEvent event){
        System.out.println("应用停止事件：" + event.getClass());
    }

}
