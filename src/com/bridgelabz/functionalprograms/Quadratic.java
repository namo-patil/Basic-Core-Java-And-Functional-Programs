package com.bridgelabz.functionalprograms;

public class Quadratic {
    static void CalculateRoots(int a, int b, int c) {
        // if 'a' is 0 then the equation is not Quadratic
        if (a == 0) {
            System.out.println("The value of a can't be 0");
            return;
        }
        double delta = Math.sqrt(b * b - (4 * a * c));
        double root1 = (-b + delta) / (2 * a);
        double root2 = (-b - delta) / (2 * a);
        System.out.println("Root 1 of x = " + root1 + "\n" + "Root 2 of x = " + root2);

        if (delta > 0) {
            System.out.println("The roots of the equation are Real and Different.");
        } else if (delta == 0) {
            System.out.println("The roots of the equation are Real and Same.");
        } else {
            System.out.println("The roots of the equation are Complex and Different.");
        }
    }

    public static void main(String[] args) {
        //int a = 1, b = 5, c = 2;
        //int a=1, b=2, c=1;
        int a=1, b=1, c=1;
        CalculateRoots(a, b, c);
    }
}
