package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x, y and z :");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if ((x > y) && (x > z)) {
            System.out.println(x + " is the largest among three number");
        } else if ((y > z) && (y > x)) {
            System.out.println(y + " is the largest among three number");
        } else {
            System.out.println(z + " is the largest among three number");
        }
    }
}
