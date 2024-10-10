package com.java.main;
public class MissingNumberFinder {
    public static void main(String[] args) {
//        int[] numbers = {-3, -2, -1, 1, 2}; 
    	int[] numbers = {1, 2, 4, 5}; 
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber); 
    }

    public static int findMissingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

    
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

   
        int n = max - min + 1; 
        int expectedSum = (min + max) * n / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num; 
        }

        int missingNumber = expectedSum - actualSum; 

       
        return (missingNumber >= min && missingNumber <= max) ? missingNumber : -1;
    }
}
