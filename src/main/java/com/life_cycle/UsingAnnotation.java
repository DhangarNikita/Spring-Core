package com.life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
    private String name;

    public UsingAnnotation(String name) {
        this.name = name;
    }

    public UsingAnnotation(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UsingAnnotation{" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void run(){
        System.out.println("Init method using annotation");
    }

    @PreDestroy
    public void end(){
        System.out.println("Destroy method using annotation");
    }
}
