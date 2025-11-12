package com.pluralsight;

import java.util.ArrayList;

public class Order {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Chips> chips;
    private ArrayList<Drink> drinks;

    public Order(ArrayList<Sandwich> sandwiches, ArrayList<Chips> chips, ArrayList<Drink> drinks) {
        this.sandwiches = sandwiches;
        this.chips = chips;
        this.drinks = drinks;
    }

    public  void addSandwich (Sandwich sandwich) {

    }

    public void addDrink (Drink drink) {

    }

    public void addChips (Chips chip){

    }
}
