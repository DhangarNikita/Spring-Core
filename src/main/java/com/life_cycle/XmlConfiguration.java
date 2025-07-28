package com.life_cycle;

public class XmlConfiguration {
    private String name;
    private int age;

    public XmlConfiguration(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public XmlConfiguration(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "XmlConfiguration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void init(){
        System.out.println("This is init method");
    }

    public void destroy(){
        System.out.println("This is destroy method");
    }
}
