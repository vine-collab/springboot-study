package com.blueberry.springboot.aop.Wildcard;

import org.springframework.stereotype.Service;

/**
 * @author HEK(hk177955)
 * @date 2018-12-14 15:08
 */
@Service("DogService")
public class DogServiceImpl implements AnimalService {

    @Override
    public void bray() {
        System.out.println("狗狗叫");
    }
}
