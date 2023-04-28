package class8;

public class E5WhileAndLoop {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 85;
        while (summer) {
            if ( temp < 100) {
                System.out.println("good day");
            } else {
                System.out.println("Hot day");
                break;
            }
            temp=temp+3;


        }
    }
}