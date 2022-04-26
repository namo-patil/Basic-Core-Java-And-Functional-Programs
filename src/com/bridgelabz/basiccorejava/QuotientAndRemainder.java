package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        QuotientAndRemainder object = new QuotientAndRemainder();
        object.computeQuotientRemainder();
    }

    public void computeQuotientRemainder() {
        int divisor, dividend;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Divisor:");
        divisor = scanner.nextInt();
        System.out.println("Enter Dividend:");
        dividend = scanner.nextInt();
        int quotient = divisor / dividend;
        int remainder = divisor % dividend;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
