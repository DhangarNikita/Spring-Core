package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope/prototypeconfig.xml");

        Prototype pro=(Prototype) context.getBean("prototype", Prototype.class);
        System.out.println(pro);

        Prototype pro1=(Prototype) context.getBean("prototype", Prototype.class);

        System.out.println(pro.hashCode());
        System.out.println(pro1.hashCode());

    }
}
