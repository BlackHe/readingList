package com.peony.readinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Intrllij IDEA
 * User:black
 * Date:
 * Time:
 */
@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello(){
        return "hello";
    }
}
