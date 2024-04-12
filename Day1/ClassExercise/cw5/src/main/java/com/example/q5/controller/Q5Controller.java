package com.example.q5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q5.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Q5Controller {
    @GetMapping("/student")
    public List<Student> getList() {
        List<Student> stu=new ArrayList<>();
        Student stu1=new Student();
        stu1.setStuName("Monica");
        stu1.setMess("Welcome Monica");
        stu.add(stu1);
        Student stu2=new Student();
        stu2.setStuName("Patrick");
        stu2.setMess("Welcome Patrick");
        stu.add(stu2);
        return stu;
    }
    
}
