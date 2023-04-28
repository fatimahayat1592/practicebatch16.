package class13review;

public class Task1 {
    public static void main(String[] args) {
        String word="hello";
        if(!word.isEmpty() && word.length()%2==1 && word.length()>=3 ){
            int middleWord=word.length()/2;
            char middlrChar=word.charAt(middleWord);
            System.out.println(middlrChar);
        }
    }
}
