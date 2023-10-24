package javaprograms;

import java.util.Scanner;

/** 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO” */
public class Programme16_FindPositiveNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter any number");
        int num = scn.nextInt();
        Programme16_FindPositiveNegative obj = new Programme16_FindPositiveNegative();
        //object creation for calling instance method to static method
        obj.positiveNegative(num);
        scn.close(); // closing the scanner object

    }// Method to find out the number is positive, negative or zero
    public void positiveNegative (int num){
        if (num > 0){
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println( num + " is a zero");
        }

    }
}
