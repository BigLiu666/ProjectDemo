package com.nowcoder.community.aspect;/*
 *@Description:
 *@author:liuliuliu
 *@version:
 *@date:2024/1/21  22:32
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AlphaAspect {
    //第一个*代表返回值类型（所有返回值），第二个*代表service下的所有的类，第三个*代表类下的所有方法
    //括号里的两个点代表所有的参数值类型
    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")  //在切入点之前进行一些逻辑
    public void before(){
        System.out.println("before");
    }

    @After("pointcut()")  //在切入点之后进行一些逻辑
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("pointcut()")  //在返回值之后进行一些逻辑
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointcut()")  //在抛异常之后进行一些逻辑
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @Around("pointcut()") //在目标组件之前和之后都进行一些逻辑
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("之前");
        Object obj = joinPoint.proceed();//调用的目标组件的方法
        System.out.println("之后");
        return obj;
    }
}
