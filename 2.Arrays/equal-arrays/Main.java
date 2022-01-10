package com.softUni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        //Getting values for first array
        String[] stringsFirst = scanner.nextLine().split(" ");
        int[] numbersFirst = new int[stringsFirst.length];

        //Getting values for second array
        String[] stringsSecond = scanner.nextLine().split(" ");
        int[] numbersSecond = new int[stringsSecond.length];

        //Initialise sum
        int sum = 0;

        //Parsing the values into both int arrays
        for (int i = 0; i < stringsFirst.length; i++) {
            numbersFirst[i] = Integer.parseInt(stringsFirst[i]);
            numbersSecond[i] = Integer.parseInt(stringsSecond[i]);

            //Comparing the 2 arrays
            if (numbersFirst[i] != numbersSecond[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return; //return keyword to stop program
            }

            //Else you will add the digits together
            sum += numbersFirst[i];
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
