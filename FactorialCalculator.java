package com.java.main;
import java.util.Scanner;

public class FactorialCalculator {


    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        System.out.println("Factorial of " + number + " is " + result);
    }
}
