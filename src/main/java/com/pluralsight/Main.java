package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Color codes
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
                } // Close while(ordering)

            } else if (choice == 0) {
                System.out.println("\n👋 Thank you for visiting Stackaholic!");
                running = false;
            } else {
                System.out.println("\n❌ Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    // Home screen
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

    // Order menu
    public static void showOrderMenu() {
        System.out.println();
        System.out.println("★・・・・・・★ NEW ORDER ★・・・・・・★");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("\nEnter your choice: ");
    }

    // Add Sandwich method
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

            if (meatChoice == 0) {
                addingMeats = false;
            } else if (meatChoice == 1) {
                meats.add("Ham");
                System.out.println("Ham added!");
            } else if (meatChoice == 2) {
                meats.add("Steak");
                System.out.println("Steak added!");
            } else if (meatChoice == 3) {
                meats.add("Salami");
                System.out.println("Salami added!");
            } else if (meatChoice == 4) {
                meats.add("Chicken");
                System.out.println("Chicken added!");
            } else if (meatChoice == 5) {
                meats.add("Bacon");
                System.out.println("Bacon added!");
            } else {
                System.out.println("Invalid choice. Try again.");
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

            if (cheeseChoice == 0) {
                addingCheeses = false;
            } else if (cheeseChoice == 1) {
                cheeses.add("American");
                System.out.println("American cheese added!");
            } else if (cheeseChoice == 2) {
                cheeses.add("Provolone");
                System.out.println("Provolone cheese added!");
            } else if (cheeseChoice == 3) {
                cheeses.add("Cheddar");
                System.out.println("Cheddar cheese added!");
            } else if (cheeseChoice == 4) {
                cheeses.add("Swiss");
                System.out.println("Swiss cheese added!");
            } else {
                System.out.println("Invalid choice. Try again.");
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

            if (toppingChoice == 0) {
                addingToppings = false;
            } else if (toppingChoice == 1) toppings.add("Lettuce");
            else if (toppingChoice == 2) toppings.add("Peppers");
            else if (toppingChoice == 3) toppings.add("Onions");
            else if (toppingChoice == 4) toppings.add("Tomatoes");
            else if (toppingChoice == 5) toppings.add("Jalapeños");
            else if (toppingChoice == 6) toppings.add("Cucumbers");
            else if (toppingChoice == 7) toppings.add("Pickles");
            else if (toppingChoice == 8) toppings.add("Guacamole");
            else if (toppingChoice == 9) toppings.add("Mushrooms");
            else System.out.println("Invalid choice. Try again.");
        }

        // Create the sandwich object
        Sandwich sandwich = new Sandwich(size, breadType, meats, toppings, cheeses, true);
        return sandwich;
    }
}
