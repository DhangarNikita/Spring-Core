package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("first/config.xml");
        Student student1= (Student)context.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);

        Student s3=(Student)context.getBean("student3");
        System.out.println(s3);
    }
}
