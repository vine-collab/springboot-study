package com.blueberry.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author hekai
 * @create 2018-02-10-16:18
 */
public class Cat implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====afterPropertiesSet====");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("====destroy====");
    }
}
