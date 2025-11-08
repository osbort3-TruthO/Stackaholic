package com.pluralsight;

import java.util.Scanner;

public class Main {

    // Color codes I asked Chatgpt
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
                        System.out.println("You chose to add a sandwich \uD83E\uDD6A");//chatGpt sandwich emoji code
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
                } // ✅ Close while(ordering)

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

    public static Sandwich addSandwich(Scanner input) {
        System.out.println("\n-- Add Sandwich --");
        System.out.println("Choose sandwich size");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");
        System.out.println("Enter Choice");
        int sizeChoice = input.nextInt();
        input.nextLine();

        int size = 4;
        if (sizeChoice == 2) size = 8;
        else if (sizeChoice == 3) size = 12;
    }

}
