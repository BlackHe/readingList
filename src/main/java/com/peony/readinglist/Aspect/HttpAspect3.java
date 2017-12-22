package com.peony.readinglist.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Create by Intellij IDEA<p/>
 * author:black<p/>
 * description:
 */
@Aspect
@Component
public class HttpAspect3 {

    private final Logger logger = LoggerFactory.getLogger(HttpAspect3.class);

    @Pointcut("execution(public * com.peony.readinglist.controller.ReadingListController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore() {
        logger.info("doBefore");
    }

    @After("log()")
    public void doAfter() {
        logger.info("doAfter");
    }
}
