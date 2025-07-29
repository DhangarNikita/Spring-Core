package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autowiringconfig.xml");
        XmlBase xml =(XmlBase) context.getBean("xml");

        System.out.println(xml);

    }
}
