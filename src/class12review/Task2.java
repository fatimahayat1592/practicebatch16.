package class12review;

public class Task2 {
    public static void main(String[] args) {
        //position of a
        String sentence="Today is sunday";

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)=='a'){
               System.out.print(i+" ");
                System.out.println(sentence.charAt(i));
            }

        }
    }
}
