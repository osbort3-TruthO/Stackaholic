package com.pluralsight.model;

public class Chips {
    private String type; // Plain, BBQ, Doritos, Hot Crunchy Curls
    private double price;

    public Chips(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Chips{" +
                "type='" + type + '\'' +
                ", price=$" + String.format("%.2f", price) +
                '}';
    }
}
