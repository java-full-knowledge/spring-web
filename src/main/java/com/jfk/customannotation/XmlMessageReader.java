package com.jfk.customannotation;

import org.springframework.stereotype.Component;

@Component(value = "xml")
public class XmlMessageReader implements MessageReader {
    @Override
    public String read() {
        System.out.println("XML reading");
        return null;
    }
}
