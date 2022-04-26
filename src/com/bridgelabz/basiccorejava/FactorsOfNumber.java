package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class FactorsOfNumber {
    private static void primeFactors() {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //because 2 is only the even prime factor
        while (num % 2 == 0) {
            System.out.println(2);
            num /= 2;
        }

        for (int i = 3; i <= num / 2; i += 2) {
            //while remainder = 0, then print i and divide num by i
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
        if (num > 2)
            System.out.println(num);
    }

    public static void main(String[] args) {
        primeFactors();
    }
}
