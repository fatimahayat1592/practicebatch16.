package class4Review;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* 2) You are a loan specialist and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("What is amount of loan");
        int loan=scan.nextInt();
        if(loan<=200000){
            System.out.println("Loan approved");
        }else{
            System.out.println("Rejected");
        }

    }
}
