package com.blueberry.springboot.eventlisten;

import org.springframework.context.ApplicationEvent;

/**
 * 事件
 *
 * @author hekai
 * @create 2018-02-14-14:13
 */
public class MyApplicationEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
