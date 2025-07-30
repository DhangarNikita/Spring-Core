package com.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("prototype")
@Scope("prototype")
public class Prototype {
  @Value("22")
    private int age;
    @Value("Ruchita")
    private String name;

    public Prototype(){

    }

    public Prototype(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

