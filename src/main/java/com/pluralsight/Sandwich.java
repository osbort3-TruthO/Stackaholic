package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {

    private int size;
    private String breadType;
    private ArrayList<String> meats;
    private ArrayList<String> regularToppings;
    private ArrayList<String> cheeses;
    private boolean toasted;

    public Sandwich(int size, String breadType, ArrayList<String> meats, ArrayList<String> regularToppings, ArrayList<String> cheeses, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.regularToppings = regularToppings;
        this.cheeses = cheeses;
        this.toasted = toasted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public ArrayList<String> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<String> meats) {
        this.meats = meats;
    }

    public ArrayList<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(ArrayList<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public ArrayList<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(ArrayList<String> cheeses) {
        this.cheeses = cheeses;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
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
                '}';
    }
}
