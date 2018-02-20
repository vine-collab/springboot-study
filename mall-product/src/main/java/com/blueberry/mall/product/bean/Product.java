package com.blueberry.mall.product.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author hekai
 * @create 2018-02-20-22:23
 */
@Data
public class Product {

    private Long id;

    private String name;

    private BigDecimal price;

    private Integer type;

    private LocalDateTime createdAt;
}
