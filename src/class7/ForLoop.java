package class7;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i =100 ; i>=1 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=20 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 20; i >=1 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 20; i <=50 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 50; i >=20 ; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }

    }
}
