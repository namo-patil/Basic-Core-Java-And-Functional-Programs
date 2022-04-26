package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class LeapYear {
    private static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 digit number :");
        int number = scanner.nextInt();
        if (((number % 4 == 0) && (number % 100 != 0)) || (number % 400 == 0)) {
            System.out.println(number + " is a leap year");
        } else {
            System.out.println(number + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        checkLeapYear();
    }
}
