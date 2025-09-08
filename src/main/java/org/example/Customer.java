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
        return null; //placeholder
    }

    @Override
    public void showInfo() {}

}
