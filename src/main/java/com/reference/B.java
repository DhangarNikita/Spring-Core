package com.reference;

public class B {
    private int x;
    private String name;

    public B(){

    }

    public B(int x, String name) {
        this.x = x;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                ", name='" + name + '\'' +
                '}';
    }
}
