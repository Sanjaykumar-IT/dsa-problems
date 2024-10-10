package com.java.main;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            String binary = Integer.toBinaryString(n);
            System.out.println("Binary form of " + n + " is: " + binary);
        }
        
        scanner.close();
    }
}
