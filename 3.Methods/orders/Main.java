package com.softUni;

import java.util.Scanner;

public class Main {

    public static double totalPrice(String product, int quantity) {
        double totalAmount = 0;
        if (product.equals("coffee")) {
            totalAmount = 1.50 * quantity;
        } else if (product.equals("water")) {
            totalAmount = 1.00 * quantity;
        } else if (product.equals("coke")) {
            totalAmount = 1.40 * quantity;
        } else if (product.equals("snacks")) {
            totalAmount = 1.40 * quantity;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double result = totalPrice(product, quantity);
        System.out.printf("%.2f", result);
    }
}
