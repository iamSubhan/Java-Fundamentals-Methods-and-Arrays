package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagon = new int[n];
        int sum = 0;

        for (int i = 0; i < wagon.length; i++) {
            wagon[i] = Integer.parseInt(scanner.nextLine());
            sum += wagon[i];
        }

        for (int i = 0; i < wagon.length; i++) {
            System.out.print(wagon[i] + " ");
        }
        System.out.printf("%n%d", sum);
    }
}
