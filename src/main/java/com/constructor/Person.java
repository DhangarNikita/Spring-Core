package com.constructor;

public class Person {
    private String name;
    private int age;
    private Certificate certi;

    public Person(String name, int age, Certificate certi) {
        this.name = name;
        this.age = age;
        this.certi= certi;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", certi=" + certi +
                '}';
    }
}
