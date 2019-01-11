package com.blueberry.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author hekai
 * @create 2018-02-17-21:03
 */
@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.blueberry.springboot.aop..*Service.*(..))")
    protected void log() {
        System.out.println("=======before=======" + AopContext.currentProxy().getClass());
    }

    @After("execution(* com.blueberry.springboot.aop..*Service.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("=======afterLog=======:" + joinPoint.getTarget().getClass().getName());
        System.out.println(joinPoint.getArgs());
    }


//    @Pointcut("within(com.blueberry.springboot.aop.Wildcard.AnimalService+)")
    @Pointcut("execution(* com.blueberry.springboot.aop..*.*(..))")
    public void pointcut() {}

    @Around("pointcut()")
    public Object timer(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名

        logger.info("请求开始，方法：------- {}", methodName);

        Object result = null;

        try {
            // 一切正常的情况下，继续执行被拦截的方法
            result = pjp.proceed();
        } catch (Throwable e) {
            logger.info("exception: ", e);
        }
        long endTime = System.currentTimeMillis();
        logger.info("请求结束，方法：{}，执行时间：{}", methodName, (endTime - beginTime));
        return result;
    }

}
