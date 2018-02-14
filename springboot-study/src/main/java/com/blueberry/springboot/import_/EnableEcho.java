package com.blueberry.springboot.import_;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EchoImportBeanDefinitionRegistrar.class)
public @interface EnableEcho {

    String[] packages();
}
