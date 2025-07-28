package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("reference/referenceconfig.xml");
        A a =(A)context.getBean("refA");
        System.out.println(a.getY());
        System.out.println(a.getObj().getName());

        System.out.println(a);
    }
}
