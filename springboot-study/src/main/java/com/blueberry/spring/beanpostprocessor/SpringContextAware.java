package com.blueberry.spring.beanpostprocessor;

import org.springframework.context.ApplicationContext;

/**
 * @author hekai
 * @create 2018-02-11-14:23
 */
public interface SpringContextAware {

    public void setApplicationContext(ApplicationContext applicationContext);
}
