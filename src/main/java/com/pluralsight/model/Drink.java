package com.pluralsight.model;

public class Drink {
    private String size; // small, medium, large
    private String flavor; // cola, lemonade, etc
    private double price;

    public Drink(String size, String flavor, double price) {
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }

    public String getSize() { return size; }
    public String getFlavor() { return flavor; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=$" + String.format("%.2f", price) +
                '}';
    }
}
