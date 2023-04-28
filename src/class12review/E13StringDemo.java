package class12review;

public class E13StringDemo {
    public static void main(String[] args) {
        String sentence="Yup we have another class";
        System.out.println(sentence.substring(12,19));
        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex));
    }
}
