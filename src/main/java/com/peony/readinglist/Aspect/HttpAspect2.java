package com.peony.readinglist.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Create by Intellij IDEA<p/>
 * author:black<p/>
 * description:
 */
@Aspect
@Component
public class HttpAspect2 {

    @Pointcut("execution(public * com.peony.readinglist.controller.ReadingListController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore() {
        System.out.println("doBefore..........");
    }

    @After("log()")
    public void doAfter() {
        System.out.println("doAfter...........");
    }
}
