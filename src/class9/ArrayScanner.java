package class9;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        int [] number=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<number.length; i++){
            number[i]=scanner.nextInt();
        }
        for(int i=5; i>number.length; i--){
            System.out.println(number[i]);
        }
    }
}
