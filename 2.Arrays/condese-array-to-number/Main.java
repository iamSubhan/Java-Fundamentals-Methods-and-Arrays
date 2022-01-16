package com.softUni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        //Get user input for array
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
        } else {
            while (numbers.length != 1) {
                //create a new int array for the condensed
                int[] condensed = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                }
                numbers = condensed;
            }
            System.out.println(numbers[0]);
        }
    }
}
