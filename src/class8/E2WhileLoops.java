package class8;

import java.util.Scanner;

public class E2WhileLoops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number");
        int number=scanner.nextInt();
        while(number!=-1){
            System.out.println("Hello world");
            number=scanner.nextInt();
        }
    }
}
