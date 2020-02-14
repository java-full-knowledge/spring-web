package com.jfk.customannotation;

import org.springframework.stereotype.Component;

@Component
public class RandomNumberImpl {

    @Random(min = 1, max = 100)
    private int number;

    public int getNumber() {
        return this.number;
    }
}
