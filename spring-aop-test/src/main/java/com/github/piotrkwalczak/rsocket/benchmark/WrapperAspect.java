package com.github.piotrkwalczak.rsocket.benchmark;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Aspect
public class WrapperAspect {

    @Around("@annotation(MyAnnotation)")
    public Object wrapReturnValue(ProceedingJoinPoint joinPoint) throws Throwable {
        return "Bye";
    }

//    @Around("@annotation(MyAnnotation2)")
//    public Flux<Object> wrapFlux(ProceedingJoinPoint joinPoint) throws Throwable {
//        Flux<Object> flux = (Flux<Object>) joinPoint.proceed();
//        return flux.map(Wrapper::new);
//    }
}
