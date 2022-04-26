package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {
    private static final int x1 = 0;
    private static final int y1 = 0;

    private static void calEuclideanDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of coordinate-x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter value of coordinate-y2: ");
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Euclidean distance from the point (" + x2 + "," + y2 + ") to the origin (0,0) = " + distance);
    }

    public static void main(String[] args) {
        calEuclideanDistance();
    }
}
