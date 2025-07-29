package com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotationautowiredconfig.xml");
        AnnotationBase ann =(AnnotationBase) context.getBean("ann");

        System.out.println(ann);

    }
}
