package com.java.main;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 25, 10, 12, 13, 4, 12};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the result
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        
        // Convert HashSet back to array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
