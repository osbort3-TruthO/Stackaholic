package com.pluralsight.service;

import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Sandwich;

import java.util.Scanner;

public class Order {
    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;

    public void addSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void addDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like a drink? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter drink flavor (cola, lemonade, tea):");
            String flavor = scanner.nextLine();

            System.out.println("Enter drink size (small, medium, large):");
            String size = scanner.nextLine();

            double price = 0;
            if (size.equalsIgnoreCase("small")) price = 2.00;
            else if (size.equalsIgnoreCase("medium")) price = 2.50;
            else if (size.equalsIgnoreCase("large")) price = 3.00;

            drink = new Drink(flavor, size, price);
        }
    }

    public void addChips() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like chips? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Choose chip flavor: Plain Lays, BBQ, Hot Crunchy Curls, Doritos");
            String flavor = scanner.nextLine();

            chips = new Chips(flavor, 1.50);
        }
    }

    // --- Print receipt ---
    public void printReceipt() {
        System.out.println("----- Your Order -----");

        if (sandwich != null)
            System.out.println(sandwich);

        if (drink != null)
            System.out.println(drink); // toString() handles formatting now

        if (chips != null)
            System.out.println(chips); // toString() handles formatting now

        double total = 0.0;
        if (sandwich != null) total += sandwich.getPrice();
        if (drink != null) total += drink.getPrice();
        if (chips != null) total += chips.getPrice();

        System.out.println("----------------------");
        System.out.printf("Total: $%.2f%n", total); // 👈 Always shows two decimals
    }

}

