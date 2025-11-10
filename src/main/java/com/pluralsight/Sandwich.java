 package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private int size;
    private String breadType;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> regularToppings;
    private ArrayList<String> sauces;
    private boolean toasted;
    private double price;

    public Sandwich(int size, String breadType,
                    ArrayList<String> meats,
                    ArrayList<String> cheeses,
                    ArrayList<String> regularToppings,
                    ArrayList<String> sauces,
                    boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.toasted = toasted;
        this.price = 0.0;

        calculatePrice();
    }

    // --- Calculate the total sandwich price ---
    public void calculatePrice() {
        // 1️⃣ Base sandwich price (depends on size)
        if (size == 4) {
            price = 5.50;
        } else if (size == 8) {
            price = 7.00;
        } else if (size == 12) {
            price = 8.50;
        }

        // 2️⃣ Meat prices
        if (meats.size() > 0) {
            if (size == 4) {
                price += meats.size() * 1.00;
            } else if (size == 8) {
                price += meats.size() * 2.00;
            } else if (size == 12) {
                price += meats.size() * 3.00;
            }
        }

        // 3️⃣ Cheese prices
        if (cheeses.size() > 0) {
            if (size == 4) {
                price += cheeses.size() * 0.75;
            } else if (size == 8) {
                price += cheeses.size() * 1.50;
            } else if (size == 12) {
                price += cheeses.size() * 2.25;
            }
        }

        // 4️⃣ Regular toppings, sauces are free — no price added
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType='" + breadType + '\'' +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", regularToppings=" + regularToppings +
                ", sauces=" + sauces +
                ", toasted=" + toasted +
                ", price=$" + price +
                '}';
    }
}
