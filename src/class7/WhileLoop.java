package class7;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            System.out.print(i+" ");
            i++;

        }
        i=100;
        System.out.println();
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }
        i=1;
        System.out.println();
        while(i<=20){
            if(i%2==0) {
                System.out.print(i + " ");
            } i++;
        }
        i=20;
        System.out.println();
        while(i>=1){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i--;
        }
        i=20;
        System.out.println();
        while(i<=50){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }
        i=50;
        System.out.println();
        while(i>=20){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i--;
        }


    }
}
