package com.peony.readinglist.login.controller;

import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Create by Intellij IDEA
 * User:black
 * description:
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        return "login";
    }
}
