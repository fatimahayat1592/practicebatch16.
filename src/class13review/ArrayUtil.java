package class13review;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] arr1 = {12, 32, 435, 899};
        int[] arr2 = {120, 340, 566, 668};
        int number = 30;
        int number1 = 10;
        int number2 = 10;
        ArrayUtil a=new ArrayUtil();
        a.searchArray(arr,number);
    }
        void searchArray(int[]arr, int number){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==number){
                    System.out.println("yes");
                    break;
                }
            }


        }
    }

