package com.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.removexml")
public class StudentConfig {
@Bean
    public Student getStudent(){
        return new Student(getAddress());
    }
@Bean
    public Address getAddress(){
        return new Address();
    }

}
