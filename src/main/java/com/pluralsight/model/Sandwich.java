package com.pluralsight.model;

import java.util.ArrayList;

public class Sandwich {
    private int size;
    private String breadType;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;
    private boolean toasted;
    private double price;

    public Sandwich(int size, String breadType,
                    ArrayList<String> meats,
                    ArrayList<String> cheeses,
                    ArrayList<String> toppings,
                    ArrayList<String> sauces,
                    boolean toasted) {

        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.toppings = toppings;
        this.sauces = sauces;
        this.toasted = toasted;

        this.price = size * 1.50;  // simple price rule
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Sandwich: " + size + " inch, " + breadType +
                "\nMeats: " + meats +
                "\nCheeses: " + cheeses +
                "\nToppings: " + toppings +
                "\nSauces: " + sauces +
                "\nToasted: " + toasted +
                String.format("\nPrice: $%.2f", price);
    }
}
