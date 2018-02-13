package com.blueberry.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * @author hekai
 * @create 2018-02-13-10:52
 */
public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = System.getProperty("file.encoding");
        if(!StringUtils.isEmpty(property)){
            return Objects.equals("utf-8", property.toLowerCase());
        }
        return false;
    }

}
