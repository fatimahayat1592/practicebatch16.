package Repls;

import java.util.Scanner;

public class ScannerIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny=sc.nextBoolean();
        if(isSunny){
            System.out.println("It is sunny day, i should go somewhere");
        }else if(!isSunny){
            System.out.println("I stay home and practice Java");
        }
        System.out.println("What is temp outside");
        int temp=sc.nextInt();
        if(isSunny){
            if(temp>85){
                System.out.println("I am going beach");
            }else{
                System.out.println("I am going park");
            }
        }





        }
    }


