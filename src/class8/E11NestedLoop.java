package class8;

public class E11NestedLoop {
    public static void main(String[] args) {
        int num=0;
        while(num<4){
            for (int i = 2; i <=10 ; i=i+2) {
                System.out.print(i+" ");
            }
            System.out.println();
            num++;
        }
    }
}
