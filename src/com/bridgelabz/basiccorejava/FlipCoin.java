package com.bridgelabz.basiccorejava;

public class FlipCoin {
    private static void flipCoinPercentage(int coinFlip) {
        int headCount = 0;
        int tailCount = 0;
        for (int i = 1; i <= coinFlip; i++) {
            double checkCoinFlip = Math.random() % 2;
            if (checkCoinFlip < 0.5) {
                System.out.println(" Tails ");
                tailCount++;
            } else {
                System.out.println(" Heads");
                headCount++;
            }
        }
        float tailPercentage = ((tailCount * 100) / coinFlip);
        System.out.println("Tail Count Percentage :" + tailPercentage + "%");
        float headPercentage = ((headCount * 100) / coinFlip);
        System.out.println("Head Count Percentage :" + headPercentage + "%");
    }

    public static void main(String[] args) {
        flipCoinPercentage(10);
    }
}
