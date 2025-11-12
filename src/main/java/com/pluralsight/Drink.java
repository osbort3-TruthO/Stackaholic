package com.pluralsight;

public class Drink {

    private String size;
    private String flavor;
    private double price;

    // constructor with size + flavor only
    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;

        // set price automatically based on size
        if (size.equalsIgnoreCase("Small")) {
            this.price = 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            this.price = 2.50;
        } else if (size.equalsIgnoreCase("Large")) {
            this.price = 3.00;
        } else {
            this.price = 0.0;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=$" + price +
                '}';
    }
}
