package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2 :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("-----Before Swap-----");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int temporary = num1;
        num1 = num2;
        num2 = temporary;

        System.out.println("-----After Swap-----");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
