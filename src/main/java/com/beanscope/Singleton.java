package com.beanscope;

import org.springframework.beans.factory.annotation.Value;

public class Singleton {
    private int age;
    private String name;

    public Singleton(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Singleton(){

    }


    public int getAge() {
        return age;
    }
@Value("10")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
@Value("Nikita")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
