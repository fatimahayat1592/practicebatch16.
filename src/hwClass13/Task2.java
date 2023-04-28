package hwClass13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = scan.nextLine();
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
