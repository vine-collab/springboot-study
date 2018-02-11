package com.blueberry.spring.ext;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-11-13:39
 * spring4.3 新特性：
 * 1、构造函数只能有一个，如果有多个的话必然有一个无参构造函数，此时spring回调用无参构造函数
 * 2、构造函数的参数必须存在于spring容器中
 */
@Component
public class Bank {

    private ApplicationContext applicationContext;

    public Bank(ApplicationContext applicationContext, Book book){
        book.toString();
        this.applicationContext = applicationContext;
    }

    public void show(){
        System.out.println("========Bank.show=========");
    }

}
