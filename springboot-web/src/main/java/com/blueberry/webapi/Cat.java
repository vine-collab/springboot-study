package com.blueberry.webapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cao
 * @date 2018-12-17 17:11
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Cat {
    private int age;
    private String name;

}
