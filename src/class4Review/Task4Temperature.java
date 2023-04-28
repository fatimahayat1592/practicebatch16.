package class4Review;

import java.util.Scanner;

public class Task4Temperature {
    public static void main(String[] args) {
      /*  Your program should convert Fahrenheit into celsius and print “The temperature is
        the city  is ”*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your city");
        String city=scan.nextLine();
        System.out.println("Enter temperature");
        int fahrenheit=scan.nextInt();
        int celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature of the city "+city+" is "+celsius);

    }
}
