package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInformation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype/stereotypeconfig.xml");
        Information info=(Information)context.getBean("info");
        System.out.println(info);
        System.out.println(info.getCourse().getClass().getName());
    }
}
