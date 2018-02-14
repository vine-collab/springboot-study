package com.blueberry.springboot.import_;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Data
public class MyBeanPostProcessor implements BeanPostProcessor {

    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(!CollectionUtils.isEmpty(packages)){
           packages.forEach(item -> {
               if(o.getClass().getName().startsWith(item)){
                   System.out.println("echo bean : " + o.getClass().getName());
               }
           });
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("=======MyBeanPostProcessor.postProcessAfterInitialization========");
        return o;
    }
}