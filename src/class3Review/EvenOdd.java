package class3Review;

public class EvenOdd {
    public static void main(String[] args) {
       /* Write a program to check whether number is positive or negative.
                Write a Java Program to check whether number is Even or Odd.*/
        int num=13;
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        num=-2;
        if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("Negative");
        }

    }
}
