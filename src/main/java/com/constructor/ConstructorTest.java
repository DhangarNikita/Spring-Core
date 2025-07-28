package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor/constructorconfig.xml");
       Person p1=(Person) context.getBean("person");
        System.out.println(p1);

        Addition add= (Addition)context.getBean("add");
        add.sum();

    }
}
