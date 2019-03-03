package com.mandla.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BusinessAspect {

@Pointcut(value = "execution(* com.mandla.test.service.BusinessService.*(..))")
public void test(){

}

@After(value = "test()")
public void aroundAdvice(JoinPoint proceedingJoinPoint) throws Throwable{

    System.out.println("Inside around Advice method...." + " inserted before " + proceedingJoinPoint.getSignature().getName()+" method");
    /*try {
        proceedingJoinPoint.proceed();

    }finally {

    }*/

}


}
