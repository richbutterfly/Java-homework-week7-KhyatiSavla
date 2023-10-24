package javaprograms;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7_SalesCommission {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner object
        System.out.println("Enter Sales ID"); // input from user
        int id = scn.nextInt();
        System.out.println("Enter Seller's name");
        String name = scn.next();
        System.out.println("Enter Sales amount");
        double sm = scn.nextDouble();
        System.out.println("Enter salary basic");
        int sb = scn.nextInt();
        double a = 0;
        if (sm >= 50000) {
            a = (sm * 0.35);
        } else if (sm >= 30000 && sm < 49999) {
            a = (sm * 0.20);
        } else if (sm >= 20000 && sm < 29999) {
            a = (sm * 0.10);
        } else if (sm >= 10000 && sm < 19999) {
            a = (sm * 0.05);
        } else if (sm < 10000) {
            a = (sm * 0.02);
        }
        System.out.println("commission: " + a);
        scn.close(); // scanner close
    }

}
