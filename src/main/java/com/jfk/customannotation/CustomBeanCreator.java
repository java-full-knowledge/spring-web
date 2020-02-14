package com.jfk.customannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanCreator {

    @Bean("test")
    public CustomBean createCustomBean() {
        return new CustomBean();
    }
}
