package com.bridgelabz.functionalprograms;

public class SumOfThreeIntegers {
    // function to print all triplets in arr[] with sum zero
    static void findTriplets(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Triplet with sum 0 :");
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                        count++;
                    } else {
                        System.out.println("Not Exists");
                    }
                }
            }
        }
        System.out.println("The no. of distinct triple pairs are : " + count);
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        findTriplets(arr, n);
    }
}
