package com.example.ph1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello World";
    }
    
}
