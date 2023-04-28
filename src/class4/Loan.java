package class4;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What amount of loan is needed");
        int amount= scan.nextInt();
        if(amount<=2000000){
            System.out.println("You will lend the money");
        }else{
            System.out.println("Sorry! you will be rejected");
        }

    }
}
