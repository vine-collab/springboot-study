package com.blueberry.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author hekai
 * @create 2018-02-10-19:12
 */
@ComponentScan(basePackages = "com.blueberry.spring", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = ExcludeConfig.class))
@Configuration
public class AnnotationScan {

}
