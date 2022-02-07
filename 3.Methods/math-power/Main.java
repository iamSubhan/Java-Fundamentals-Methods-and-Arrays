package com.softUni;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static BigDecimal getPower(BigDecimal number, int power) {
        number = number.pow(power);
        return number;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal number = new BigDecimal(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(getPower(number,power));
    }
}
