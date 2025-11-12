package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // --- Color codes ---
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

            System.out.print("\nEnter Your Choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.println("\n🥪 Starting a new order...");
                boolean ordering = true;

                while (ordering) {
                    showOrderMenu();

                    int orderChoice = input.nextInt();
                    input.nextLine();

                    if (orderChoice == 1) {
                        Sandwich sandwich = addSandwich(input);
                        System.out.println("\nYou added: " + sandwich);
                    } else if (orderChoice == 2) {
                        System.out.println("You chose to add a drink!");
                    } else if (orderChoice == 3) {
                        System.out.println("You chose to add chips!");
                    } else if (orderChoice == 4) {
                        System.out.println("Checking Out...");
                        ordering = false;
                    } else if (orderChoice == 0) {
                        System.out.println("Cancelling order and going back to home screen");
                        ordering = false;
                    } else {
                        System.out.println("Invalid choice. Try again.");
                    }
                }

            } else if (choice == 0) {
                System.out.println("\n👋 Thank you for visiting Stackaholic!");
                running = false;
            } else {
                System.out.println("\n❌ Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    // --- Home screen ---
    public static void showHomeScreen() {
        System.out.println();
        System.out.println(BREAD + "★・・・・・・★★・・・・・・★★・・・・・・★" + RESET);
        System.out.println(LETTUCE + "      STACKAHOLIC SANDWICHES        " + RESET);
        System.out.println(TOMATO + "        The Art of Sandwiches       " + RESET);
        System.out.println(BREAD + "★・・・・・・★★・・・・・・★★・・・・・・★" + RESET);
        System.out.println();
        System.out.println(CHEESE + "1) New com.pluralsight.Order" + RESET);
        System.out.println(MEAT + "0) Exit" + RESET);
    }

    // --- com.pluralsight.Order menu ---
    public static void showOrderMenu() {
        System.out.println();
        System.out.println("★・・・・・・★ NEW ORDER ★・・・・・・★");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add com.pluralsight.Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel com.pluralsight.Order");
        System.out.print("\nEnter your choice: ");
    }

    // --- Add Sandwich Method ---
    public static Sandwich addSandwich(Scanner input) {
        System.out.println("\n-- Add Sandwich --");

        // Size
        System.out.println("Choose sandwich size:");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");
        System.out.print("Enter Choice: ");
        int sizeChoice = input.nextInt();
        input.nextLine();

        int size = 4;
        if (sizeChoice == 2) size = 8;
        else if (sizeChoice == 3) size = 12;

        // Bread
        System.out.println("\nChoose bread type:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        int breadChoice = input.nextInt();
        input.nextLine();

        String breadType = "White";
        if (breadChoice == 2) breadType = "Wheat";
        else if (breadChoice == 3) breadType = "Rye";
        else if (breadChoice == 4) breadType = "Wrap";

        // Meats
        ArrayList<String> meats = new ArrayList<>();
        System.out.println("\nChoose meats (type 0 when done):");
        System.out.println("1) Ham");
        System.out.println("2) Steak");
        System.out.println("3) Salami");
        System.out.println("4) Chicken");
        System.out.println("5) Bacon");

        boolean addingMeats = true;
        while (addingMeats) {
            System.out.print("Enter number or 0 to finish: ");
            int meatChoice = input.nextInt();
            input.nextLine();

            switch (meatChoice) {
                case 0 -> addingMeats = false;
                case 1 -> meats.add("Ham");
                case 2 -> meats.add("Steak");
                case 3 -> meats.add("Salami");
                case 4 -> meats.add("Chicken");
                case 5 -> meats.add("Bacon");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        // Cheeses
        ArrayList<String> cheeses = new ArrayList<>();
        System.out.println("\nChoose cheeses (type 0 when done):");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");

        boolean addingCheeses = true;
        while (addingCheeses) {
            System.out.print("Enter number or 0 to finish: ");
            int cheeseChoice = input.nextInt();
            input.nextLine();

            switch (cheeseChoice) {
                case 0 -> addingCheeses = false;
                case 1 -> cheeses.add("American");
                case 2 -> cheeses.add("Provolone");
                case 3 -> cheeses.add("Cheddar");
                case 4 -> cheeses.add("Swiss");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        // Regular Toppings
        ArrayList<String> toppings = new ArrayList<>();
        System.out.println("\nChoose regular toppings (type 0 when done):");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalapeños");
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushrooms");

        boolean addingToppings = true;
        while (addingToppings) {
            System.out.print("Enter number or 0 to finish: ");
            int toppingChoice = input.nextInt();
            input.nextLine();

            switch (toppingChoice) {
                case 0 -> addingToppings = false;
                case 1 -> toppings.add("Lettuce");
                case 2 -> toppings.add("Peppers");
                case 3 -> toppings.add("Onions");
                case 4 -> toppings.add("Tomatoes");
                case 5 -> toppings.add("Jalapeños");
                case 6 -> toppings.add("Cucumbers");
                case 7 -> toppings.add("Pickles");
                case 8 -> toppings.add("Guacamole");
                case 9 -> toppings.add("Mushrooms");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        // Sauces
        ArrayList<String> sauces = new ArrayList<>();
        System.out.println("\nChoose sauces (type 0 when done):");
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) Ketchup");
        System.out.println("4) Ranch");
        System.out.println("5) Thousand Islands");
        System.out.println("6) Vinaigrette");

        boolean addingSauces = true;
        while (addingSauces) {
            System.out.print("Enter number or 0 to finish: ");
            int sauceChoice = input.nextInt();
            input.nextLine();

            switch (sauceChoice) {
                case 0 -> addingSauces = false;
                case 1 -> sauces.add("Mayo");
                case 2 -> sauces.add("Mustard");
                case 3 -> sauces.add("Ketchup");
                case 4 -> sauces.add("Ranch");
                case 5 -> sauces.add("Thousand Islands");
                case 6 -> sauces.add("Vinaigrette");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        // Toasted
        System.out.print("\nWould you like it toasted? (yes/no): ");
        boolean toasted = input.nextLine().equalsIgnoreCase("yes");

        // Create and return sandwich
        return new Sandwich(size, breadType, meats, cheeses, toppings, sauces, toasted);
    }
    public static Drink addDrink(Scanner input) {
        System.out.println("\n-- Add Drink --");

        System.out.println("Choose size:");
        System.out.println("1) Small ($2.00)");
        System.out.println("2) Medium ($2.50)");
        System.out.println("3) Large ($3.00)");
        System.out.print("Enter choice: ");
        int sizeChoice = input.nextInt();
        input.nextLine();

        String size = "Small";
        if (sizeChoice == 2) size = "Medium";
        else if (sizeChoice == 3) size = "Large";

        System.out.println("Choose flavor:");
        System.out.println("1) Coke");
        System.out.println("2) Sprite");
        System.out.println("3) Lemonade");
        System.out.println("4) Iced Tea");
        System.out.print("Enter choice: ");
        int flavorChoice = input.nextInt();
        input.nextLine();

        String flavor = "Coke";
        if (flavorChoice == 2) flavor = "Sprite";
        else if (flavorChoice == 3) flavor = "Lemonade";
        else if (flavorChoice == 4) flavor = "Iced Tea";

        Drink drink = new Drink(size, flavor);
        System.out.println("You added: " + drink);

        return drink;
    }

}
