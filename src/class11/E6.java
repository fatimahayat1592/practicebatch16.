package class11;

public class E6 {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                count=count+arr[i][j];

            }
            System.out.println(count+" ");
            count=0;
        }
        for (int[] ints : arr) {
            int sum=0;
            for (int anInt : ints) {
                sum=sum+anInt;

            }
            System.out.println("sum = " + sum);
            sum=0;
        }
    }
}
