package javaprograms;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme3_MarkSheet {

    public static void main(String[] args) {
        markSheet(); // static to static direct calling
    }

    public static void markSheet() { // input from user in main method using scanner object
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Full name");
        String name = scn.nextLine();
        System.out.println("Enter Roll number");
        int roll = scn.nextInt();
        System.out.println("Enter Math marks");
        int m1 = scn.nextInt();
        System.out.println("Enter Science marks");
        int s1 = scn.nextInt();
        System.out.println("Enter English marks");
        int e1 = scn.nextInt();
        scn.close();

        if (m1 < 0 || m1 > 100) { // checking marks are valid or not
            System.out.println("Invalid input, Marks should between 0 to 100 ");
        } else if (s1 < 0 || s1 > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
        } else if (e1 < 0 || e1 > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
        } else {
            int t1 = m1 + s1 + e1; // counting sum
            double per = t1 / 3; // counting percentage
            String gr = ""; // grade
            String result = " "; // final result
            if (per >= 80 && per <= 100)
                gr = "A+";
            else if (per >= 60 && per <= 79)
                gr = "A";
            else if (per >= 50 && per <= 59)
                gr = "B";
            else if (per >= 35 && per <= 49)
                gr = "C";
            if (per < 35) {
                result = "Fail";
            } else {
                result = "Pass";
            }
            //printing mark sheet according to all conditions
            System.out.println("-----------------------------------");
            System.out.println("|                                 |");
            System.out.println("|           Mark Sheet            |  ");
            System.out.println("|                                 |  ");
            System.out.println("-----------------------------------");
            System.out.println("|    Name       : " + name + "             |");
            System.out.println("|    Roll No    : " + roll + "               | ");
            System.out.println("|---------------------------------|");
            System.out.println("|    Subject    : Marks           | ");
            System.out.println("|---------------------------------|");
            System.out.println("|    Math       : " + m1 + "              |");
            System.out.println("|    Science    : " + s1 + "              |");
            System.out.println("|    English    : " + e1 + "              |");
            System.out.println("-----------------------------------");
            System.out.println("|    Total      : " + t1 + "             |");
            System.out.println("-----------------------------------");
            System.out.println("|    Percentage : " + per + "            |");
            System.out.println("|    Result     : " + result + "            |");
            System.out.println("|    Grade      : " + gr + "              |");
            System.out.println("|---------------------------------|");
        }

    }
}




