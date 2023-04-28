package class10;

public class E5 {
    public static void main(String[] args) {


        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 12, 13, 14},
                {12, 22, 23, 24}
        };
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
}