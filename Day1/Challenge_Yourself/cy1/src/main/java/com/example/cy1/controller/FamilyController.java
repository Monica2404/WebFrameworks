package com.example.cy1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cy1.model.Family;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FamilyController {
    @GetMapping("/family")
    public List<Family> getMethodName() {
        List<Family> fam=new ArrayList<>();
        Family fam1=new Family();
        fam1.setName("John");
        fam1.setAge(20);
        fam1.setRelation("Son");
        fam.add(fam1);
        Family fam2=new Family();
        fam2.setName("Antony");
        fam2.setAge(40);
        fam2.setRelation("Father");
        fam.add(fam2);
        return fam;
        
    }
    
}
