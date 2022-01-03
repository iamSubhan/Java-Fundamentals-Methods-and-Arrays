package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }

        /* In normal order
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }*/
    }
}
