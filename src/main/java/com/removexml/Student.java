package com.removexml;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        this.address.read();
     System.out.println("Enter student information");
 }
}
