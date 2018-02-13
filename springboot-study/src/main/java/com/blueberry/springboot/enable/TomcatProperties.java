package com.blueberry.springboot.enable;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hekai
 * @create 2018-02-12-12:39
 */
@Data
@Component
@ConfigurationProperties(prefix = "ds")
public class TomcatProperties {

    private List<String> hosts = new ArrayList<>();

    private Integer[] ports;

}
