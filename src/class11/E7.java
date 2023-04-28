package class11;

public class E7 {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==true){
                    count++;
                }

            }


        }
        System.out.println(count);

    }
}