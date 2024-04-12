package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Q1Controller {
    @GetMapping("/hello")
    public String getMethodName() {
        return " hello world";
    }
    
}
