package homework6;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Quiz score");
        int quiz=scan.nextInt();
        System.out.println("Mid term");
        int midTerm=scan.nextInt();
        System.out.println("Final term");
        int finalTerm=scan.nextInt();
        int averageScore=(quiz+midTerm+finalTerm)/3;
        if(averageScore>=90){
            System.out.println("grade A ");
        }else if(averageScore>=70 && averageScore<=90){
            System.out.println("grade B");
        }else if(averageScore>=50 && averageScore<=70){
            System.out.println("grade C");
        }else if(averageScore<50){
            System.out.println("grade F");
        }

    }
}
