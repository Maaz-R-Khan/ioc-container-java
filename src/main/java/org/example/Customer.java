package org.example;

public class Customer implements Bean {
    protected String name;
    protected String address;

    public Customer() {
        this.name = "";
        this.address = "";
    }

    // parametric constructor that initializes name and address of customer.
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getBeanType() {
        return "Customer"; //placeholder
    }

    @Override
    public void showInfo() {
    System.out.println("Bean Type: " + getBeanType());
    System.out.println("Name : " + name);
    System.out.println("Address: " + address);
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //getter method for address.
    public String getAddress() {
        return address;
    }

    //setter method for address.
    public void setAddress(String address) {
        this.address = address;
    }

}
