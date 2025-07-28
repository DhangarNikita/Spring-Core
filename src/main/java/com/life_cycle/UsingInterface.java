package com.life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean {
    private int a;
    private String name;

    public UsingInterface(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public UsingInterface(){

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UsingInterface{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is init method of interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("This is destroy method of interface");
    }
}
