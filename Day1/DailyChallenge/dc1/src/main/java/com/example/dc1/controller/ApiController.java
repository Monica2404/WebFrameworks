package com.example.dc1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/name")
    public String getMethodName(@RequestParam String param) {
        return "Welcome "+param+"!";
    }
    
}
