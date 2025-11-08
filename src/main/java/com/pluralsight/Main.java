package com.pluralsight;

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

        // Keep showing menu
        while (running) {
            showHomeScreen(); // ✅ Call the method

            System.out.print("\nEnter Your Choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.println("\n🥪 Starting a new order...");
                // TODO: call OrderScreen here later
            } else if (choice == 0) {
                System.out.println("\n👋 Thank you for visiting Stackaholic!");
                running = false;
            } else {
                System.out.println("\n❌ Invalid choice. Please try again.");
            }
        }

        input.close(); // Close scanner to avoid resource leak
    }
     public static void ShowHomeScreen;


