package class10;

public class E3 {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,30,40},
                {11,12,13,14},
                {12,22,23,24}
        };
        for (int i = 0; i < 3; i++) {
            int[] arr1=matrix[i];
            for (int j = 0; j <arr1.length ; j++) {
                System.out.print(arr1[j]+" ");

            }
            System.out.println();

        }
    }
}
