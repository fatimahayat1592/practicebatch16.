package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        int num=1;
        while(num<=100){
            System.out.print(num+" ");
            num++;
        }
        num=20;
        System.out.println();
        while(num<=100){
            if(num%2==0) {
                System.out.print(num + " ");
            }
            num++;
        }
        num=100;
        System.out.println();
        while(num>=1){
            if(num%2!=0){
                System.out.print(num+" ");
            }
            num--;
        }
    }
}
