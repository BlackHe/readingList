package com.peony.readinglist.serviceImpl;

import com.peony.readinglist.service.ReaderService;
import org.springframework.data.jpa.repository.Query;

public class ReaderServiceImpl implements ReaderService {


    @Override
    @Query("select id from wd_t_table")
    public void addreader() {
        System.out.println("ssssss");
    }
}
