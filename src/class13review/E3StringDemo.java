package class13review;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="dfgdgghUYTRYUI12468%^&%$";
        System.out.println(str.replaceAll("[^a-z0-9]",""));

    }
}
