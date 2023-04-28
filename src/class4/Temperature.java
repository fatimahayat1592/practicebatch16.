package class4;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name of city");
        String city=scan.nextLine();
        System.out.println("What is temperature in city");
        double fahrenheit=scan.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in " +city+ " is " +celsius+" celsius degree");

    }
}
