package com.blueberry.springboot.aop.Wildcard;

import org.springframework.stereotype.Service;

/**
 * @author cao
 * @date 2018-12-14 15:08
 */
@Service("CatService")
public class CatServiceImpl implements AnimalService {

    @Override
    public void bray() {
        System.out.println("喵喵叫");
    }
}
