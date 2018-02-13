package com.blueberry.springboot.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author hekai
 * @create 2018-02-13-10:51
 */
@SpringBootConfiguration
public class EncodingConvertConfiguration {

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodingConvert createUtf8EncodingConvert(){
        return new UTF8EncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodingConvert createGbkEncodingConvert(){
        return new GBKEncodingConvert();
    }
}
