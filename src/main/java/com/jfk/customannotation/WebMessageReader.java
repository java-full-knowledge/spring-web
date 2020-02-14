package com.jfk.customannotation;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component(value = "web")
public final class WebMessageReader implements MessageReader {


    @Override

    public String read() {
        System.out.println("WEB Reading...");
        return null;
    }
}























