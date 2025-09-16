package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Bean{

    List<Item> items;
    Customer customer;

    //one parameter constructor that takes customer instance and sets customer member variable.
    public ShoppingCart(Customer customer){
        this.customer = customer;
        items = new ArrayList<>();
    }


    @Override
    public void showInfo() {
        System.out.println("Bean Type: " + getBeanType());
        System.out.println("Customer Name:   " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Cost:" + getTotalCost());
        System.out.printf("Cost: %.2f%n", getTotalCost());

        // table header
        System.out.printf("%15s %15s%n", "Item Name", "Item Price");

        // table rows
        for (Item item : items) {
            System.out.printf("%15s %15.2f%n", item.getName(), item.getPrice());
        }
    }


    @Override
    public String getBeanType()  {
        return "ShoppingCart";
    }

    //add the given name to items collection.
    public void add(Item item) {
        items.add(item);
    }

    //returns the total cost of all items in the collection.
    double getTotalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
    }
        return total;
    }

    //clears all items from items collection.
    void clear(){
        items.clear();
    }

    //getter method for customer
    public Customer getCustomer() {
        return customer;
    }

    //getter method for items
    public List<Item> getItems() {
        return items;
    }
}
