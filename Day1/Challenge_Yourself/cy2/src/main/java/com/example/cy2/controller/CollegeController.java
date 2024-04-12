package com.example.cy2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cy2.model.College;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CollegeController {
    
    @GetMapping("/college")
    public Object getMethodName() {
        College college=new College();
        college.setcName("ABC College");
        college.setDeptName("Computer Science");
        college.setSec(1);
        return college;
    }
    
}
