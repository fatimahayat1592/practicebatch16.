package class13review;

public class Math {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    void subtract(int num1,int num2){
        System.out.println(num1-num2);
    }
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    void division(int num1,int num2){
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,20);
        math.subtract(30,10);
        math.multiply(5,5);
        math.division(10,2);
    }
}