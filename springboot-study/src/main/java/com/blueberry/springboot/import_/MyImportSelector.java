package com.blueberry.springboot.import_;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author hekai
 * @create 2018-02-13-18:19
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog.class.getName()));

        return new String[]{"com.blueberry.springboot.import_.User", Role.class.getName(), User.class.getName()};
    }
}
