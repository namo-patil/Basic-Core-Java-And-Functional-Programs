package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
    static void WindChillTemperature(double Temperature, double Velocity) {
        double WindChill = 35.74 + (0.6215 * Temperature) + (((0.4275 * Temperature) - 35.75) * Math.pow(Velocity, 0.16));
        System.out.println("The effective Temperature for Wind Chill is " + WindChill);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature (<=50'F) :");
        double Temperature = scanner.nextDouble();
        System.out.println("Enter Wind Velocity (between range 3 to 120 in miles per hour) :");
        double Velocity = scanner.nextDouble();
        WindChillTemperature(Temperature, Velocity);
    }
}
