package com.pluralsight.ui;

import com.pluralsight.model.Sandwich;
import com.pluralsight.service.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Colors help from chatgpt
    public static final String RESET = "\u001B[0m";
    public static final String BREAD = "\u001B[33m";   // yellow
    public static final String LETTUCE = "\u001B[92m"; // green
    public static final String TOMATO = "\u001B[91m";  // red
    public static final String CHEESE = "\u001B[93m";  // light yellow
    public static final String MEAT = "\u001B[31m";    // dark red

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showHomeScreen();
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                Order order = new Order();
                boolean ordering = true;

                while (ordering) {
                    showOrderMenu();
                    int orderChoice = input.nextInt();
                    input.nextLine();

                    switch (orderChoice) {
                        case 1 -> {
                            Sandwich sandwich = buildSandwich(input);
                            order.addSandwich(sandwich);
                            System.out.println("\n✅ Sandwich added to order!");
                        }
                        case 2 -> order.addDrink();
                        case 3 -> order.addChips();
                        case 4 -> {
                            System.out.println("\n🧾 Checking out...");
                            order.printReceipt();
                            order.saveReceiptToFile();
                            ordering = false;
                        }
                        case 0 -> {
                            System.out.println("\n❌ Order canceled. Returning to home screen.");
                            ordering = false;
                        }
                        default -> System.out.println("❌ Invalid choice.");
                    }
                }

            } else if (choice == 0) {
                System.out.println("\n👋 Thank you for visiting Stackaholic!");
                running = false;
            } else {
                System.out.println("\n❌ Invalid choice. Try again.");
            }
        }

        input.close();
    }

    //  homescreen
    public static void showHomeScreen() {
        System.out.println();
        System.out.println(BREAD + "★・・・・・・★★・・・・・・★★・・・・・・★" + RESET);
        System.out.println(LETTUCE + "      STACKAHOLIC SANDWICHES        " + RESET);
        System.out.println(TOMATO + "        The Art of Sandwiches       " + RESET);
        System.out.println(BREAD + "★・・・・・・★★・・・・・・★★・・・・・・★" + RESET);
        System.out.println();
        System.out.println(CHEESE + "1) New Order" + RESET);
        System.out.println(MEAT + "0) Exit" + RESET);
    }

    // order menu
    public static void showOrderMenu() {
        System.out.println();
        System.out.println("★・・・・・・★ NEW ORDER ★・・・・・・★");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("\nEnter your choice: ");
        System.out.println("\n★・・・・・・★★・・・・・・★★・・・・・・★");
    }

    //
    public static Sandwich buildSandwich(Scanner input) {
        System.out.println("\n-- Add Sandwich --");

        // Size
        System.out.print("Sandwich size (4/8/12 inches): ");
        int size = input.nextInt();
        input.nextLine();

        // Bread
        System.out.print("Bread type (White/Wheat/Rye/Wrap): ");
        String bread = input.nextLine();

        // Meats
        ArrayList<String> meats = new ArrayList<>();
        System.out.println("Enter meats (Ham, Steak, Salami, Chicken, Bacon)");
        String[] meatArr = input.nextLine().split(",");
        for (String m : meatArr) meats.add(m.trim());

        // Cheeses
        ArrayList<String> cheeses = new ArrayList<>();
        System.out.println("Enter cheeses (American, Provolone, Cheddar, Swiss)");
        String[] cheeseArr = input.nextLine().split(",");
        for (String c : cheeseArr) cheeses.add(c.trim());

        // Toppings
        ArrayList<String> toppings = new ArrayList<>();
        System.out.println("Enter toppings (Lettuce, Peppers, Onions, Tomatoes, Jalapeños, Cucumbers, Pickles, Guacamole, Mushrooms) separated by commas:");
        String[] topArr = input.nextLine().split(",");
        for (String t : topArr) toppings.add(t.trim());

        // Sauces
        ArrayList<String> sauces = new ArrayList<>();
        System.out.println("Enter sauces (Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette) separated by commas:");
        String[] sauceArr = input.nextLine().split(",");
        for (String s : sauceArr) sauces.add(s.trim());

        return new Sandwich(size, bread, meats, cheeses, toppings, sauces, true);
    }
}
