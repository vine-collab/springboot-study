package com.blueberry.webapi.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-20-13:24
 */
@Component
public class MyHealthIndictor implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().withDetail("sorry_error", "spring_boot_error").build();
    }
}
