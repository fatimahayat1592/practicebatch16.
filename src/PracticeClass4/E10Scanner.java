package PracticeClass4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you hungry enter true/false ");
        boolean hungry=scan.nextBoolean();
        if(hungry){
            System.out.println("Pizza");
        }else{
            System.out.println("Study");
        }

    }
}
