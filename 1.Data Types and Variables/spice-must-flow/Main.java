package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int extract = 0;
        int days = 0;

        while (yield >= 100) {
            extract += yield - 26;
            yield -= 10;
            days++;
        }
        extract -= 26;
        System.out.println(days);
        System.out.println(extract);
    }
}
