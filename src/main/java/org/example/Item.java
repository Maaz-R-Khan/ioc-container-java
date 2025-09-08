package org.example;

public class Item {
    protected String item;
    protected double price;


    //default constructor.
    public Item() {
        this.item = "";
        this.price = 0;
    }


    //two parameter constructor that initializes item and price.
    public Item(String item, double price) {
        this.item = item;
        this.price = price;
    }



    //getter method for item
    public String getItem() {
        return item;
    }

    //setter method for item.
    public void setItem(String item) {
        this.item = item;
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


