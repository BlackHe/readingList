package com.peony.readinglist.test;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Intellij IDEA<p/>
 * author:black<p/>
 * description:jpa 调用存储过程
 */
public class JpaCallProcedureTest {

    @RequestMapping("proc")
    public void callProcTest() {

    }

    @Query(" select id from book ")
    public void proc(){

    }


}
