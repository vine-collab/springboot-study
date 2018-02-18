package com.blueberry.springboot.redis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(RedisAutoConfiguration.class)
public @interface EnableRedis {
}
