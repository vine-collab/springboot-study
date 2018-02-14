package com.blueberry.springboot.import_;

import com.blueberry.spring.beanpostprocessor.EchoBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author hekai
 * @create 2018-02-13-20:41
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        String[] strPackages = (String[]) annotationAttributes.get("packages");
        List<String> packages = Arrays.asList(strPackages);
        System.out.println("EchoImportBeanDefinitionRegistrar.registerBeanDefinitions packages:" + packages);

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EnableEcho.class);
        builder.addPropertyValue("packages", builder.getBeanDefinition());

        registry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(), builder.getBeanDefinition());
    }
}




















