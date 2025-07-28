package com.life_cycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life_cycle/lifecycle.xml");
        context.registerShutdownHook();

        XmlConfiguration xml = (XmlConfiguration) context.getBean("xml");
        System.out.println(xml);

        UsingInterface inter =(UsingInterface) context.getBean("inter");
        System.out.println(inter);

        UsingAnnotation ua=(UsingAnnotation) context.getBean("anno");
        System.out.println(ua);


    }
}
