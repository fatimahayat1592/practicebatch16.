package class13review;

public class E5StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java class");
        System.out.println(str.reverse());
        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);
        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);
    }
}
