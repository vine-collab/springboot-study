package com.blueberry.springboot.aop;

import com.blueberry.springboot.aop.validation.PayRequestDto;
import org.springframework.stereotype.Component;

/**
 * @author cao
 * @date 2019-01-10 19:48
 */
@Component
public class TestValidateService {


    public String hello(PayRequestDto payRequestDto){
        return "草泥马";
    }
}
