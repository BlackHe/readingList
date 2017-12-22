package com.peony.readinglist.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * Create by Intellij IDEA<p/>
 * author:black<p/>
 * description:
 */
@Aspect
@Component
public class HttpAspect4 {

    private final Logger logger = LoggerFactory.getLogger(HttpAspect4.class);

    @Pointcut("execution(public * com.peony.readinglist.controller.ReadingListController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();

        //url
        logger.info(requestAttributes.getRequest().getRequestURL().toString());
        //method
        logger.info(requestAttributes.getRequest().getMethod());
        //ip
        logger.info(requestAttributes.getRequest().getRemoteAddr());
        //类.方法
        logger.info(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //agrs
        logger.info(joinPoint.getArgs().toString());
    }

    @After("log()")
    public void doAfter( ) {
        logger.info("2222222222");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info(object.toString());
    }
}
