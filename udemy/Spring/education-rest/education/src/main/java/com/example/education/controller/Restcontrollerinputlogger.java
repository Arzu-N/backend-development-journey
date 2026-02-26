package com.example.education.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Restcontrollerinputlogger {
    private static Logger log = LoggerFactory.getLogger(Restcontrollerinputlogger.class);
    @Before("execution(* com.example.education.controller..*(..))")
    public void logbefore(JoinPoint joinpoint){
        Signature signature = joinpoint.getSignature();
        String name = signature.getName();
        String args = Arrays.toString(joinpoint.getArgs());
  log.info("Method execution: {} with arguments: {}",name,args);
    }
    @AfterReturning(pointcut= "execution(* com.example.education.controller..*(..))",returning= "result")
    public void afterreturning(JoinPoint joinpoint,Object result){
        Signature signature = joinpoint.getSignature();
        String name = signature.getName();
        Object[] args = joinpoint.getArgs();
log.info("Method: {} executed successfully result: {}",name,result);
    }
    @AfterThrowing(pointcut="execution(* com.example.education.controller..*(..))",throwing="ex")
    public void logafterthrowing(JoinPoint joinpoint,Exception ex){
        Signature signature = joinpoint.getSignature();
        String name = signature.getName();
        Object[] args = joinpoint.getArgs();
        log.error("Method: {} thrown an exception: {}",name,ex.getMessage());
    }
}
