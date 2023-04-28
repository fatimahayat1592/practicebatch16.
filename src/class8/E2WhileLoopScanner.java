package class8;

import java.util.Scanner;

public class E2WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter start and end number");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int number=start;
        while(number<=end){
            System.out.print(number+" ");
            number++;
        }
    }
}
