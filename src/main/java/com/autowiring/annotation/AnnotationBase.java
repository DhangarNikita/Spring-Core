package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationBase {
   // @Autowired
   //@Qualifier
    private Address address;

  //@Autowired
    //@Qualifier
    public AnnotationBase(Address address) {
        System.out.println("By constructor");
        this.address = address;
    }

    public AnnotationBase(){

    }

    public Address getAddress() {
        return address;
    }
@Autowired
@Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "XmlBase{" +
                "address=" + address +
                '}';
    }
}
