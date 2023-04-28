package class13review;

public class Task2 {
    public static void main(String[] args) {
        String str="dfgtrrDFTYFF12345)**^%%";
        int counter=0;
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());

    }
}
