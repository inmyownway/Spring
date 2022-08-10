package com.example.aop1_re;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ParameterAop {

    @Pointcut("execution(* com.example.aop1_re.controller..*.*(..))")
    private void cut()
    {

    }

    @Before("cut()")
    public void before(JoinPoint joinPoint)
    {
        Object[] args = joinPoint.getArgs();

        for(Object obj : args)
        {
            System.out.println("type : "+obj.getClass().getSimpleName());
            System.out.println("value : "+obj);
        }
    }

    @AfterReturning(value = "cut()",returning = "returnobj")
    public void aftetReturn(JoinPoint joinPoint,Object returnobj)
    {
        System.out.println("Return obj");
        System.out.println(returnobj);
    }

}
