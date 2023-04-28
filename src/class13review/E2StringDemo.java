package class13review;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="weertDFFGHH3345$%^^";
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[a-z0-9]","\\$"));
        char c='A';
        c++;
        for (int i = 0; i <10 ; i++) {
            System.out.println(c++);

        }
    }
}
