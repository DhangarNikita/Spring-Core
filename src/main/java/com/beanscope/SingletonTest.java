package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope/singletonconfig.xml");

        Singleton sin =(Singleton)context.getBean("single");
        Singleton sin1 =(Singleton)context.getBean("single");
        System.out.println(sin);


        System.out.println(sin.hashCode());
        System.out.println(sin1.hashCode());
    }
}
