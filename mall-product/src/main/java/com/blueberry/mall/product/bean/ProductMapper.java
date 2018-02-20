package com.blueberry.mall.product.bean;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

    @Insert("insert into tb_product(name, type, price) VALUES (#{name}, #{type}, #{price})")
    public int add(Product product);
}
