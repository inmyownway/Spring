package com.example.aop_pratice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component // 스프링에서 관리
public class ParameterAop {

    @Pointcut("execution(* com.example.aop_pratice.controller..*.*(..))")
    private void cut()
    {

    }
    @Before("cut()") // cutㅇㅣ 실행 되는지점
    public void before(JoinPoint joinPoint) // 메소드가 실행되기전에 어떤 argument 가 넘어가는지
    {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());
        Object[] args = joinPoint.getArgs();



        for(Object obj : args)
        {
            System.out.println("type: " + obj.getClass().getSimpleName());
            System.out.println("vakye: " + obj);

        }

    }

    @AfterReturning(value = "cut()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint,Object returnObj) {
        System.out.println("return obj");
        System.out.println(returnObj);

    }
}
