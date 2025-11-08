package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {

    private int size;
    private String breadType;
    private ArrayList<String> meats;
    private ArrayList<String> regularToppings;
    private ArrayList<String> cheeses;
    private boolean toasted;
    private double price;

    // Constructor for simple price-only sandwich (optional)
    public Sandwich(double price) {
        this.price = price;
    }

    // Full constructor
    public Sandwich(int size, String breadType, ArrayList<String> meats, ArrayList<String> regularToppings, ArrayList<String> cheeses, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.regularToppings = regularToppings;
        this.cheeses = cheeses;
        this.toasted = toasted;

        calculateBasePrice();
        addToppingPrice(); // calculates extra toppings
    }

    // Getters and setters
    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public String getBreadType() { return breadType; }
    public void setBreadType(String breadType) { this.breadType = breadType; }

    public ArrayList<String> getMeats() { return meats; }
    public void setMeats(ArrayList<String> meats) { this.meats = meats; }

    public ArrayList<String> getRegularToppings() { return regularToppings; }
    public void setRegularToppings(ArrayList<String> regularToppings) { this.regularToppings = regularToppings; }

    public ArrayList<String> getCheeses() { return cheeses; }
    public void setCheeses(ArrayList<String> cheeses) { this.cheeses = cheeses; }

    public boolean isToasted() { return toasted; }
    public void setToasted(boolean toasted) { this.toasted = toasted; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Calculate base price by size
    public void calculateBasePrice() {
        if (size == 4) {
            price = 5.50;
        } else if (size == 8) {
            price = 7.00;
        } else if (size == 12) {
            price = 8.50;
        } else {
            price = 0.0;
        }
    }

    // Add extra price for meats and cheeses
    public void addToppingPrice() {
        double extra = 0.0;

        if (meats != null) {
            extra += meats.size() * 1.0; // 1.00 per meat for simplicity
        }

        if (cheeses != null) {
            extra += cheeses.size() * 0.75; // 0.75 per cheese
        }

        price += extra;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType='" + breadType + '\'' +
                ", meats=" + meats +
                ", regularToppings=" + regularToppings +
                ", cheeses=" + cheeses +
                ", toasted=" + toasted +
                ", price=" + price +
                '}';
    }
}
