package com.peony.readinglist.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

//@Aspect
//@Component
public class HttpAspect1 {

    @Before("execution(public * com.peony.readinglist.controller.ReadingListController.getReadingList(..))")
    public void log() {
        System.out.println(1111111);
    }

    @After("execution(public * com.peony.readinglist.controller.ReadingListController.*(..))")
    public void doAfter() {
        System.out.println(2222222);
    }
}
