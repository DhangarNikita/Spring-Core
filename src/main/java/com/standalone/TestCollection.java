package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone/standaaloneconfig.xml");
        Collection collection1=(Collection)context.getBean("collection1");
        System.out.println(collection1);
        System.out.println(collection1.getName().getClass().getName());
    }
}
