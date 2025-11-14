package com.pluralsight.service;

import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Chips;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Order {

    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;

    // --- Add sandwich to order ---
    public void addSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    // --- Add drink ---
    public void addDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWould you like a drink? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter drink flavor (cola, lemonade, water): ");
            String flavor = scanner.nextLine();

            System.out.print("Enter size (small, medium, large): ");
            String size = scanner.nextLine();

            double price = switch (size.toLowerCase()) {
                case "medium" -> 2.50;
                case "large" -> 3.00;
                default -> 2.00;
            };

            drink = new Drink(size, flavor, price);
        }
    }

    // Add chips
    public void addChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWould you like chips? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter chip type (Plain, BBQ, Doritos, Hot Crunchy Curls): ");
            String type = scanner.nextLine();
            chips = new Chips(type, 1.50);
        }
    }

    //Print receipt
    public void printReceipt() {
        System.out.println("\n----- Your Order -----");

        if (sandwich != null) System.out.println(sandwich);
        if (drink != null)
            System.out.printf("Drink: %s (%s) $%.2f\n", drink.getFlavor(), drink.getSize(), drink.getPrice());
        if (chips != null)
            System.out.printf("Chips: %s $%.2f\n", chips.getType(), chips.getPrice());

        double total = 0;
        if (sandwich != null) total += sandwich.getPrice();
        if (drink != null) total += drink.getPrice();
        if (chips != null) total += chips.getPrice();

        System.out.printf("----------------------\nTotal: $%.2f\n", total);
    }

    // my receipt
    public void saveReceiptToFile() {
        try {
            File folder = new File("receipts");
            if (!folder.exists()) folder.mkdir();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = "receipts/" + LocalDateTime.now().format(formatter) + ".txt";

            FileWriter writer = new FileWriter(fileName);
            writer.write("----- Your Order -----\n");

            if (sandwich != null) writer.write(sandwich + "\n");
            if (drink != null)
                writer.write(String.format("Drink: %s (%s) $%.2f\n",
                        drink.getFlavor(), drink.getSize(), drink.getPrice()));
            if (chips != null)
                writer.write(String.format("Chips: %s $%.2f\n",
                        chips.getType(), chips.getPrice()));

            double total = 0;
            if (sandwich != null) total += sandwich.getPrice();
            if (drink != null) total += drink.getPrice();
            if (chips != null) total += chips.getPrice();

            writer.write(String.format("----------------------\nTotal: $%.2f\n", total));
            writer.close();

            System.out.println("✔ Receipt saved to " + fileName);

        } catch (IOException e) {
            System.out.println("❌ Error saving receipt: " + e.getMessage());
        }
    }
}
