package javaprograms;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11_DividedByThreeAndFive {
    //method to find out numbers divided by 3 between 1 to 100
    public void dividedBy3() {
        System.out.println("numbers divided by 3 between 1 to 100");
        for (int i = 1; i < +100; i++) {
            if (i % 3 == 0) ;
            System.out.println(i + " ");
        }
    }

    //method to find out numbers divided by 3 between 1 to 100
    public void dividedBy5() {
        System.out.println("numbers divided by 5 between 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) ;
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Programme11_DividedByThreeAndFive obj = new Programme11_DividedByThreeAndFive(); // creation of object for calling instance method
        obj.dividedBy3();
        obj.dividedBy5();

    }
}



