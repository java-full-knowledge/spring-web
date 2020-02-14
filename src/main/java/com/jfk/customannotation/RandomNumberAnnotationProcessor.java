package com.jfk.customannotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;

@Configuration
public class RandomNumberAnnotationProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;
    public Object postProcessBeforeInitialization(Object bean, String beanName) {

        if (bean.equals("randomNumberImpl")) {
            System.out.println("Bean : " + bean);
        }
//        Annotation[] annotations = bean.getClass().getAnnotations();
//        for (Annotation annotation : annotations) {
//            if (annotation instanceof Random) {
//                System.out.println("Random");
//            }
//        }
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}


















