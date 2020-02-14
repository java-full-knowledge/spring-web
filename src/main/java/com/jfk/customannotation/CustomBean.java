package com.jfk.customannotation;

import javax.annotation.PostConstruct;

public class CustomBean {


    @PostConstruct
    public void setup() {
        System.out.println("setup");
    }
}















