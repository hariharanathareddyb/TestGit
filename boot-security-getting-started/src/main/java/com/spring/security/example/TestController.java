package com.spring.security.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String handler() {
        Authentication auth = SecurityContextHolder.getContext()
                                                   .getAuthentication();
        System.out.println("user: "+ auth.getName());
        System.out.println("roles: "+ auth.getAuthorities());
        return "hello!";
    }
}