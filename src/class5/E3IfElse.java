package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if(age<18){
            System.out.println("You will not drive");
        }else {
            System.out.println("You will drive");
        }

    }
}
