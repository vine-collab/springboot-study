package com.blueberry.springboot.import_;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableLog {

    String name();
}
