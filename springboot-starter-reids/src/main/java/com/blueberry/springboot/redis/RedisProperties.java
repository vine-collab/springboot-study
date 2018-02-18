package com.blueberry.springboot.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hekai
 * @create 2018-02-18-12:07
 */
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private Integer port;

    private String host;

}
