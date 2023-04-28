package homework6;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scan.next();
        switch (country){
            case("Pakistan"):
                System.out.println("You speak urdu");
                break;
                case ("Italy"):
                    System.out.println("You speak italian");
                    break;


        }
    }
}
