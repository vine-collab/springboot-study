package com.blueberry.springboot.aop.Wildcard;

import org.aspectj.lang.annotation.Pointcut;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cao
 * @date 2018-12-14 15:11
 */
//@Target({ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
public class TestWildcard {
    @Pointcut("@within(com.blueberry.springboot.aop.TestAspect.TestLogger)")
    public void recordLogPointcut() {
    }

}
