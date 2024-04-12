package com.example.dc2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.dc2.model.Contact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ContactController {
    
    @GetMapping("/contact")
    public List<Contact> getMethodName() {
        List<Contact> con=new ArrayList<>();
        Contact contact=new Contact();
        contact.setId(101);
        contact.setFname("Moni");
        contact.setLname("Jothiramalingam");
        contact.setEmail("moni24@gmail.com");
        contact.setPhno("9894282995");
        con.add(contact);
        return con;
    }
    
}
