package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it time for break enter true/false");
        boolean ifBreak=scanner.nextBoolean();
        if((ifBreak)){
            System.out.println("Lets break");
        }else{
            System.out.println("Continue class");
        }

    }
}
