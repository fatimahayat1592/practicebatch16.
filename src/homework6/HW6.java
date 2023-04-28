package homework6;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a grade");
        String grade=scan.nextLine();
        switch (grade){
            case("A"):
                System.out.println("Excellent");
                break;
            case("B"):
                System.out.println("Good");
            case("C"):
                System.out.println("average");
                    break;
            case("D"):
                System.out.println("Bad");
                break;
                }

        }
    }

