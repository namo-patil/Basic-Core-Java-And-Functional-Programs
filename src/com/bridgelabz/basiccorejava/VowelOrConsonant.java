package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character :");
        char character = scanner.next().charAt(0);
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(character + " is Vowel");
                break;
            default:
                System.out.println(character + " is Consonant");
        }
    }
}
