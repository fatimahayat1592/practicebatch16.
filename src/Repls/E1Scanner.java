package Repls;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("First number");
        int num1=scanner.nextInt();
        System.out.println("Second number");
        int num2=scanner.nextInt();
         int num3=num1*num2;
        if(num3>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
