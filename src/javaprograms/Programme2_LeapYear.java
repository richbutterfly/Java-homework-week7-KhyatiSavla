package javaprograms;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2_LeapYear {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //scanner object
        System.out.println("Enter a year");
        int year = scn.nextInt();
        Programme2_LeapYear obj = new Programme2_LeapYear(); // object creation for calling instance method to static method
        obj.isLeapYear(year);
        scn.close();
    }
    //for leap year, (year should be divisible by 4) and (divisible by 400) or (not by 100)

    public void isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { // Method to find year is leap or not
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}


