package com.example.q4.model;

import java.time.LocalDate;

public class Book {
     String title;
     String auth;
     LocalDate pubdate;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuth() {
        return auth;
    }
    public void setAuth(String auth) {
        this.auth = auth;
    }
    public LocalDate getPubdate() {
        return pubdate;
    }
    public void setPubdate(LocalDate pubdate) {
        this.pubdate = pubdate;
    }
     
}
