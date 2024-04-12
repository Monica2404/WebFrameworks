package com.example.q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/students")
    public Object getMethodName() {
        Student student=new Student();
        student.setName("Monica");
        student.setAge(19);
        return student;
    }
    
}
