package class13review;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="Today is sunday. we have java classe love java";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
