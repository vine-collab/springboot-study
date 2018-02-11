package com.blueberry.spring.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-13:55
 */
//@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("====postProcessBeforeInitialization====="+ s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("====postProcessAfterInitialization====="+ s);
        return o;
    }
}
