package javaprograms;

import java.util.Scanner;

public class Programme4_NumbersOfDaysInMonth {
    /**
     * Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * If the parameter is not in that range return false.
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
     * otherwise return false.
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     */
    public static boolean isLeapYear(int year) { // method to find out leap year
        System.out.println("In-side is a leap year Method");
        if ((year >= 1 && year <= 9999)) { // Method to find out leap year
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static int getDaysInMonth(int m, int y) { // Method to get days of the month of entered year and month
        System.out.println("In-side getDaysInMonth Method");
        boolean leapYear = isLeapYear(y);
        if ((m >= 1 && m <= 12) && (y >= 1 && y <= 9999)) {
            if (leapYear) {
                switch (m) {
                    case 1:
                    case 3:
                    case 7:
                    case 5:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 29;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            } else {
                switch (m) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 1;
                }
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter a year");
        int year = scn.nextInt();
        System.out.println("Enter a month");
        int month = scn.nextInt();

        boolean a = isLeapYear(year);
        int days = getDaysInMonth(month, year);
        System.out.println(days);
        scn.close(); // closing scanner
    }
}