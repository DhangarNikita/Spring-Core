package com.autowiring;

public class XmlBase {
    private Address address;

    public XmlBase(Address address) {
        System.out.println("By constructor");
        this.address = address;
    }

    public XmlBase(){

    }

    public Address getAddress() {
        return address;
    }

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
