package org.example;

public class Item {
    protected String name;
    protected double price;


    //default constructor.
    public Item() {
        this.name = "";
        this.price = 0;
    }


    //two parameter constructor that initializes name and price.
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }



    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name.
    public void setName(String name) {
        this.name = name;
    }

    //getter method for price.
    public double getPrice() {
        return price;
    }

    //setter method for price.
    public void setPrice(double price) {
        this.price = price;
    }
}


