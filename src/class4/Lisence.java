package class4;

import java.util.Scanner;

public class Lisence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Driver lisence");

        } else {
            System.out.println("Learner permit");
        }
    }
}