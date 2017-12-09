package com.peony.readinglist.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Create by Intellij IDEA
 * User:black
 * description:
 */
@Component
public class TaskDemo {

    @Scheduled(cron = "0 0/1 8-20 * * ?")
    public void say() {
        System.out.println();
        Thread thread = Thread.currentThread();
        System.out.println("run thread one,threadId is :"+thread.getId());
    }
}
