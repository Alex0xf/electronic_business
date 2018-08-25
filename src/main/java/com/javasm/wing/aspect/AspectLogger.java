package com.javasm.wing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {
//    @Pointcut("execution(* com.javasm.wing.action.*.*(..))")
//    public void anyMethod(){
//
//    }
//
//    @Before("anyMethod()")
//    public void beforeMethod(JoinPoint joinPoint){
//        System.out.println("进入");
//        if (joinPoint!=null) {
//            Object[] obj  = joinPoint.getArgs();
//            System.out.println(obj.length);
//           for (Object o:obj ){
//               System.out.println(o);
//           }
//        }
//
//
//
//        System.out.println("出前置通知");
//    }

}
