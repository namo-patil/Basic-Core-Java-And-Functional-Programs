package com.bridgelabz.basiccorejava;

public class HarmonicNumber {
    public static void nthHarmonicNumber(int N) {
        float harmonicValue = 0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += (float) 1 / i;
            System.out.println("H" + i + " : " + harmonicValue);
        }
    }

    public static void main(String[] args) {
        nthHarmonicNumber(10);
    }
}
