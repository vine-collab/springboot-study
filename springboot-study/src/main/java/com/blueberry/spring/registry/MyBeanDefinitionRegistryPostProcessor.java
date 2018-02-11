package com.blueberry.spring.registry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.rmi.registry.Registry;

/**
 * @author hekai
 * @create 2018-02-11-16:47
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        for (int i = 0; i < 10; i++){
            BeanDefinitionBuilder definition = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            definition.addPropertyValue("name", "Tom" + i);
            definition.addPropertyValue("age", i);
            registry.registerBeanDefinition("persion" + i, definition.getBeanDefinition());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
