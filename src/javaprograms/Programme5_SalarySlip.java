package javaprograms;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA – PF
 */
public class Programme5_SalarySlip {
    public static void salary() { // input from user
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter Employee Id");
        int id = scn.nextInt();
        System.out.println("Enter Employee Name");
        String name = scn.next();
        System.out.println("Enter Basic Salary");
        double sal = scn.nextDouble();

        double hra = (sal * 0.10);
        double ta = (sal * 0.09); // travel allowance
        double da = (sal * 0.08); // daily allowance
        double pf = (sal * 0.20); // pension fund
        double gross = sal + hra + ta + da - pf;

        System.out.println("|____________________________________________|");
        System.out.println("|                 Salary Slip                |");
        System.out.println("|____________________________________________|");
        System.out.println("|Employee Id        : " + id + "                   |");
        System.out.println("|Employee Name      : " + name + "                    |");
        System.out.println("|____________________________________________|");
        System.out.println("|Basic Salary       : " + sal + "                |");
        System.out.println("|HRA 10%            : " + hra + "                 |");
        System.out.println("|TA 8%              : " + ta + "                 |");
        System.out.println("|DA 9%              : " + da + "                 |");
        System.out.println("|PF -20%            : " + pf + "                 |");
        System.out.println("|____________________________________________|");
        System.out.println("|Gross Salary       : "  +gross+"                |");
        System.out.println("|============================================|");
    }

    public static void main(String[] args) {
        salary(); // static to static direct calling
    }
}
