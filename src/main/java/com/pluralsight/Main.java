package com.pluralsight;

import java.util.Scanner;

public class Main {

        // Color code chatgpt inspired
        public static final String RESET = "\u001B[0m";
        public static final String BREAD = "\u001B[33m";   // yellow
        public static final String LETTUCE = "\u001B[92m"; // green
        public static final String TOMATO = "\u001B[91m";  // red
        public static final String CHEESE = "\u001B[93m";  // light yellow
        public static final String MEAT = "\u001B[31m";// dark red

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;

        //keep showing menu
        while (running){
            showHomeScreen();

            System.out.println("n/Enter Your Choice: ");
            int choice = input.nextInt();
            input.nextLine();
        }
    }

}
