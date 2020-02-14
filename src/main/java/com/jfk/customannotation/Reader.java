package com.jfk.customannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Reader {

    @Qualifier("web")
    @Autowired
    private WebMessageReader messageReader;

    @Autowired
    private CustomBean test;
}
