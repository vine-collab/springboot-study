package com.blueberry.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author hekai
 * @create 2018-02-10-15:39
 */
public class RunnableFactoryBean implements FactoryBean<Runnable> {

    @Override
    public Runnable getObject() throws Exception {
        return () -> {};
    }

    @Override
    public Class<?> getObjectType() {
        return Runnable.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
