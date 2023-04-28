package homework6;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scan.next();
        if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("Spring");
        }else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("Summer");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("Fall");
        }else if(month.equals("December") || month.equals("January") || month.equals("February")){
            System.out.println("Winter");
        }else{
            System.out.println("Incorrect");
        }
    }
}
