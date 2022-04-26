package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows length ");
        int row = scanner.nextInt();
        System.out.println("Enter columns length ");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter " + row * column + " Elements to store in Array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        //Prints elements in an array
        System.out.println("Elements in 2D Array are :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("array[" + i + "][" + j + "]: " + array[i][j]);
            }
            System.out.println();
        }
    }
}
