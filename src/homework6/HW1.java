package homework6;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day");
        int day=scan.nextInt();
        if(day>=1 && day<=5){
            System.out.println("Week day");
        }else if(day==6 || day==7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
