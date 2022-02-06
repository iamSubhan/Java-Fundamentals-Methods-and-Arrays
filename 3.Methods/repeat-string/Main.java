package com.softUni;

import java.util.Scanner;

public class Main {

    public static String repeater(String input, int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += input;
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeater(input,n));

    }
}
