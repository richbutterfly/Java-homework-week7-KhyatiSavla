package javaprograms;

import java.util.Arrays;

//17. Write a Java program to sort a numeric array and a string array.
public class Programme17_SortArray {
    public static void intArray() { // method to sort integer array
        int[] ar = {4, -2, 8, 67, -15, 608};
        System.out.print("The Original Integer array is: ");
        for (int num : ar) { //for loop to print the array
            System.out.print(num + " ");
        }
        Arrays.sort(ar);
        System.out.print("\nThe Sorted Integer array is: ");
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }

    public static void stringArray() { // method to sort string array
        String[] ar = {"Java", "C++", "Python", "Analysis", "Manual", "Automation"};
        System.out.print("\n\nThe Original String array is: ");
        for (String num : ar) {
            System.out.print(num + " ");
        }
        Arrays.sort(ar);
        System.out.print("\nThe sorted String array is: ");
        for (String num : ar) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) { // main method where both the methods are called
        intArray();
        stringArray();
    }
}
