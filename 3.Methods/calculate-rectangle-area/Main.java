package com.softUni;

import java.util.Scanner;

public class Main {

    public static int getArea(int width, int length) {
        return width * length;
    }

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(System.in);
        int area = getArea(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(area);
    }
}
