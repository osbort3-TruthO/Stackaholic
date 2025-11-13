package com.pluralsight.model;

public class Chips {

    private String type; // e.g., "BBQ", "Plain Lays", etc.
    private double price;

    // Constructor
    public Chips(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return type + " $" + price;
    }
}
